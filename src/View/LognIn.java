package View;

import com.sun.awt.AWTUtilities;
import java.awt.Cursor;
import java.awt.Font;

/**
 *
 * @author Jesus Mercado
 */
public class LognIn extends javax.swing.JFrame {

    private int x = 0, y = 0;

    public LognIn() {
        initComponents();
        AWTUtilities.setWindowOpaque(this, false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principal = new javax.swing.JPanel();
        lineaGrande = new javax.swing.JLabel();
        lineaPequeña = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        login = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();
        minimizar = new javax.swing.JLabel();
        labelInfo = new javax.swing.JLabel();
        nickName = new javax.swing.JLabel();
        textUser = new javax.swing.JTextField();
        labelPassword = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        aceptar = new javax.swing.JButton();
        registrarse = new javax.swing.JButton();
        mantenerConectado = new javax.swing.JCheckBox();
        seePassword = new javax.swing.JButton();
        contraseñaOlvidada = new javax.swing.JButton();
        labelImagenUsuario = new javax.swing.JLabel();
        labelLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(280, 360));
        setUndecorated(true);

        principal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        principal.setOpaque(false);
        principal.setPreferredSize(new java.awt.Dimension(562, 360));
        principal.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                principalMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                principalMouseMoved(evt);
            }
        });
        principal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                principalMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                principalMouseReleased(evt);
            }
        });
        principal.setLayout(null);

        lineaGrande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/linea.png"))); // NOI18N
        principal.add(lineaGrande);
        lineaGrande.setBounds(30, 290, 230, 10);

        lineaPequeña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/linea.png"))); // NOI18N
        principal.add(lineaPequeña);
        lineaPequeña.setBounds(50, 310, 190, 10);

        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/User.png"))); // NOI18N
        principal.add(user);
        user.setBounds(10, 120, 210, 150);

        login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login.setText("Login");
        principal.add(login);
        login.setBounds(80, 80, 120, 20);

        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cerrar.png"))); // NOI18N
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });
        principal.add(cerrar);
        cerrar.setBounds(0, 20, 30, 20);

        minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimizar.png"))); // NOI18N
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarMouseClicked(evt);
            }
        });
        principal.add(minimizar);
        minimizar.setBounds(30, 20, 24, 20);

        labelInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/informacion.png"))); // NOI18N
        principal.add(labelInfo);
        labelInfo.setBounds(0, 10, 280, 340);

        nickName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/linea.png"))); // NOI18N
        principal.add(nickName);
        nickName.setBounds(300, 160, 240, 10);

        textUser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        textUser.setForeground(new java.awt.Color(186, 186, 186));
        textUser.setText("User");
        textUser.setBorder(null);
        textUser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        textUser.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        textUser.setOpaque(false);
        textUser.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        textUser.setSelectionColor(new java.awt.Color(153, 153, 153));
        principal.add(textUser);
        textUser.setBounds(300, 150, 240, 16);

        labelPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/linea.png"))); // NOI18N
        principal.add(labelPassword);
        labelPassword.setBounds(300, 230, 240, 5);

        password.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        password.setForeground(new java.awt.Color(186, 186, 186));
        password.setText("password");
        password.setBorder(null);
        password.setOpaque(false);
        password.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        password.setSelectionColor(new java.awt.Color(153, 153, 153));
        principal.add(password);
        password.setBounds(300, 216, 220, 16);

        aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/aceptar.png"))); // NOI18N
        aceptar.setBorder(null);
        aceptar.setBorderPainted(false);
        aceptar.setContentAreaFilled(false);
        aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        principal.add(aceptar);
        aceptar.setBounds(400, 290, 30, 30);

        registrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/registrar.png"))); // NOI18N
        registrarse.setBorder(null);
        registrarse.setContentAreaFilled(false);
        registrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        registrarse.setDefaultCapable(false);
        registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarseActionPerformed(evt);
            }
        });
        principal.add(registrarse);
        registrarse.setBounds(520, 50, 30, 30);

        mantenerConectado.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        mantenerConectado.setForeground(new java.awt.Color(255, 255, 255));
        mantenerConectado.setText("Mantener conectado");
        mantenerConectado.setToolTipText("");
        mantenerConectado.setBorder(null);
        mantenerConectado.setBorderPainted(true);
        mantenerConectado.setContentAreaFilled(false);
        mantenerConectado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mantenerConectado.setFocusPainted(false);
        principal.add(mantenerConectado);
        mantenerConectado.setBounds(300, 250, 130, 19);

        seePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/seePassword.png"))); // NOI18N
        seePassword.setBorder(null);
        seePassword.setBorderPainted(false);
        seePassword.setContentAreaFilled(false);
        seePassword.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        seePassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                seePasswordMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                seePasswordMouseReleased(evt);
            }
        });
        principal.add(seePassword);
        seePassword.setBounds(520, 210, 30, 20);

        contraseñaOlvidada.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        contraseñaOlvidada.setForeground(new java.awt.Color(255, 255, 255));
        contraseñaOlvidada.setText("Olvide mí contraseña");
        contraseñaOlvidada.setBorder(null);
        contraseñaOlvidada.setBorderPainted(false);
        contraseñaOlvidada.setContentAreaFilled(false);
        contraseñaOlvidada.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        contraseñaOlvidada.setDefaultCapable(false);
        contraseñaOlvidada.setFocusPainted(false);
        contraseñaOlvidada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contraseñaOlvidadaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                contraseñaOlvidadaMouseReleased(evt);
            }
        });
        contraseñaOlvidada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaOlvidadaActionPerformed(evt);
            }
        });
        principal.add(contraseñaOlvidada);
        contraseñaOlvidada.setBounds(340, 320, 140, 20);
        principal.add(labelImagenUsuario);
        labelImagenUsuario.setBounds(380, 70, 70, 50);

        labelLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/informacion2.png"))); // NOI18N
        principal.add(labelLogin);
        labelLogin.setBounds(280, 10, 283, 340);

        getContentPane().add(principal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizarMouseClicked

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cerrarMouseClicked

    private void principalMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_principalMouseMoved
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_principalMouseMoved

    private void principalMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_principalMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_principalMouseDragged

    private void seePasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seePasswordMousePressed
        this.password.setEchoChar((char) 0);
    }//GEN-LAST:event_seePasswordMousePressed

    private void seePasswordMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seePasswordMouseReleased
        this.password.setEchoChar('•');
    }//GEN-LAST:event_seePasswordMouseReleased

    private void registrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarseActionPerformed
        this.dispose();
        new Controller.LognInController().openRegister();
    }//GEN-LAST:event_registrarseActionPerformed

    private void principalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_principalMousePressed
        principal.setCursor(new Cursor(MOVE_CURSOR));
    }//GEN-LAST:event_principalMousePressed

    private void principalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_principalMouseReleased
        principal.setCursor(new Cursor(DEFAULT_CURSOR));
    }//GEN-LAST:event_principalMouseReleased

    private void contraseñaOlvidadaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseñaOlvidadaMousePressed
        contraseñaOlvidada.setFont(new Font(contraseñaOlvidada.getFont().getName(), contraseñaOlvidada.getFont().getStyle(), 11));
    }//GEN-LAST:event_contraseñaOlvidadaMousePressed

    private void contraseñaOlvidadaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseñaOlvidadaMouseReleased
        contraseñaOlvidada.setFont(new Font(contraseñaOlvidada.getFont().getName(), contraseñaOlvidada.getFont().getStyle(), 10));
    }//GEN-LAST:event_contraseñaOlvidadaMouseReleased

    private void contraseñaOlvidadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaOlvidadaActionPerformed
        //new View.RestaurarContraseña().setVisible(true);
    }//GEN-LAST:event_contraseñaOlvidadaActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        new Controller.LognInController().lognIn(textUser, password, mantenerConectado);
    }//GEN-LAST:event_aceptarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new LognIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JLabel cerrar;
    private javax.swing.JButton contraseñaOlvidada;
    private javax.swing.JLabel labelImagenUsuario;
    private javax.swing.JLabel labelInfo;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel lineaGrande;
    private javax.swing.JLabel lineaPequeña;
    private javax.swing.JLabel login;
    private javax.swing.JCheckBox mantenerConectado;
    private javax.swing.JLabel minimizar;
    private javax.swing.JLabel nickName;
    private javax.swing.JPasswordField password;
    private javax.swing.JPanel principal;
    private javax.swing.JButton registrarse;
    private javax.swing.JButton seePassword;
    private javax.swing.JTextField textUser;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
