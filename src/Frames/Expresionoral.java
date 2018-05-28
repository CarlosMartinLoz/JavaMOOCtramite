/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import javax.swing.ImageIcon;
import recursograficoscom.Barras;
import recursograficoscom.Fondo;

/**
 *
 * @author Durfen
 */
public class Expresionoral extends javax.swing.JFrame {
    private Fondo fondo = new Fondo();
    private Barras barrasupe = new Barras();
    private int id;

    //constructor
    public Expresionoral(int id) {
        this.id = id;
        initComponents();
        iniciarcomponentes();
        this.setResizable(false);
        
        
    }
    //Se inician los componentes de manera manual
    private void iniciarcomponentes(){
        setIconImage (new ImageIcon(getClass().getResource("/Imagenescomun/Logo.png")).getImage());
        add(barrasupe);
        barrasupe.setBounds(0, 0, 850, 20);
        add(fondo);
        fondo.setBounds(0, 0, 5888, 600);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        texto = new javax.swing.JLabel();
        botonnext = new javax.swing.JLabel();
        enunciado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        texto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/expresionoralfrase.png"))); // NOI18N

        botonnext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenescomun/next.png"))); // NOI18N
        botonnext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonnextMouseClicked(evt);
            }
        });

        enunciado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/enunciadoexpresion.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonnext)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(texto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(enunciado)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(enunciado, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonnext)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonnextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonnextMouseClicked
        UrlExpresion url = new UrlExpresion(id);
        dispose();
    }//GEN-LAST:event_botonnextMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonnext;
    private javax.swing.JLabel enunciado;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables
}
