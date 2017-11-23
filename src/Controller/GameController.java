package Controller;

import Model.BattleCamp;
import Model.Server;
import java.awt.Point;
import javax.swing.JPanel;

public class GameController {
    
    static BattleCamp myCamp;
    static BattleCamp oponentCamp;
    private static Server server = new Server();
    
    public static void drawPlaces(JPanel myPlace, JPanel oponentPlace){
        myCamp = new BattleCamp(myPlace, true);
        oponentCamp = new BattleCamp(oponentPlace, false);
    }
    
    public void startGame(String nickName){
        
        oponentCamp.startGame(nickName, server);
    }
}


