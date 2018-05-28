/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import recursograficoscom.Barras;
import recursograficoscom.Botones;
import recursograficoscom.Fondo;

/**
 *
 * @author Durfen
 */
public class TestGramatica extends javax.swing.JFrame {
    //se añaden los gráficos
    private Barras barrasupe = new Barras();
    private Botones next = new Botones();
    private ButtonGroup group = new ButtonGroup();
    private Fondo fondo = new Fondo();
    // resultados si la respuesta es correcta o incorrecta
    private static int contador;
    private boolean[] resultados = {false,false,false,false,false,false,false,false};
    private int id;
    
    //Constructor
    public TestGramatica(int id) {
        this.id = id;
        initComponents();
        iniciarcomponentes();
        setVisible(true);
        
        
    }
    //se inician los componentes de manera manual
    private void iniciarcomponentes(){
        setIconImage (new ImageIcon(getClass().getResource("/Imagenescomun/Logo.png")).getImage());
        opcion1.setContentAreaFilled(false);
        opcion2.setContentAreaFilled(false);
        opcion3.setContentAreaFilled(false);
        opcion4.setContentAreaFilled(false);
        contador = 1;
        this.getContentPane().setBackground(Color.white);
        add(barrasupe);
        add(fondo);
        barrasupe.setBounds(0, 0, 550, 20);
        barrasupe.setVisible(true);
        botonnext.setIcon(next.Botonnext());
        group.add(opcion1);
        group.add(opcion2);
        group.add(opcion3);
        group.add(opcion4);
        opcion1.setBackground(Color.white);
        opcion2.setBackground(Color.white);
        opcion3.setBackground(Color.white);
        opcion4.setBackground(Color.white);
        fondo.setBounds(0, 0, 5888, 600);
        setLocationRelativeTo(null);
        setResizable(false); 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enunciado = new javax.swing.JLabel();
        opcion1 = new javax.swing.JRadioButton();
        opcion2 = new javax.swing.JRadioButton();
        opcion3 = new javax.swing.JRadioButton();
        opcion4 = new javax.swing.JRadioButton();
        botonnext = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        enunciado.setText("Tiene que ... al mostrador de la segunda planta. ");

        opcion1.setText("Acudir");

        opcion2.setText("Acuda");

        opcion3.setText("Presentar");

        opcion4.setText("Presente");

        botonnext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonnextMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Enunciados/enunciadotestnormal.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(opcion1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(opcion3)
                        .addGap(65, 65, 65))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(opcion2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(opcion4)
                        .addGap(69, 69, 69))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonnext, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(48, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcion1)
                    .addComponent(opcion3))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcion2)
                    .addComponent(opcion4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(botonnext, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonnextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonnextMouseClicked
        // TODO add your handling code here:
        //Se recorre el texto
        switch(contador){
            case 1:            
                if(group.getSelection() == opcion1.getModel()){
                    resultados[0]=true;
                }
           
                enunciado.setText("...la ficha con sus datos personales.");
                group.clearSelection();
                opcion1.setText("Solicite");
                opcion2.setText("Solicitar");
                opcion3.setText("Rellene");
                opcion4.setText("Rellenar");
                contador++;
                break;
            case 2:
                if(group.getSelection() == opcion3.getModel()){
                    resultados[1]=true;
                }
                enunciado.setText("Tiene que ... el documento al trabajador de aquella mesa.");
                group.clearSelection();
                opcion1.setText("Presentar");
                opcion2.setText("Presente");
                opcion3.setText("Acudir");
                opcion4.setText("Acuda");
                contador++;
                break;
            case 3:
                if(group.getSelection() == opcion1.getModel()){
                    resultados[2]=true;
                }
                enunciado.setText("Para que le atiendan, hay que ... cita previa.");
                group.clearSelection();
                opcion1.setText("poseer");
                opcion2.setText("posea");
                opcion3.setText("solicitar");
                opcion4.setText("solicite");
                contador++;
                break;
            case 4:
                if(group.getSelection() == opcion3.getModel()){
                    resultados[3]=true;
                }
                enunciado.setText("... cumplimentar este formulario con sus datos personales.");
                group.clearSelection();
                opcion1.setText("Debe");
                opcion2.setText("Deber");
                opcion3.setText("Aparece");
                opcion4.setText("Aparecer");
                contador++;
                break;
            case 5:
                if(group.getSelection() == opcion1.getModel()){
                    resultados[4]=true;
                }
                enunciado.setText("¿Esta ficha se la tengo que ... a usted?");
                group.clearSelection();
                opcion1.setText("necesitar");
                opcion2.setText("necesite");
                opcion3.setText("entregar");
                opcion4.setText("entregue");
                contador++;
                break;
            case 6:
                if(group.getSelection() == opcion3.getModel()){
                    resultados[5]=true;
                }
                enunciado.setText("Hay que ... un NIE para poder obtener la tarjeta.");
                group.clearSelection();
                opcion1.setText("tenga");
                opcion2.setText("tener");
                opcion3.setText("estar");
                opcion4.setText("esté");
                contador++;
                break;
            case 7:
                if(group.getSelection() == opcion2.getModel()){
                    resultados[6]=true;
                }
                enunciado.setText("... con su nombre y apellidos aquí.");
                group.clearSelection();
                opcion1.setText("Complete");
                opcion2.setText("completar");
                opcion3.setText("llamar");
                opcion4.setText("llame");
                contador++;
                break;
            case 8:
                if(group.getSelection() == opcion1.getModel()){
                    resultados[6]=true;
                }
                System.out.println(id);
                Resultados resultado = new Resultados(resultados,id,3);
                dispose();
                
                
        }
    }//GEN-LAST:event_botonnextMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonnext;
    private javax.swing.JLabel enunciado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton opcion1;
    private javax.swing.JRadioButton opcion2;
    private javax.swing.JRadioButton opcion3;
    private javax.swing.JRadioButton opcion4;
    // End of variables declaration//GEN-END:variables
}
