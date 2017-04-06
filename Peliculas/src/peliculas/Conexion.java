
package peliculas;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    //configurar mi conección a la DB
    
   private String  usuario = "root";
    private String pass = "";
    private String host = "localhost";
    private String nombreBD = "peliculas";
    
    private Connection con = null;
    
    public Conexion() {
    }
    //Metodo que se devuelve la conexion o null si hubo un error
    public Connection getConexionMySql(){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance( );
            String servidor = "jdbc:mysql://"+host+"/"+nombreBD;
            con = DriverManager.getConnection(servidor,usuario,pass);
            return con;
        }catch(Exception e){
            e.printStackTrace();
            return con;
        }
    }
}
