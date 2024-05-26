package dbbukuteman;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author BCMedia
 */
public class dbs {
    
    public static Connection getConection(){
        Connection cnn=null;  
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bukuteman","root","");
            
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Koneksi Gagal");
        }
        return cnn;
    }
    
}
