package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author nino-mercado
 */
public class DataBase{
    
    private Connection con = null;
    
    public Connection connect(){
        
        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Battle_ship", "root", "");
            return con;    
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
        return this.con;
    }
}
