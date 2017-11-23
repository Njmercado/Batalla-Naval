package Model;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author nino-mercado
 */
public class User {

    private ArrayList<User> users = new ArrayList();
    private User user;

    private String userName;
    private String password;
    private int lavel;
    private float money;
    private int points;
    private Blob image;
    private boolean a = false;//is false if the user don't exist.

    private Connection con;

    public User(Connection con) {
        this.con = con;
    }

    /**
     * This method is use for register a new user in the dataBase
     */
    public User(String userName, String password, Blob image) {

        this.userName = userName;
        this.password = password;
        this.image = image;
    }
    
    /**
     * This method is use for create a user and input it in the arrayList.
     */
    private User(String userName, String password, int lavel, float money, int points, Blob image) {

        this.userName = userName;
        this.password = password;
        this.lavel = lavel;
        this.money = money;
        this.points = points;
        this.image = image;
    }

    public User(String userName, String password, Connection con) {

        this.con = con;

        String query = "SELECT * FROM user WHERE c_nick_name = '" + userName + "' AND c_password = '" + password + "'";
        try {

            PreparedStatement ps = this.con.prepareStatement("");
            ResultSet res = ps.executeQuery(query);

            while (res.next()) {

                user = new User(res.getString(1), res.getString(2), res.getInt(3), res.getFloat(4), res.getInt(5), res.getBlob(6));
                a = true;
            }

            if (a) {

                query = "SELECT * FROM user WHERE c_nick_name != '" + userName + "'";
                res = ps.executeQuery(query);

                while (res.next()) {
                    users.add(new User(res.getString(1), res.getString(2), res.getInt(3), res.getFloat(4), res.getInt(5), res.getBlob(6)));
                }

            } else {

                JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrectos, intentelo nuevamente.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean exist() {
        if (a) {
            a = false;
            return !this.a;
        }
        return this.a;
    }

    public void addUser(String userName, String password, String question, String answer, byte[] image) {
        
        String query = "INSERT INTO user (c_nick_name, c_password, c_question, c_answer, c_image) VALUES('" + userName + "', '" + password + "', '" + question + "', '" + answer + "', " + image + ")";

        try {
            PreparedStatement pt = con.prepareStatement("");
            pt.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public ArrayList getUsers() {
        return this.users;
    }

    public boolean verifyNickNameForNewUser(String nickName) {

        String query = "SELECT * FROM user WHERE c_nick_name = '" + nickName + "'";
        boolean a = false;

        try {

            PreparedStatement pt = con.prepareStatement("");
            ResultSet r = pt.executeQuery(query);

            while (r.next()) {
                a = true;
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return a;
    }
    
    public User[][] getUserMatrix(int x, int y){
        
        int length = this.users.size() / 5;
        User[][] userMatrix = new User[5][length];
        
        for (int i = 0; i < (int) length; i++) {
            
            for (int j = 0; j < 5; j++) {
                userMatrix[i][j] = this.users.get(j+ (int)length);
            }
        }
        
        return userMatrix;
    }
}
