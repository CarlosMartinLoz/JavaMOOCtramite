package Frames;

import Funcionamiento.Cifrardes;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import recursograficoscom.Fondo;


/**
 *
 * @author Durfen
 */

//Clase creación de usuario
public class CrearUsuario extends javax.swing.JFrame {

    //elementos gráficos
    private Fondo fondo = new Fondo();
    //elementos lógicos
    private ResultSet rs;
    private Connection cn = null;
    private final String ruta = "jdbc:mysql://db4free.net:3306/proyectoelena?autoReconnect=true&useSSL=false";
    private final String usuario = "durfen";
    private final String contraseña = "Mariobrostomija1";
    private Statement statement;
    private PreparedStatement pstatement;
    private int id;
    private Cifrardes cifra = new Cifrardes();
    private String cifrarcontrasena;

    //constructor
    public CrearUsuario(int id) {
        this.id = id;
        initComponents();
        iniciarcomponentes();
        listener();
    }

    //componentes inciados de manera manual
    private void iniciarcomponentes() {
        setIconImage(new ImageIcon(getClass().getResource("/Imagenescomun/Logo.png")).getImage());
        add(fondo);
        fondo.setBounds(0, 0, 1500, 600);
        textusuario.setToolTipText("Máximo 16 caracteres, mínimo 6");
        textcontrasena.setToolTipText("Máximo 16 caracteres, mínimo 6");
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textusuario = new javax.swing.JTextField();
        textcontrasena = new javax.swing.JTextField();
        labelusuario = new javax.swing.JLabel();
        labelcontrasena = new javax.swing.JLabel();
        botonaceptar = new javax.swing.JLabel();
        labeltitulo = new javax.swing.JLabel();
        botonback = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelusuario.setText("Usuario");

        labelcontrasena.setText("Contraseña");

        botonaceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenescomun/next.png"))); // NOI18N
        botonaceptar.setText("jLabel3");
        botonaceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonaceptarMouseClicked(evt);
            }
        });

        labeltitulo.setText("Crear usuario");

        botonback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenescomun/botonback.png"))); // NOI18N
        botonback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonbackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labeltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelusuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelcontrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textcontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(147, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(botonback, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonaceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(labeltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelusuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textusuario))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textcontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelcontrasena))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addComponent(botonaceptar)
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //eventos boton
    private void botonaceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonaceptarMouseClicked
        
        if (textusuario.getText().length() >= 6 && textcontrasena.getText().length() >= 6) {
            try {
                //se crea la conexión
                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection(ruta, usuario, contraseña);
                statement = cn.createStatement();

                //se ejecuta el query obteniendo el id del último usuario
                rs = statement.executeQuery("select user from usuarios where user ='" + textusuario.getText() + "'");

                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Usuario ya existente");
                } else {
                    rs = statement.executeQuery("select max(id) from usuarios");
                    while (rs.next()) {
                        id = rs.getInt(1);
                    }
                    id++;
                    pstatement = cn.prepareStatement("insert into usuarios values(?,?,?)");
                    pstatement.setInt(1, id);
                    pstatement.setString(2, textusuario.getText());
                    pstatement.setString(3, cifra.cifrar(textcontrasena.getText()));
                    pstatement.executeUpdate();
                    pstatement.close();
                    statement.close();
                    cn.close();
                    JOptionPane.showMessageDialog(null, "Usuario creado, ahora debes loguearte para usar el MOOC.");
                }
                //se vuelve a inicio
                Inicio intro = new Inicio();
                dispose();
            } catch (Exception ex) {
                Logger.getLogger(CrearUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se cumplen las condiciones.");
        }
    }//GEN-LAST:event_botonaceptarMouseClicked

    private void botonbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonbackMouseClicked
        // TODO add your handling code here:
        Inicio inicio = new Inicio(id);
        dispose();
    }//GEN-LAST:event_botonbackMouseClicked
    //evento listener donde se implementan la limitación de caracteres de usuario y contraseña   
    private void listener() {
        //se limita la posibilidad de escribir a 16 caracteres

        textusuario.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {

                // Verificar si la tecla pulsada no es un digito
                if (textusuario.getText().length() == 16) {
                    e.consume();  // ignorar el evento de teclado
                }
            }
        });
        textcontrasena.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {

                // Verificar si la tecla pulsada no es un digito
                if (textcontrasena.getText().length() == 16) {
                    e.consume();  // ignorar el evento de teclado
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonaceptar;
    private javax.swing.JLabel botonback;
    private javax.swing.JLabel labelcontrasena;
    private javax.swing.JLabel labeltitulo;
    private javax.swing.JLabel labelusuario;
    private javax.swing.JTextField textcontrasena;
    private javax.swing.JTextField textusuario;
    // End of variables declaration//GEN-END:variables
}
