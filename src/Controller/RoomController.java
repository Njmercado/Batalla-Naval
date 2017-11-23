package Controller;

import Model.User;
import View.UserInfo;
import java.util.ArrayList;
import javax.swing.JLayeredPane;

/**
 *
 * @author nino-mercado
 */
public class RoomController {

    private User users;
    private ArrayList<User> listOfUser = null;
    
    public void beginRoom(User users, JLayeredPane panelPlayersOnline) {

        this.users = users;
        this.listOfUser = this.users.getUsers();//All the users in the dataBase.
        
        UserInfo uI = new UserInfo(this.users);
        panelPlayersOnline.add(uI);
        
        for (int i = 0; i < (int) this.listOfUser.size() / 8; i++) {

            for (int j = 0; j < 8; j++) {

                try {
                    uI = new UserInfo(this.listOfUser.get(j + i*8));
                    uI.setLocation(j * 120, i * 140);
                    panelPlayersOnline.add(uI);
                } catch (NullPointerException e) {
                    break;
                }
            }
        }
        panelPlayersOnline.updateUI();
    }
}
