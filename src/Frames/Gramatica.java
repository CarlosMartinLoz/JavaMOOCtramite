/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Panels.fotocompresion;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import recursograficoscom.Barras;
import recursograficoscom.Botones;
import recursograficoscom.Fondo;

/**
 *
 * @author Durfen
 */

//Clase de teoría de gramática
public class Gramatica extends javax.swing.JFrame {
    //declaración elementos gráficos
    private Barras barrasupe = new Barras();
    private Botones imgboton = new Botones();
    private ImageIcon imgen2 = new ImageIcon(new ImageIcon(getClass().getResource("/imagenesgramatica/dar.png")).getImage());
    private JLabel imagencentral = new JLabel();
    private Fondo fondo = new Fondo();
    //contador e id usuario
    private static int contador;
    private int id;
    
    
    //Constructor
    public Gramatica(int id) {
        this.id = id;
        initComponents();  
        iniciarcomponentes();   
    }
    
    
    //Se añaden los elementos de manera manual
    private void iniciarcomponentes(){
        setIconImage (new ImageIcon(getClass().getResource("/Imagenescomun/Logo.png")).getImage());
        contador = 1;
        imagencentral.setIcon(imgen2);
        add(imagencentral);
        add(barrasupe);
        add(fondo);
        imagencentral.setBounds(114,90,500,500);
        barrasupe.setBounds(0,0,720,20);
        nextboton.setIcon(imgboton.Botonnext());
        backboton.setIcon(imgboton.Botonback());
        fondo.setBounds(0, 0, 5888, 700);
        setVisible(true);
        this.setLocationRelativeTo(null);
        setResizable(false); 
     
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nextboton = new javax.swing.JLabel();
        backboton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Enunciados/enunciadogramatica.png"))); // NOI18N

        nextboton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextbotonMouseClicked(evt);
            }
        });

        backboton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbotonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backboton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 387, Short.MAX_VALUE)
                        .addComponent(nextboton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 450, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nextboton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backboton, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextbotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextbotonMouseClicked
        
        //switch que contola en la opción en la que se encuentra
        switch(contador){
            case 1:
                
                imgen2 = new ImageIcon(new ImageIcon(getClass().getResource("/imagenesgramatica/ir.png")).getImage());
                imagencentral.setIcon(imgen2);
                repaint();
                contador++;
                break;
                
            case 2:
                imgen2 = new ImageIcon(new ImageIcon(getClass().getResource("/imagenesgramatica/escribir.png")).getImage());
                imagencentral.setIcon(imgen2);
                
                repaint();
                contador++;
                break;
                
            case 3:
                imgen2 = new ImageIcon(new ImageIcon(getClass().getResource("/imagenesgramatica/pedir.png")).getImage());
                imagencentral.setIcon(imgen2);
                repaint();
                contador++;
                break;
                
            case 4:
                imgen2 = new ImageIcon(new ImageIcon(getClass().getResource("/imagenesgramatica/poder.png")).getImage());
                imagencentral.setIcon(imgen2);
                repaint();
                contador++;
                System.out.println(contador);
                break;
                
            case 5:
                imgen2 = new ImageIcon(new ImageIcon(getClass().getResource("/imagenesgramatica/estar.png")).getImage());
                imagencentral.setIcon(imgen2);
                repaint();
                contador++;
                break;
                
            case 6:
                imgen2 = new ImageIcon(new ImageIcon(getClass().getResource("/imagenesgramatica/poseer.png")).getImage());
                imagencentral.setIcon(imgen2);
                imagencentral.setBounds(100,50,600,600);
                repaint();
                contador++;
                break;
                
            case 7:
                imgen2 = new ImageIcon(new ImageIcon(getClass().getResource("/imagenesgramatica/ejemplos.png")).getImage());
                imagencentral.setBounds(50,50,600,600);
                imagencentral.setIcon(imgen2);
                repaint();
                contador++;
                break;
                
            case 8:
                TestGramatica test = new TestGramatica(id);
                dispose();
                
        }
    }//GEN-LAST:event_nextbotonMouseClicked

    private void backbotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbotonMouseClicked
        // Se añade posibilidad ir hacia atrás
        switch(contador){
            case 2:
                
                imgen2 = new ImageIcon(new ImageIcon(getClass().getResource("/imagenesgramatica/dar.png")).getImage());
                imagencentral.setIcon(imgen2);
                repaint();
                contador--;
                break;
            case 3:
                imgen2 = new ImageIcon(new ImageIcon(getClass().getResource("/imagenesgramatica/ir.png")).getImage());
                imagencentral.setIcon(imgen2);
                repaint();
                contador--;
                break;
            case 4:
                imgen2 = new ImageIcon(new ImageIcon(getClass().getResource("/imagenesgramatica/escribir.png")).getImage());
                imagencentral.setIcon(imgen2);
                repaint();
                contador--;
                break;
            case 5:
                imgen2 = new ImageIcon(new ImageIcon(getClass().getResource("/imagenesgramatica/pedir.png")).getImage());
                imagencentral.setIcon(imgen2);
                repaint();
                contador--;
                System.out.println(contador);
                break;
            case 6:
                imgen2 = new ImageIcon(new ImageIcon(getClass().getResource("/imagenesgramatica/poder.png")).getImage());
                imagencentral.setIcon(imgen2);
                repaint();
                contador--;
                break;
            case 7:
                imgen2 = new ImageIcon(new ImageIcon(getClass().getResource("/imagenesgramatica/estar.png")).getImage());
                imagencentral.setIcon(imgen2);
                imagencentral.setBounds(100,50,600,600);
                repaint();
                contador--;
                break;
            case 8:
                imgen2 = new ImageIcon(new ImageIcon(getClass().getResource("/imagenesgramatica/poseer.png")).getImage());
                imagencentral.setBounds(50,50,600,600);
                imagencentral.setIcon(imgen2);
                repaint();
                contador--;
                break;
            

                
                
        }
    }//GEN-LAST:event_backbotonMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backboton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nextboton;
    // End of variables declaration//GEN-END:variables
}
