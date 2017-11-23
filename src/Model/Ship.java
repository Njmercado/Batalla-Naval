package Model;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nino-mercado
 */
public class Ship {

    private String shipName;
    private String description;
    private int hardNess;
    private float price;
    private Blob image;

    private String nickName;
    private ArrayList<Ship> userShips = new ArrayList();
    private ArrayList<Ship> ships = new ArrayList();
    private DataBase db = new DataBase();
    private Connection con = db.connect();

    private String query;
    private PreparedStatement ps;
    private ResultSet res;

    private Ship(String shipName, String description, int hardNess, float price, Blob image) {

        this.shipName = shipName;
        this.description = description;
        this.hardNess = hardNess;
        this.price = price;
        this.image = image;
    }

    public Ship(String nickName) {

        this.nickName = nickName;
        
        try {
            
            ps = con.prepareStatement("");
            query = "SELECT * FROM ship";
            res = ps.executeQuery(query);
            
            while (res.next()) {
                ships.add(new Ship(res.getString(1), res.getString(2), res.getInt(3), res.getFloat(4), res.getBlob(5)));
            }

            query = "SELECT * FROM user_ship WHERE c_nick_name = '" + this.nickName + "'";
            res = ps.executeQuery(query);
            while (res.next()) {
                userShips.add(new Ship(res.getString(1), res.getString(2), res.getInt(3), res.getFloat(4), res.getBlob(5)));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void setUserShip(String shipName) {
        
        query = "INSERT INTO user_ship VALUES(c_ship_name) WHERE c_nick_name = '" + this.nickName + "'";
        try {
            ps.executeUpdate(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public String getShipName() {
        return shipName;
    }

    public String getDescription() {
        return description;
    }

    public int getHardNess() {
        return hardNess;
    }

    public float getPrice() {
        return price;
    }

    public Blob getImage() {
        return image;
    }

    public ArrayList getShips() {
        return this.ships;
    }

    public ArrayList getUserShips() {
        return this.userShips;
    }
}
