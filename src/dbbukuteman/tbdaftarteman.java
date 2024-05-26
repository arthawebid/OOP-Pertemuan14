package dbbukuteman;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author BCMedia
 */
public class tbdaftarteman extends dbs{
    public void list_all() throws SQLException{
        Connection cnn = getConection();
        if( cnn.isClosed() ){
        }else{    
        PreparedStatement ps=cnn.prepareStatement("SELECT * FROM daftarteman;"); 
        ResultSet rs=ps.executeQuery();
        while(rs.next()){  
            System.out.println("Nama : "+rs.getString("nama"));  
            System.out.println("Nama : "+rs.getString("alamat"));
            System.out.println("Telp : "+rs.getString("kontak"));
            System.out.println("----");
        }  
	cnn.close();
        }
    }
    
    public void list_bynama(String cx) throws SQLException{
        Connection cnn = getConection();
        if( cnn.isClosed() ){
        }else{    
        PreparedStatement ps=cnn.prepareStatement("SELECT * FROM daftarteman WHERE nama LIKE '%"+cx+"%';");
        ResultSet rs=ps.executeQuery();
        while(rs.next()){  
            System.out.println("Nama : "+rs.getString("nama"));  
            System.out.println("Nama : "+rs.getString("alamat"));
            System.out.println("Telp : "+rs.getString("kontak"));
            System.out.println("----");
        }  
	cnn.close();
        }
    }
    public void stored(String nama, String al, String tlp) throws SQLException{
        Connection cnn = getConection();
        if( cnn.isClosed() ){
        }else{    
        PreparedStatement ps=cnn.prepareStatement("INSERT INTO daftarteman(nama,alamat,kontak) VALUES(?,?,?);");
        ps.setString(1,nama.replace(" ", ""));  
        ps.setString(2,al.replace(" ", ""));  
        ps.setString(3,tlp.replace(" ", ""));  
        ps.execute();
	cnn.close();
        }
    }
}
