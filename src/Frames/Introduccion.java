/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import recursograficoscom.Barras;
import recursograficoscom.Botones;
import recursograficoscom.Fondo;
    
/**
 *
 * @author Durfen
 */

//Clase "videos" introducción
public class Introduccion extends javax.swing.JFrame {
    //elementos gráficos
     private ImageIcon imgen2 = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenesintroduccion/Introduccion1.png")).getImage());
     private Botones nextboton = new Botones();
     private Barras barrasupe = new Barras();
     private Fondo fondo = new Fondo();
     //contador para switch e id usuario
     private int contador = 1;
     private int id;
     
     
     
    //constructor
    public Introduccion(int id) {
        setIconImage (new ImageIcon(getClass().getResource("/Imagenescomun/Logo.png")).getImage());
        this.id = id;
        initComponents();
        initComponents();
        add(barrasupe);
        add(fondo); 
        barrasupe.setBounds(0, 0, 850, 20);
        fondo.setBounds(0, 0, 5888, 600);
        guion.setIcon(imgen2);
        next.setIcon(nextboton.Botonnext());
        this.setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false); 
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guion = new javax.swing.JLabel();
        next = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(guion, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(guion, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseClicked
        //switch indica que paso está
        switch(contador){
            case 1:
                contador++;
                imgen2 = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenesintroduccion/Introduccion2.png")).getImage());
                guion.setIcon(imgen2);
                //repintado actualizacion imagen
                repaint();

                
                break;
            case 2:
                imgen2 = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenesintroduccion/introduccion3.png")).getImage());
                guion.setIcon(imgen2);
                contador++;
                break;
            case 3:
                TestIntroduccion test = new TestIntroduccion(id);
                test.setVisible(true);
                dispose();
                
                
        }
    }//GEN-LAST:event_nextMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel guion;
    private javax.swing.JLabel next;
    // End of variables declaration//GEN-END:variables
}
