package saojudas.a3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionFactory {
    public Connection obtemConexao() throws SQLException{
        try{
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/concessionaria", "root", "root@2022");
          return c;  
        }catch(Exception ex){
           ex.printStackTrace();
           return null;
        }
    }           
    
    
    
}
