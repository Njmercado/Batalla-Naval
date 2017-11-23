package View;

import Model.User;
import com.sun.awt.AWTUtilities;

/**
 *
 * @author nino-mercado
 */
public class Room extends javax.swing.JFrame {

    public Room(User user) {
        initComponents();
        AWTUtilities.setWindowOpaque(this, false);
        this.storePanel.setVisible(false);
        this.storeBombButton.setVisible(false);
        this.storeShipButton.setVisible(false);
        new Controller.RoomController().beginRoom(user, this.usersOnlinePanel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principalStore = new javax.swing.JPanel();
        storeBombButton = new javax.swing.JButton();
        storeShipButton = new javax.swing.JButton();
        usersOnlinePanel = new javax.swing.JLayeredPane();
        storePanel = new javax.swing.JLayeredPane();
        labelImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        principalStore.setOpaque(false);
        principalStore.setLayout(null);

        storeBombButton.setText("Bombs");
        principalStore.add(storeBombButton);
        storeBombButton.setBounds(560, 30, 220, 20);

        storeShipButton.setText("Ships");
        storeShipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeShipButtonActionPerformed(evt);
            }
        });
        principalStore.add(storeShipButton);
        storeShipButton.setBounds(340, 30, 220, 20);

        usersOnlinePanel.add(storePanel);
        storePanel.setBounds(0, 0, 940, 410);

        principalStore.add(usersOnlinePanel);
        usersOnlinePanel.setBounds(109, 79, 940, 410);

        labelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/battle-camp.png"))); // NOI18N
        principalStore.add(labelImage);
        labelImage.setBounds(0, 0, 1080, 530);

        getContentPane().add(principalStore, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void storeShipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeShipButtonActionPerformed
        
    }//GEN-LAST:event_storeShipButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Room(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelImage;
    private javax.swing.JPanel principalStore;
    private javax.swing.JButton storeBombButton;
    private javax.swing.JLayeredPane storePanel;
    private javax.swing.JButton storeShipButton;
    private javax.swing.JLayeredPane usersOnlinePanel;
    // End of variables declaration//GEN-END:variables
}
