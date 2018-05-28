/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Funcionamiento.ConexionSeleccion;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import recursograficoscom.Barras;
import recursograficoscom.Fondo;

/**
 *
 * @author Durfen
 */
public class SeleccionCorrecion extends javax.swing.JFrame {
    //id del usuario
    private int id;
    //Clase que nos devuelve la información para la correción.
    private ConexionSeleccion seleccion;
    private Barras barrasupe = new Barras();
    private Fondo fondo = new Fondo();
    /**
     * Creates new form Seleccioncorrecion
     */
    //constructor, se obtiene el id del usuario
    public SeleccionCorrecion(int id) {
        this.id = id;
        initComponents();
        iniciarcomponentes();

    }
    private void iniciarcomponentes(){
        //se hace no ,modificable
        setResizable(false); 
        setLocationRelativeTo(null);
        setIconImage (new ImageIcon(getClass().getResource("/Imagenescomun/Logo.png")).getImage());
        //inclusion elementos gráficos
        add(barrasupe);
        add(fondo);
        barrasupe.setBounds(0, 0, 600, 20);
        fondo.setBounds(0, 0, 5888, 600);                
        setVisible(true);
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonintroduccion = new javax.swing.JLabel();
        botonexpresion = new javax.swing.JLabel();
        botonpronun = new javax.swing.JLabel();
        botonback = new javax.swing.JLabel();
        enunciado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonintroduccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescorrecionpares/introduccioncorrecion.png"))); // NOI18N
        botonintroduccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonintroduccionMouseClicked(evt);
            }
        });

        botonexpresion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescorrecionpares/expresionescritacorrecion.png"))); // NOI18N
        botonexpresion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonexpresionMouseClicked(evt);
            }
        });

        botonpronun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescorrecionpares/pronunciacioncorrecion.png"))); // NOI18N
        botonpronun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonpronunMouseClicked(evt);
            }
        });

        botonback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenescomun/botonback.png"))); // NOI18N
        botonback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonbackMouseClicked(evt);
            }
        });

        enunciado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Enunciados/seleccion.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonintroduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonpronun)
                            .addComponent(botonexpresion, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonback, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 111, Short.MAX_VALUE)
                .addComponent(enunciado)
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(enunciado)
                .addGap(26, 26, 26)
                .addComponent(botonintroduccion)
                .addGap(29, 29, 29)
                .addComponent(botonexpresion, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(botonpronun, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(botonback, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //evento introduccion
    private void botonintroduccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonintroduccionMouseClicked
        seleccion = new ConexionSeleccion(id);
        seleccion.seleccionarIntroduccion();
        dispose();
    }//GEN-LAST:event_botonintroduccionMouseClicked
    //evento expresion
    private void botonexpresionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonexpresionMouseClicked
        // TODO add your handling code here:
        seleccion = new ConexionSeleccion(id);
        seleccion.seleccionarMensaje();
        dispose();
    }//GEN-LAST:event_botonexpresionMouseClicked
    //evento pronunciacion
    private void botonpronunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonpronunMouseClicked
        // TODO add your handling code here:
        seleccion = new ConexionSeleccion(id);
        seleccion.seleccionarEnlace();
        dispose();
    }//GEN-LAST:event_botonpronunMouseClicked

    private void botonbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonbackMouseClicked
        // TODO add your handling code here:
        Inicio inicio = new Inicio(id);
        dispose();
    }//GEN-LAST:event_botonbackMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonback;
    private javax.swing.JLabel botonexpresion;
    private javax.swing.JLabel botonintroduccion;
    private javax.swing.JLabel botonpronun;
    private javax.swing.JLabel enunciado;
    // End of variables declaration//GEN-END:variables
}
