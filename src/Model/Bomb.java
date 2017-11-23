package Model;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author nino-mercado
 */
public class Bomb {

    private ArrayList<Bomb> bombs = new ArrayList();
    private ArrayList<Bomb> userBombs = new ArrayList();
    private Bomb[][] bombsMatrix;
    private String name;
    private String description;
    private int power;
    private float price;
    private String nickName;
    private Blob image;
    
    private DataBase db;
    private Connection con = db.connect();

    private PreparedStatement ps;
    private String query;
    private ResultSet res;
    
    public Bomb(String nickName){
        
        this.nickName = nickName;
        
        try {
            
            ps = con.prepareStatement("");
            query = "SELECT * FROM ship";
            res = ps.executeQuery(query);
            
            while (res.next()) {
                bombs.add(new Bomb(res.getString(1), res.getString(2), res.getInt(3), res.getFloat(4), res.getBlob(5)));
            }

            query = "SELECT * FROM user_ship WHERE c_nick_name = '" + this.nickName + "'";
            res = ps.executeQuery(query);
            while (res.next()) {
                userBombs.add(new Bomb(res.getString(1), res.getString(2), res.getInt(3), res.getFloat(4), res.getBlob(5)));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private Bomb(String name, String description, int power, float price, Blob image){
        
        this.name = name;
        this.description = description;
        this.power = power;
        this.price = price;
    }
    
    public Bomb[][] getBombsMatrix(int x, int y) {

        int n = 0;
        bombsMatrix = new Bomb[3][(int) bombs.size() / 3];

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < (int) bombs.size() / 3; j++) {

                try {
                    bombsMatrix[i][j] = bombs.get(n);
                    n += 1;
                } catch (NullPointerException e) {
                    return bombsMatrix;
                }
            }
        }

        return bombsMatrix;
    }

    public Blob getImage(){
        return this.image;
    }
    
    public ArrayList getBombs() {
        return this.bombs;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public int getPower() {
        return power;
    }

    public float getPrice() {
        return price;
    }
    
    
}
