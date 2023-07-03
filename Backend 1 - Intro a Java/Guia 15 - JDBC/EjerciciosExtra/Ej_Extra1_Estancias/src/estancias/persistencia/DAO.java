package estancias.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DAO {
    
    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;

    private final String USER = "root";
    private final String PASSWORD = "";
    private final String DATABASE = "estancias_exterior";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";   // actualizado

    protected void conectarBase() throws ClassNotFoundException, SQLException {
        try{
            Class.forName(DRIVER);
            String url_DB = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false";
            conexion = DriverManager.getConnection(url_DB, USER, PASSWORD);
        }catch(ClassNotFoundException | SQLException ex){
            throw ex;
        }
    }

    protected void desconectarBase() throws Exception {
        try{
            if(resultado != null){
                resultado.close();
            }
            if(sentencia != null){
                sentencia.close();
            }
            if(conexion != null){
                conexion.close();
            }
        }catch(Exception e){
            throw e;
        }
    }

    protected void insertUpdateDelete(String sql) throws Exception {
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        }catch(ClassNotFoundException | SQLException e){
            // Si algo sale mal en medio del update se revierten los cambios hechos hasta ahora..
            // conexion.rollback(); 
            /*
            Correr el siguiente script en Workbench:
                SET autocommit=1;
                COMMIT;
            */
            throw e;
        }finally{
            desconectarBase();
        }
    }

    protected void consultarBase(String sql) throws Exception {
        try{
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
        }catch(Exception ex){
            throw ex;
        }
    }

}
