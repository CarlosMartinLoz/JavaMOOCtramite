/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Funcionamiento.Conexion;
import javax.swing.ImageIcon;
import recursograficoscom.Barras;

/**
 *
 * @author Durfen
 */
public class CorrecionTextos extends javax.swing.JFrame {
    //elementos gráficos
     private Barras barrasupe = new Barras();
     
     //elementos lógicos
     private int idusuario,idcorrecion;
     //indica que tipo de ejercicio es
     private boolean tipoejercicio;

     
     //Constructor
    public CorrecionTextos(int idusuario,int idcorrecion,boolean tipoejercicio) {
        setIconImage (new ImageIcon(getClass().getResource("/Imagenescomun/Logo.png")).getImage());
        this.tipoejercicio = tipoejercicio;
        this.idusuario = idusuario;
        this.idcorrecion = idcorrecion;
        initComponents();
        setVisible(true);
        setResizable(false); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        puntua4 = new javax.swing.JLabel();
        tabla = new javax.swing.JLabel();
        puntua5 = new javax.swing.JLabel();
        puntua3 = new javax.swing.JLabel();
        puntua2 = new javax.swing.JLabel();
        puntua1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(958, 469));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        puntua4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                puntua4MouseClicked(evt);
            }
        });
        getContentPane().add(puntua4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 110, 100));

        tabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescorrecion/correciontextos.png"))); // NOI18N
        getContentPane().add(tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 579, -1));

        puntua5.setText("jLabel5");
        puntua5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                puntua5MouseClicked(evt);
            }
        });
        getContentPane().add(puntua5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 100, 90));

        puntua3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                puntua3MouseClicked(evt);
            }
        });
        getContentPane().add(puntua3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 100, 90));

        puntua2.setText("jLabel2");
        puntua2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                puntua2MouseClicked(evt);
            }
        });
        getContentPane().add(puntua2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 110, 100));

        puntua1.setText("jLabel6");
        puntua1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                puntua1MouseClicked(evt);
            }
        });
        getContentPane().add(puntua1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 120, 110));

        jLabel1.setText("Puntúa");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 90, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void puntua5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_puntua5MouseClicked
       //If diferenciar tipo ejercicio
            if(tipoejercicio){
                Conexion conexion = new Conexion();
                conexion.correcionintroduccion(idcorrecion, 5);
                Inicio inicio = new Inicio(idusuario);
                dispose();
            }else{
                Conexion conexion = new Conexion();
                conexion.correcionExpresion(idcorrecion, 5);
                Inicio inicio = new Inicio(idusuario);
                dispose();
            }
    }//GEN-LAST:event_puntua5MouseClicked

    private void puntua1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_puntua1MouseClicked
        //If diferenciar tipo ejercicio
        if(tipoejercicio){
            System.out.println("hola");
                Conexion conexion = new Conexion();
                conexion.correcionintroduccion(idcorrecion, 1);
                Inicio inicio = new Inicio(idusuario);
                dispose();
        }else{
                System.out.println("d");
                Conexion conexion = new Conexion();
                conexion.correcionExpresion(idcorrecion, 1);
                Inicio inicio = new Inicio(idusuario);
                dispose();
            }
    }//GEN-LAST:event_puntua1MouseClicked

    private void puntua2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_puntua2MouseClicked
        //If diferenciar tipo ejercicio
        if(tipoejercicio){
                Conexion conexion = new Conexion();
                conexion.correcionintroduccion(idcorrecion, 2);
                Inicio inicio = new Inicio(idusuario);
                dispose();
        }else{
                Conexion conexion = new Conexion();
                conexion.correcionExpresion(idcorrecion, 2);
                Inicio inicio = new Inicio(idusuario);
                dispose();
            }
    }//GEN-LAST:event_puntua2MouseClicked

    private void puntua3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_puntua3MouseClicked
        //If diferenciar tipo ejercicio
        if(tipoejercicio){
                Conexion conexion = new Conexion();
                conexion.correcionintroduccion(idcorrecion, 3);
                Inicio inicio = new Inicio(idusuario);
                dispose();
        }else{
                Conexion conexion = new Conexion();
                conexion.correcionExpresion(idcorrecion, 3);
                Inicio inicio = new Inicio(idusuario);
                dispose();
            }
    }//GEN-LAST:event_puntua3MouseClicked

    private void puntua4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_puntua4MouseClicked
        //If diferenciar tipo ejercicio
        if(tipoejercicio){
                Conexion conexion = new Conexion();
                conexion.correcionintroduccion(idcorrecion, 4);
                Inicio inicio = new Inicio(idusuario);
                dispose();
        }else{
                Conexion conexion = new Conexion();
                conexion.correcionExpresion(idcorrecion, 4);
                Inicio inicio = new Inicio(idusuario);
                dispose();
            }
    }//GEN-LAST:event_puntua4MouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel puntua1;
    private javax.swing.JLabel puntua2;
    private javax.swing.JLabel puntua3;
    private javax.swing.JLabel puntua4;
    private javax.swing.JLabel puntua5;
    private javax.swing.JLabel tabla;
    // End of variables declaration//GEN-END:variables
}
