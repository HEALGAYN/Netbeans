//realizar mis operaciones para crear, modificar y eliminar una pelicula.
package peliculas;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Peliculas {   
        private Conexion conexion = new Conexion();
        private Connection con;
        private Statement st;
        private ResultSet rs;
        
    public Peliculas(){
        try{
            if(( con = conexion.getConexionMySql()) == null ){
                JOptionPane.showMessageDialog(null, "Erro en conexion a la DB");
                return;
                }          
                st = con.createStatement();        
        }        
        catch(Exception e){
        e.printStackTrace();  
        }    
    }
    
    public ResultSet SelectXtodas (){
        try{
        String query = "SELECT * From peliculas";
        rs = st.executeQuery(query);
        return rs;
        }catch(Exception e){
            e.printStackTrace();            
        return null;
        }     
     }
    public ResultSet SelectXgenero(String genero){
        try{
        String query = "SELECT * FROM peliculas WHERE genero = '"+genero+"'";
        rs = st.executeQuery(query);
        return rs;
        }catch(Exception e){
            e.printStackTrace();            
        return null;
        }      
    }
     
    public boolean insert(String nombre,String genero,int anio,String actor,String pais){
        try {
            String query = "INSERT INTO peliculas VALUES(NULL,'"+nombre+"','"+genero+"','"+anio+"','"+actor+"','"+pais+"');";
            st.executeUpdate(query);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
        
    public boolean update(int id,String nombre,String genero,int anio,String actor,String pais){
        try {
            String query = "UPDATE peliculas SET"
                    + " nombre = '"+nombre+"',"
                    + " genero = '"+genero+"',"
                    + " anio = '"+anio+"',"
                    + " actor = '"+actor+"',"
                    + " pais = '"+pais+"' "
                    + "WHERE id = '"+id+"';";
            st.executeUpdate(query);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

     public boolean delete(int id){
        try {
            String query = "DELETE FROM peliculas WHERE id = '"+id+"'";
            st.executeUpdate(query);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
     
     
     
}




