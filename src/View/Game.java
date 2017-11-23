
package View;

import static Controller.GameController.*;
import com.sun.awt.AWTUtilities;
import java.awt.Dimension;

public class Game extends javax.swing.JFrame implements Runnable{

    private int x, y;
    
    public Game(String nickName) {
        initComponents();

        AWTUtilities.setWindowOpaque(this, false);
        
        Dimension d = this.getToolkit().getScreenSize();
        this.setLocation(d.width/2 - getWidth()/2, d.height/2 - getHeight()/2);
        drawPlaces(this.myCamp, this.oponentCamp);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myPlace = new javax.swing.JPanel();
        myCamp = new javax.swing.JPanel();
        oponentCamp = new javax.swing.JPanel();
        minimize1 = new javax.swing.JButton();
        close = new javax.swing.JButton();
        labelContainer = new javax.swing.JLabel();
        chat = new javax.swing.JButton();
        attack = new javax.swing.JButton();
        opponnentInfo = new javax.swing.JButton();
        labelOpponent = new javax.swing.JLabel();
        labelAttack = new javax.swing.JLabel();
        labelChat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myPlace.setBackground(new java.awt.Color(113, 113, 113));
        myPlace.setOpaque(false);
        myPlace.setPreferredSize(new java.awt.Dimension(1080, 580));
        myPlace.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                myPlaceMouseMoved(evt);
            }
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                myPlaceMouseDragged(evt);
            }
        });
        myPlace.setLayout(null);

        myCamp.setBackground(new java.awt.Color(160, 223, 254));
        myCamp.setPreferredSize(new java.awt.Dimension(487, 487));
        myCamp.setLayout(null);
        myPlace.add(myCamp);
        myCamp.setBounds(20, 50, 520, 460);

        oponentCamp.setBackground(new java.awt.Color(160, 223, 254));
        oponentCamp.setPreferredSize(new java.awt.Dimension(710, 710));
        oponentCamp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                oponentCampMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout oponentCampLayout = new javax.swing.GroupLayout(oponentCamp);
        oponentCamp.setLayout(oponentCampLayout);
        oponentCampLayout.setHorizontalGroup(
            oponentCampLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        oponentCampLayout.setVerticalGroup(
            oponentCampLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        myPlace.add(oponentCamp);
        oponentCamp.setBounds(550, 50, 510, 460);

        minimize1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimizar.png"))); // NOI18N
        minimize1.setBorder(null);
        minimize1.setBorderPainted(false);
        minimize1.setContentAreaFilled(false);
        minimize1.setDefaultCapable(false);
        minimize1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimize1ActionPerformed(evt);
            }
        });
        myPlace.add(minimize1);
        minimize1.setBounds(30, 0, 20, 20);

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cerrar.png"))); // NOI18N
        close.setBorder(null);
        close.setBorderPainted(false);
        close.setContentAreaFilled(false);
        close.setDefaultCapable(false);
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        myPlace.add(close);
        close.setBounds(0, 0, 30, 20);

        labelContainer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/battle-camp.png"))); // NOI18N
        myPlace.add(labelContainer);
        labelContainer.setBounds(0, 0, 1080, 530);

        chat.setText("CHAT");
        chat.setBorder(null);
        chat.setBorderPainted(false);
        chat.setContentAreaFilled(false);
        chat.setDefaultCapable(false);
        chat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatActionPerformed(evt);
            }
        });
        myPlace.add(chat);
        chat.setBounds(910, 530, 130, 40);

        attack.setText("ATTACK");
        attack.setBorder(null);
        attack.setBorderPainted(false);
        attack.setContentAreaFilled(false);
        attack.setDefaultCapable(false);
        attack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attackActionPerformed(evt);
            }
        });
        myPlace.add(attack);
        attack.setBounds(30, 530, 150, 40);

        opponnentInfo.setText("OPPONNENT");
        opponnentInfo.setBorder(null);
        opponnentInfo.setBorderPainted(false);
        opponnentInfo.setContentAreaFilled(false);
        opponnentInfo.setDefaultCapable(false);
        opponnentInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opponnentInfoActionPerformed(evt);
            }
        });
        myPlace.add(opponnentInfo);
        opponnentInfo.setBounds(210, 530, 130, 40);

        labelOpponent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Button.png"))); // NOI18N
        myPlace.add(labelOpponent);
        labelOpponent.setBounds(200, 530, 160, 40);

        labelAttack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Button.png"))); // NOI18N
        myPlace.add(labelAttack);
        labelAttack.setBounds(30, 530, 160, 40);

        labelChat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Button.png"))); // NOI18N
        myPlace.add(labelChat);
        labelChat.setBounds(900, 530, 170, 40);

        getContentPane().add(myPlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opponnentInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opponnentInfoActionPerformed
        
    }//GEN-LAST:event_opponnentInfoActionPerformed

    private void myPlaceMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myPlaceMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_myPlaceMouseDragged

    private void myPlaceMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myPlaceMouseMoved
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_myPlaceMouseMoved

    private void attackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attackActionPerformed
        new Attack(this, true, this.getLocation()).setVisible(true);
    }//GEN-LAST:event_attackActionPerformed

    private void chatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chatActionPerformed
        
    }//GEN-LAST:event_chatActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        
    }//GEN-LAST:event_closeActionPerformed

    private void minimize1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimize1ActionPerformed
        
    }//GEN-LAST:event_minimize1ActionPerformed

    private void oponentCampMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oponentCampMouseReleased
    }//GEN-LAST:event_oponentCampMouseReleased

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game(null).setVisible(true);
            }
        });
        
        new Controller.GameController().startGame("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attack;
    private javax.swing.JButton chat;
    private javax.swing.JButton close;
    private javax.swing.JLabel labelAttack;
    private javax.swing.JLabel labelChat;
    private javax.swing.JLabel labelContainer;
    private javax.swing.JLabel labelOpponent;
    private javax.swing.JButton minimize1;
    private javax.swing.JPanel myCamp;
    private javax.swing.JPanel myPlace;
    private javax.swing.JPanel oponentCamp;
    private javax.swing.JButton opponnentInfo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {

        System.out.println();
    }
}
