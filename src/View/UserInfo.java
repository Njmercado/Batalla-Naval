package View;

import Model.Bomb;
import Model.Ship;
import Model.User;

/**
 *
 * @author nino-mercado
 */
public class UserInfo extends javax.swing.JPanel {
    
    public UserInfo(User user) {
        initComponents();
        this.bombPanel.setVisible(false);
        this.shipPanel.setVisible(false);
        this.setSize(100, 120);
    }

    public UserInfo(Bomb bomb){
        initComponents();
        this.shipPanel.setVisible(false);
        this.userPanel.setVisible(false);
        this.setSize(100, 120);
    }
    
    public UserInfo(Ship ship){
        initComponents();
        this.bombPanel.setVisible(false);
        this.userPanel.setVisible(false);
        this.setSize(100, 120);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userPanel = new javax.swing.JPanel();
        imageLabel = new javax.swing.JLabel();
        inviteLabel = new javax.swing.JLabel();
        rankLabel = new javax.swing.JLabel();
        userInfoLabel = new javax.swing.JLabel();
        bombPanel = new javax.swing.JPanel();
        shipPanel = new javax.swing.JPanel();

        setOpaque(false);
        setLayout(null);

        userPanel.setOpaque(false);
        userPanel.setLayout(null);
        userPanel.add(imageLabel);
        imageLabel.setBounds(10, 10, 80, 70);
        userPanel.add(inviteLabel);
        inviteLabel.setBounds(10, 97, 20, 20);
        userPanel.add(rankLabel);
        rankLabel.setBounds(50, 90, 40, 30);

        userInfoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/userInfo.png"))); // NOI18N
        userPanel.add(userInfoLabel);
        userInfoLabel.setBounds(0, 0, 100, 130);

        add(userPanel);
        userPanel.setBounds(0, 0, 100, 130);

        bombPanel.setOpaque(false);

        javax.swing.GroupLayout bombPanelLayout = new javax.swing.GroupLayout(bombPanel);
        bombPanel.setLayout(bombPanelLayout);
        bombPanelLayout.setHorizontalGroup(
            bombPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        bombPanelLayout.setVerticalGroup(
            bombPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        add(bombPanel);
        bombPanel.setBounds(0, 0, 100, 130);

        shipPanel.setOpaque(false);

        javax.swing.GroupLayout shipPanelLayout = new javax.swing.GroupLayout(shipPanel);
        shipPanel.setLayout(shipPanelLayout);
        shipPanelLayout.setHorizontalGroup(
            shipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        shipPanelLayout.setVerticalGroup(
            shipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        add(shipPanel);
        shipPanel.setBounds(0, 0, 100, 130);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bombPanel;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel inviteLabel;
    private javax.swing.JLabel rankLabel;
    private javax.swing.JPanel shipPanel;
    private javax.swing.JLabel userInfoLabel;
    private javax.swing.JPanel userPanel;
    // End of variables declaration//GEN-END:variables
}
