package com.egg.biblioteca.servicios;

import com.egg.biblioteca.entidades.*;
import com.egg.biblioteca.enums.Rol;
import com.egg.biblioteca.excepciones.MiExcepcion;
import com.egg.biblioteca.repositorios.UsuarioRepositorio;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServicio implements UserDetailsService {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Autowired
    private ImagenServicio imagenServicio;

    public void registrar(MultipartFile archivo, String nombre, String email, String password, String password2) throws MiExcepcion {

        validar(nombre, email, password, password2);

        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setEmail(email);

        usuario.setPassword(new BCryptPasswordEncoder().encode(password));

        usuario.setRol(Rol.USER);

        Imagen imagen = imagenServicio.guardar(archivo);

        usuario.setImagen(imagen);

        usuarioRepositorio.save(usuario);
    }

    public void actualizar(MultipartFile archivo, String idUsuario, String nombre, String email, String password, String password2) throws MiExcepcion {

        validar(nombre, email, password, password2);

        Optional<Usuario> respuestaUsuario = usuarioRepositorio.findById(idUsuario);

        if(respuestaUsuario.isPresent()) {

            Usuario usuario = respuestaUsuario.get();

            usuario.setNombre(nombre);
            usuario.setEmail(email);

            usuario.setPassword(new BCryptPasswordEncoder().encode(password));

            usuario.setRol(Rol.USER);

            // --------------------

            String idImagen = null;

            if (usuario.getImagen() != null) {
                idImagen = usuario.getImagen().getId();
            }

            Imagen imagen = imagenServicio.actualizar(archivo, idImagen);

            usuario.setImagen(imagen);

            usuarioRepositorio.save(usuario);
        }

    }

    public Usuario listarPorId(String id) {
        return usuarioRepositorio.getReferenceById(id);
    }

    public List<Usuario> listarUsuarios() {
        return usuarioRepositorio.findAll();
    }

    public void validar(String nombre, String email, String password, String password2) throws MiExcepcion {

        if (usuarioRepositorio.buscarPorEmail(email) != null) {
            throw new MiExcepcion("El email ingresado ya esta registrado!");
        }
        if (nombre.isEmpty() || nombre == null) {
            throw new MiExcepcion("El nombre no puede ser nulo o estar vacio.");
        }
        if (email.isEmpty() || email == null) {
            throw new MiExcepcion("El email no puede ser nulo o estar vacio.");
        }
        if (password.isEmpty() || password == null) {
            throw new MiExcepcion("La contraseña no puede ser nulo o estar vacio.");
        }
        if (!password.equals(password2)) {
            throw new MiExcepcion("Las contraseñas ingresadas deben ser iguales.");
        }

    }

    @Override
    public UserDetails loadUserByUsername(String email) {
        Usuario usuario = usuarioRepositorio.buscarPorEmail(email);
        if(usuario != null) {

            List<GrantedAuthority> permisos = new ArrayList<>();

            GrantedAuthority p = new SimpleGrantedAuthority("ROLE_"+usuario.getRol().toString()); // ROLE_USER

            permisos.add(p);

//            Utilizamos los atributos que nos otorga el pedido al servlet, para poder guardar la
//            información de nuestra HttpSession.
            ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
            HttpSession session = attr.getRequest().getSession(true);

            session.setAttribute("usuariosession", usuario);

            return new User(usuario.getEmail(),usuario.getPassword(),permisos);

        } else {
            return null;
        }
    }

    public void cambiarRol(String idUsuario) {

        Optional<Usuario> respuestaUsuario = usuarioRepositorio.findById(idUsuario);

        if(respuestaUsuario.isPresent()) {

            Usuario usuario = respuestaUsuario.get();

            if(usuario.getRol().equals(Rol.USER)) {
                usuario.setRol(Rol.ADMIN);
            } else if(usuario.getRol().equals(Rol.ADMIN)) {
                usuario.setRol(Rol.USER);
            }

            usuarioRepositorio.save(usuario);
        }

    }
}