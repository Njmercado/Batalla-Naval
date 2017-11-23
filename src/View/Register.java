package View;

import Model.User;
import com.sun.awt.AWTUtilities;
import java.awt.Cursor;

/**
 *
 * @author Jesus Mercado
 */
public class Register extends javax.swing.JFrame {

    private int x, y;
    boolean b = true;
    private User user;

    public Register(User user) {
        initComponents();
        this.user = user;
        otrasPreguntas.setVisible(false);
        AWTUtilities.setWindowOpaque(this, false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Registro = new javax.swing.JPanel();
        otrasPreguntas = new javax.swing.JScrollPane();
        listaDePreguntas = new javax.swing.JList<>();
        adjuntarImagen = new javax.swing.JButton();
        labelImagenPerfil = new javax.swing.JLabel();
        labelIcono = new javax.swing.JLabel();
        linea2 = new javax.swing.JLabel();
        linea1 = new javax.swing.JLabel();
        registrar = new javax.swing.JLabel();
        minimizar = new javax.swing.JButton();
        labelInformacion = new javax.swing.JLabel();
        lineaNickName = new javax.swing.JLabel();
        lineaPassword = new javax.swing.JLabel();
        botonRegistrar = new javax.swing.JButton();
        labelErroresNickName = new javax.swing.JLabel();
        seePassword = new javax.swing.JButton();
        textFieldNickName = new javax.swing.JTextField();
        regresar = new javax.swing.JButton();
        passwordFieldPassword = new javax.swing.JPasswordField();
        lineaRespuesta = new javax.swing.JLabel();
        textFieldRespuesta = new javax.swing.JTextField();
        textFieldpregunta = new javax.swing.JTextField();
        lineaPregunta = new javax.swing.JLabel();
        preguntas = new javax.swing.JButton();
        labelDatos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(280, 360));
        setUndecorated(true);

        Registro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Registro.setMinimumSize(new java.awt.Dimension(562, 360));
        Registro.setOpaque(false);
        Registro.setPreferredSize(new java.awt.Dimension(562, 360));
        Registro.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                RegistroMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                RegistroMouseMoved(evt);
            }
        });
        Registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RegistroMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                RegistroMouseReleased(evt);
            }
        });
        Registro.setLayout(null);

        listaDePreguntas.setBackground(new java.awt.Color(198, 198, 198));
        listaDePreguntas.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        listaDePreguntas.setForeground(new java.awt.Color(255, 255, 255));
        listaDePreguntas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "¿Que pienso de la sociedad?", "¿Mi color favorito es?", "¿Mi perro se llama?", "¿De donde soy?", "¿Creo que...?", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaDePreguntas.setSelectionBackground(new java.awt.Color(141, 141, 141));
        listaDePreguntas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                listaDePreguntasMouseReleased(evt);
            }
        });
        otrasPreguntas.setViewportView(listaDePreguntas);

        Registro.add(otrasPreguntas);
        otrasPreguntas.setBounds(370, 230, 160, 100);

        adjuntarImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/adjuntar.png"))); // NOI18N
        adjuntarImagen.setToolTipText("Adjuntar imagen de perfil");
        adjuntarImagen.setBorderPainted(false);
        adjuntarImagen.setContentAreaFilled(false);
        adjuntarImagen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        adjuntarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adjuntarImagenActionPerformed(evt);
            }
        });
        Registro.add(adjuntarImagen);
        adjuntarImagen.setBounds(240, 230, 20, 30);
        Registro.add(labelImagenPerfil);
        labelImagenPerfil.setBounds(50, 110, 180, 150);

        labelIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconoRegistr.png"))); // NOI18N
        Registro.add(labelIcono);
        labelIcono.setBounds(80, 100, 150, 170);

        linea2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/linea.png"))); // NOI18N
        Registro.add(linea2);
        linea2.setBounds(50, 290, 200, 20);

        linea1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/linea.png"))); // NOI18N
        linea1.setText("jLabel1");
        Registro.add(linea1);
        linea1.setBounds(30, 270, 240, 17);

        registrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        registrar.setForeground(new java.awt.Color(255, 255, 255));
        registrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrar.setText("Registrar");
        Registro.add(registrar);
        registrar.setBounds(80, 60, 110, 26);

        minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimizar.png"))); // NOI18N
        minimizar.setBorderPainted(false);
        minimizar.setContentAreaFilled(false);
        minimizar.setDefaultCapable(false);
        minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizarActionPerformed(evt);
            }
        });
        Registro.add(minimizar);
        minimizar.setBounds(0, 10, 20, 20);

        labelInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/informacion.png"))); // NOI18N
        Registro.add(labelInformacion);
        labelInformacion.setBounds(0, 0, 290, 350);

        lineaNickName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/linea.png"))); // NOI18N
        lineaNickName.setText(" ");
        Registro.add(lineaNickName);
        lineaNickName.setBounds(300, 130, 240, 17);

        lineaPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/linea.png"))); // NOI18N
        lineaPassword.setText(" ");
        Registro.add(lineaPassword);
        lineaPassword.setBounds(300, 180, 240, 17);

        botonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/aceptarRegistro.png"))); // NOI18N
        botonRegistrar.setBorderPainted(false);
        botonRegistrar.setContentAreaFilled(false);
        botonRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });
        Registro.add(botonRegistrar);
        botonRegistrar.setBounds(400, 300, 50, 30);

        labelErroresNickName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelErroresNickName.setForeground(new java.awt.Color(242, 9, 9));
        Registro.add(labelErroresNickName);
        labelErroresNickName.setBounds(300, 140, 240, 10);

        seePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/seePassword.png"))); // NOI18N
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
        Registro.add(seePassword);
        seePassword.setBounds(520, 160, 20, 30);

        textFieldNickName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        textFieldNickName.setForeground(new java.awt.Color(186, 186, 186));
        textFieldNickName.setText("User");
        textFieldNickName.setBorder(null);
        textFieldNickName.setOpaque(false);
        textFieldNickName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNickNameActionPerformed(evt);
            }
        });
        textFieldNickName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldNickNameKeyReleased(evt);
            }
        });
        Registro.add(textFieldNickName);
        textFieldNickName.setBounds(300, 120, 240, 20);

        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Typicons_e005(0)_64.png"))); // NOI18N
        regresar.setBorderPainted(false);
        regresar.setContentAreaFilled(false);
        regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        Registro.add(regresar);
        regresar.setBounds(510, 40, 40, 30);

        passwordFieldPassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        passwordFieldPassword.setForeground(new java.awt.Color(186, 186, 186));
        passwordFieldPassword.setText("Password");
        passwordFieldPassword.setBorder(null);
        passwordFieldPassword.setOpaque(false);
        Registro.add(passwordFieldPassword);
        passwordFieldPassword.setBounds(300, 170, 220, 20);

        lineaRespuesta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lineaRespuesta.setForeground(new java.awt.Color(255, 255, 255));
        lineaRespuesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/linea.png"))); // NOI18N
        Registro.add(lineaRespuesta);
        lineaRespuesta.setBounds(300, 280, 240, 10);

        textFieldRespuesta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        textFieldRespuesta.setForeground(new java.awt.Color(186, 186, 186));
        textFieldRespuesta.setText("Respuesta");
        textFieldRespuesta.setBorder(null);
        textFieldRespuesta.setOpaque(false);
        Registro.add(textFieldRespuesta);
        textFieldRespuesta.setBounds(300, 260, 240, 30);

        textFieldpregunta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        textFieldpregunta.setForeground(new java.awt.Color(186, 186, 186));
        textFieldpregunta.setText("Pregunta");
        textFieldpregunta.setBorder(null);
        textFieldpregunta.setOpaque(false);
        Registro.add(textFieldpregunta);
        textFieldpregunta.setBounds(300, 220, 220, 20);

        lineaPregunta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/linea.png"))); // NOI18N
        Registro.add(lineaPregunta);
        lineaPregunta.setBounds(300, 240, 240, 5);

        preguntas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/otrasPreguntas.png"))); // NOI18N
        preguntas.setBorderPainted(false);
        preguntas.setContentAreaFilled(false);
        preguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preguntasActionPerformed(evt);
            }
        });
        Registro.add(preguntas);
        preguntas.setBounds(520, 220, 30, 20);

        labelDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/informacion2.png"))); // NOI18N
        labelDatos.setText(" ");
        Registro.add(labelDatos);
        labelDatos.setBounds(280, 0, 290, 350);

        getContentPane().add(Registro, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistroMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistroMouseMoved
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_RegistroMouseMoved

    private void RegistroMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistroMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_RegistroMouseDragged

    private void RegistroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistroMousePressed
        Registro.setCursor(new Cursor(MOVE_CURSOR));
    }//GEN-LAST:event_RegistroMousePressed

    private void RegistroMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistroMouseReleased
        Registro.setCursor(new Cursor(DEFAULT_CURSOR));
    }//GEN-LAST:event_RegistroMouseReleased

    private void minimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizarActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizarActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        this.dispose();
        new View.LognIn().setVisible(true);
    }//GEN-LAST:event_regresarActionPerformed

    private void seePasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seePasswordMousePressed
        passwordFieldPassword.setEchoChar((char) 0);
    }//GEN-LAST:event_seePasswordMousePressed

    private void seePasswordMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seePasswordMouseReleased
        passwordFieldPassword.setEchoChar('•');
    }//GEN-LAST:event_seePasswordMouseReleased

    private void textFieldNickNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNickNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNickNameActionPerformed
    String path;
    private void adjuntarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adjuntarImagenActionPerformed
        path = new Controller.RegistrerController().selectImage(labelImagenPerfil);
    }//GEN-LAST:event_adjuntarImagenActionPerformed

    private void preguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preguntasActionPerformed
        if (b) {
            otrasPreguntas.setVisible(true);
            b = false;
        } else {
            otrasPreguntas.setVisible(false);
            b = true;
        }

    }//GEN-LAST:event_preguntasActionPerformed

    private void listaDePreguntasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaDePreguntasMouseReleased
        textFieldpregunta.setText(listaDePreguntas.getSelectedValue());
        otrasPreguntas.setVisible(false);
    }//GEN-LAST:event_listaDePreguntasMouseReleased

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        new Controller.RegistrerController().addNewUser(this.user, textFieldNickName, passwordFieldPassword, textFieldpregunta, textFieldRespuesta, path, this);
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void textFieldNickNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldNickNameKeyReleased
        new Controller.RegistrerController().verifyNickName(labelErroresNickName, textFieldNickName, this.user);
    }//GEN-LAST:event_textFieldNickNameKeyReleased

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Register(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Registro;
    private javax.swing.JButton adjuntarImagen;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JLabel labelDatos;
    private javax.swing.JLabel labelErroresNickName;
    private javax.swing.JLabel labelIcono;
    private javax.swing.JLabel labelImagenPerfil;
    private javax.swing.JLabel labelInformacion;
    private javax.swing.JLabel linea1;
    private javax.swing.JLabel linea2;
    private javax.swing.JLabel lineaNickName;
    private javax.swing.JLabel lineaPassword;
    private javax.swing.JLabel lineaPregunta;
    private javax.swing.JLabel lineaRespuesta;
    private javax.swing.JList<String> listaDePreguntas;
    private javax.swing.JButton minimizar;
    private javax.swing.JScrollPane otrasPreguntas;
    private javax.swing.JPasswordField passwordFieldPassword;
    private javax.swing.JButton preguntas;
    private javax.swing.JLabel registrar;
    private javax.swing.JButton regresar;
    private javax.swing.JButton seePassword;
    private javax.swing.JTextField textFieldNickName;
    private javax.swing.JTextField textFieldRespuesta;
    private javax.swing.JTextField textFieldpregunta;
    // End of variables declaration//GEN-END:variables
}
