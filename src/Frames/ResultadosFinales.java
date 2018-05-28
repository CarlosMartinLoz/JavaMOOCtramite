/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Funcionamiento.ConexionResultados;
import javax.swing.ImageIcon;
import recursograficoscom.Barras;
import recursograficoscom.Fondo;

/**
 *
 * @author Durfen
 */
public class ResultadosFinales extends javax.swing.JFrame {
    //elementos lógicos
    private ConexionResultados conexion;
    private int id;
    //elementos gráficos
    private Fondo fondo = new Fondo();
    private Barras barrasupe = new Barras();
    
  
    
    //Constructor
    public ResultadosFinales(int id) {
        this.id = id;
        this.setSize(800, 600);
        initComponents();
        iniciarcomponentes();
    }
    //iniciar de manera manual
    private void iniciarcomponentes(){
        setIconImage (new ImageIcon(getClass().getResource("/Imagenescomun/Logo.png")).getImage());
        setLocationRelativeTo(null);
        setResizable(false);
        add(barrasupe);
        add(fondo);
        barrasupe.setBounds(0,0,820,20);
        fondo.setBounds(0, 0, 5888, 600);
        conexion = new ConexionResultados(id);
        resultadointro.setText(conexion.resultadoIntroduccion());
        resultadopronun.setText(conexion.resultadoPronunciacion());
        resultadoexpresion.setText(conexion.resultadoExpresionescrita());
        textgramatica.setText(conexion.resultadoGramatica());
        textoral.setText(conexion.resultadoVideo());
        textlectora.setText(conexion.resultadoLectora());
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        resultadointro = new javax.swing.JLabel();
        textgramatica = new javax.swing.JLabel();
        resultadopronun = new javax.swing.JLabel();
        textlectora = new javax.swing.JLabel();
        textoral = new javax.swing.JLabel();
        resultadoexpresion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(null);
        setPreferredSize(new java.awt.Dimension(600, 550));
        setSize(new java.awt.Dimension(620, 550));
        getContentPane().setLayout(null);

        jLabel1.setText("Introducción");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 120, 132, 25);

        jLabel3.setText("Gramática");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 150, 98, 24);

        jLabel4.setText("Pronunciación");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 200, 98, 23);

        jLabel5.setText("Compresión lectora");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(100, 240, 124, 22);

        jLabel6.setText("Expresión escrita:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 310, 109, 26);

        jLabel7.setText("Compresión oral");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(100, 280, 109, 23);

        resultadointro.setText("a");
        getContentPane().add(resultadointro);
        resultadointro.setBounds(220, 120, 270, 19);

        textgramatica.setText("a");
        getContentPane().add(textgramatica);
        textgramatica.setBounds(220, 160, 270, 14);

        resultadopronun.setText("a");
        getContentPane().add(resultadopronun);
        resultadopronun.setBounds(222, 197, 257, 23);

        textlectora.setText("a");
        getContentPane().add(textlectora);
        textlectora.setBounds(222, 238, 257, 22);

        textoral.setText("a");
        getContentPane().add(textoral);
        textoral.setBounds(222, 282, 257, 14);

        resultadoexpresion.setText("a");
        getContentPane().add(resultadoexpresion);
        resultadoexpresion.setBounds(222, 317, 257, 14);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenescomun/marco.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 100, 410, 270);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenescomun/botonback.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 440, 150, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        Inicio inicio = new Inicio(id);
        dispose();
    }//GEN-LAST:event_jLabel8MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel resultadoexpresion;
    private javax.swing.JLabel resultadointro;
    private javax.swing.JLabel resultadopronun;
    private javax.swing.JLabel textgramatica;
    private javax.swing.JLabel textlectora;
    private javax.swing.JLabel textoral;
    // End of variables declaration//GEN-END:variables
}
