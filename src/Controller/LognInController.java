package Controller;

import Model.DataBase;
import Model.User;
import java.sql.Connection;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

/**
 *
 * @author nino-mercado
 */
public class LognInController {

    private static DataBase d = new DataBase();
    private static Connection con = d.connect();
    private User users = new User(con);
    
    public void lognIn(JTextField userName, JTextField password, JCheckBox remember) {

        users = new User(userName.getText(), password.getText(), con);
        if (users.exist()) {
            openRoom();
        }
    }

    public void openRegister(){
        new View.Register(users).setVisible(true);
    }
    
    private void openRoom() {

        new View.LognIn().setVisible(false);
        new View.Room().setVisible(true);
    }
}
