/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Panels.Compresionkhadija;
import recursograficoscom.Barras;
import Panels.Compresionabdul;
import Panels.Compresionomar;
import Panels.fotocompresion;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import recursograficoscom.Botones;
import recursograficoscom.Fondo;

/**
 *
 * @author Durfen
 */
/*
    Ejercicio de compresión lectora
 */
public class CompresionLectora extends javax.swing.JFrame {

    //elementos gráficos
    private Compresionkhadija khadija = new Compresionkhadija();
    private Compresionomar omar = new Compresionomar();
    private Compresionabdul adbul = new Compresionabdul();
    private Barras barrasupe = new Barras();
    private fotocompresion foto = new fotocompresion("/Imagenes/Khadija.png");
    private fotocompresion foto2 = new fotocompresion("/Imagenes/Omar.png");
    private fotocompresion foto3 = new fotocompresion("/Imagenes/Abdul.png");
    private Botones imgbotonext = new Botones();
    private Fondo fondo = new Fondo();
    //elementos lógicos
    private int id;
    private int numejercicio = 1;

    //Constructor
    public CompresionLectora(int id) {
        this.id = id;
        initComponents();
        añadircomponentes();

    }

    //Se añaden los Jpanel y otros componentes que se añaden por código
    public void añadircomponentes() {
        setIconImage(new ImageIcon(getClass().getResource("/Imagenescomun/Logo.png")).getImage());
        setResizable(false);
        //añadir, se añade último el fondo para que no solape lo demás
        add(khadija);
        add(barrasupe);
        add(foto);
        add(fondo);
        khadija.setVisible(true);
        khadija.setBounds(100, 300, 571, 170);
        //colocar
        barrasupe.setBounds(0, 0, 820, 20);
        //imagen boton
        nextboton.setIcon(imgbotonext.Botonnext());
        foto.setBounds(60, 130, 659, 187);
        fondo.setBounds(0, 0, 5888, 600);
        pack();

        this.setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nextboton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        nextboton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextbotonMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Enunciados/enunciadocompresion.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(628, Short.MAX_VALUE)
                .addComponent(nextboton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 407, Short.MAX_VALUE)
                .addComponent(nextboton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextbotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextbotonMouseClicked
        //Switch identificción ejercicio
        switch (numejercicio) {
            case 1:
                //se comprueba que sea correcto
                if (khadija.respuestacorrecta()) {
                    JOptionPane.showMessageDialog(null, "RESPUESTA CORRECTA");
                    khadija.updateUI();
                    //Se remueve y añade fondo para que no solape lo demás
                    remove(foto);
                    remove(khadija);
                    remove(fondo);
                    add(omar);
                    add(foto2);
                    add(fondo);
                    fondo.setBounds(0, 0, 5888, 600);
                    foto2.setBounds(60, 130, 659, 187);
                    omar.setBounds(100, 300, 571, 170);
                    omar.setVisible(true);
                    //se repinta el frame
                    repaint();
                    numejercicio++;

                } else {
                    //Mensaje incorrecto
                    JOptionPane.showMessageDialog(null, "Datos introducidos incorrectos, revisa tus respuestas."
                            + "\n       Ten en cuenta que es sensible a mayúsculas.");
                }

                break;
            case 2:
                //se comprueba que sea correcto
                if (omar.respuestacorrecta()) {
                    omar.updateUI();
                    //Se remueve y añade fondo para que no solape lo demás
                    remove(foto2);
                    remove(omar);
                    remove(fondo);
                    add(foto3);
                    add(adbul);
                    add(fondo);
                    fondo.setBounds(0, 0, 5888, 600);
                    adbul.setBounds(50, 300, 700, 170);
                    foto3.setBounds(60, 130, 664, 187);
                    //se repinta el fram
                    repaint();
                    numejercicio++;
                } else {
                    //Mensaje incorrecto
                    JOptionPane.showMessageDialog(null, "Datos introducidos incorrectos, revisa tus respuestas."
                            + "\n       Ten en cuenta que es sensible a mayúsculas.");
                }
                break;
            case 3:
                //se comprueba que sea correcto
                if (adbul.respuestacorrecta()) {
                    TestCompresion ts = new TestCompresion(id);
                    dispose();
                } else {
                    //Mensaje incorrecto
                    JOptionPane.showMessageDialog(null, "Datos introducidos incorrectos, revisa tus respuestas."
                            + "\n       Ten en cuenta que es sensible a mayúsculas.");
                }
        }
        
    }//GEN-LAST:event_nextbotonMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nextboton;
    // End of variables declaration//GEN-END:variables
}
