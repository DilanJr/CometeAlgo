package clases;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    public static Connection Conectar(){
        
        try {
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/cometealgo", "root", "");
            return cn;
            
        } catch (SQLException e) {
            
            System.err.println("¡Error al conectarse a la base de datos! " + e);
            JOptionPane.showMessageDialog(null, "¡Error al conectarse con la base de datos! Contacte al programador.", 
                    "¡Error!", JOptionPane.INFORMATION_MESSAGE);
            
        }
        
        return(null);
        
    }
    
}
