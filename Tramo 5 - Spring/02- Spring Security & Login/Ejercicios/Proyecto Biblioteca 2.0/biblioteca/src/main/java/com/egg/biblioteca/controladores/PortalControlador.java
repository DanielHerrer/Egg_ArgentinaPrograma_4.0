package com.egg.biblioteca.controladores;

import com.egg.biblioteca.entidades.Usuario;
import com.egg.biblioteca.excepciones.MiExcepcion;
import com.egg.biblioteca.servicios.UsuarioServicio;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/")
public class PortalControlador {

    @Autowired
    private UsuarioServicio usuarioServicio;

    @GetMapping("/")    // localhost:8080/
    public String index(){

        return "index.html";
    }

    @GetMapping("/registrar") // localhost:8080/registrar
    public String registrar() {
        return "registro.html";
    }

    @PostMapping("/registro")
    public String registro(MultipartFile archivo, @RequestParam String nombre, @RequestParam String email,
                           @RequestParam String password, String password2, ModelMap modelo) {
        try {

            usuarioServicio.registrar(archivo, nombre, email, password, password2);

            modelo.put("exito", "Usuario registrado correctamente! =^)");

            return "index.html";

        } catch(MiExcepcion ex) {

            modelo.put("error", ex.getMessage());

            modelo.put("nombre",nombre);
            modelo.put("email",email);

            return "registro.html";
        }

    }


    @GetMapping("/login") // localhost:8080/login
    public String login(@RequestParam(required = false) String error, ModelMap modelo) {

        if(error != null) {
            modelo.put("error", "Usuario o Contraseña invalidos!");
        }
        return "login.html";
    }

    @PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
    @GetMapping("/inicio")
    public String inicio(HttpSession session) {

        Usuario logueado = (Usuario) session.getAttribute("usuariosession");

        if (logueado.getRol().toString().equals("ADMIN")) {
            return "redirect:/admin/dashboard";
        }

        return "inicio.html";
    }

    @PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
    @GetMapping("/perfil")
    public String perfil(ModelMap modelo, HttpSession session) {

        Usuario usuario = (Usuario) session.getAttribute("usuariosession");
        modelo.put("usuario", usuario);
        return "usuario_modificar.html";
    }

    @PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
    @PostMapping("/perfil/{id}")
    public String actualizar(MultipartFile archivo, @PathVariable String id, @RequestParam String nombre,
                             @RequestParam String email, @RequestParam String password, String password2, ModelMap modelo) {

        try {
            usuarioServicio.actualizar(archivo, id, nombre, email, password, password2);

            modelo.put("exito","Usuario actualizado correctamente!");

            return "inicio.html";
        } catch (MiExcepcion ex) {

            modelo.put("error", ex.getMessage());
            modelo.put("nombre", nombre);
            modelo.put("email", email);

            return "usuario_modificar.html";
        }
    }

}