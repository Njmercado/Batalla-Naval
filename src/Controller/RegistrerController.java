package Controller;

import Model.User;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author nino-mercado
 */
public class RegistrerController {
    
    public void addNewUser(User user, JTextField nickName, JPasswordField password, JTextField question, JTextField answer, String imagePath, JFrame frame){

        ImageIcon image = new ImageIcon(imagePath);
        BufferedImage bf = new BufferedImage(image.getImage().getWidth(null), image.getImage().getHeight(null), BufferedImage.TYPE_INT_ARGB);
        bf.getGraphics().drawImage(image.getImage(), 0, 0, null);
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] b = null;
        try {
            
            ImageIO.write(bf, "png", baos);
            b = baos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        }
        user.addUser(nickName.getText(), password.getText(), question.getText(), answer.getText(), b);
    }
    
    public String selectImage(JLabel labelImage){
        return null;
    }
    
    public void verifyNickName(JLabel error, JTextField nickName, User user){
        
        boolean res = user.verifyNickNameForNewUser(nickName.getText());
        if (res) {
            error.setText("This nick name exist, use a diferente to.");
        }
    }
}
