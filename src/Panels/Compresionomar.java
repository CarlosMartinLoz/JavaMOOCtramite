/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author Durfen
 */
public class Compresionomar extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public Compresionomar() {
        initComponents();
        listener();

    }

    private void iniciarcomponentes() {
        textdia.setToolTipText("Debes indicar el día, si es menor a 10 debes poner antes un 0. Ejemplo: Dia - 05");
        
    }

    public boolean respuestacorrecta() {
        String posiblenul;

        if (textpapellido.getText().equalsIgnoreCase("Jayam")
                && textnombre.getText().equalsIgnoreCase("Omar")
                && textsexo.equals("H") && textdia.getText().equals("08") && textmes.getText().equalsIgnoreCase("mayo")
                && textano.getText().equals("1984")) {
            return true;

        } else {
            return false;
        }

    }

    private void listener() {
        //se limita la posibilidad de escribir a 200 caracteres0
        int limite = 200;
        textpapellido.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {

                // Verificar si la tecla pulsada no es un digito
                if (textpapellido.getText().length() == "Jayam".length()) {
                    e.consume();  // ignorar el evento de teclado
                }
            }
        });
        textnombre.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {

                // Verificar si la tecla pulsada no es un digito
                if (textnombre.getText().length() == "Omar".length()) {
                    e.consume();  // ignorar el evento de teclado
                }
            }
        });
        textsexo.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {

                // Verificar si la tecla pulsada no es un digito
                if (textsexo.getText().length() == 2 || e.getKeyChar()=='H'||e.getKeyChar()=='h'||e.getKeyChar()=='M'||e.getKeyChar()=='m') {
                    e.consume();  // ignorar el evento de teclado
                }
            }
        });
        textdia.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {

                // Verificar si la tecla pulsada no es un digito
                if (textdia.getText().length() == 2 || e.getKeyChar()<'0'||e.getKeyChar()>'9'&& e.getKeyChar()!= '\b') {
                    e.consume();  // ignorar el evento de teclado
                }
            }
        });
        textano.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {

                // Verificar si la tecla pulsada no es un digito
                if (textano.getText().length() == 4 || e.getKeyChar()<'0'||e.getKeyChar()>'9'&& e.getKeyChar()!= '\b') {
                    e.consume();  // ignorar el evento de teclado
                }
            }
        });
        textmes.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {

                // Verificar si la tecla pulsada no es un digito
                if (textano.getText().length() == 6) {
                    e.consume();  // ignorar el evento de teclado
                }
            }
        });
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textpapellido = new javax.swing.JTextField();
        textsapellido = new javax.swing.JTextField();
        textnombre = new javax.swing.JTextField();
        papellidolabel = new javax.swing.JLabel();
        sapellidolabel = new javax.swing.JLabel();
        nombrelabel = new javax.swing.JLabel();
        labelsexo = new javax.swing.JLabel();
        textsexo = new javax.swing.JTextField();
        fechalabel = new javax.swing.JLabel();
        dialabel = new javax.swing.JLabel();
        textdia = new javax.swing.JTextField();
        textmes = new javax.swing.JTextField();
        meslabel = new javax.swing.JLabel();
        anolabel = new javax.swing.JLabel();
        textano = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(571, 170));

        papellidolabel.setText("Primer apellido");

        sapellidolabel.setText("Segundo apellido");

        nombrelabel.setText("Nombre");

        labelsexo.setText("Sexo");

        fechalabel.setText("Fecha de nacimiento");

        dialabel.setText("Día");

        meslabel.setText("Mes");

        anolabel.setText("Año");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(papellidolabel, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(textpapellido))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textsapellido)
                            .addComponent(sapellidolabel, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textnombre)
                            .addComponent(nombrelabel, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelsexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textsexo))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dialabel)
                                .addGap(18, 18, 18)
                                .addComponent(textdia, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(meslabel)
                                .addGap(18, 18, 18)
                                .addComponent(textmes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(anolabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textano, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fechalabel))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(papellidolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sapellidolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nombrelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textpapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textsapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelsexo)
                    .addComponent(fechalabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dialabel)
                    .addComponent(textdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meslabel)
                    .addComponent(anolabel)
                    .addComponent(textano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anolabel;
    private javax.swing.JLabel dialabel;
    private javax.swing.JLabel fechalabel;
    private javax.swing.JLabel labelsexo;
    private javax.swing.JLabel meslabel;
    private javax.swing.JLabel nombrelabel;
    private javax.swing.JLabel papellidolabel;
    private javax.swing.JLabel sapellidolabel;
    private javax.swing.JTextField textano;
    private javax.swing.JTextField textdia;
    private javax.swing.JTextField textmes;
    private javax.swing.JTextField textnombre;
    private javax.swing.JTextField textpapellido;
    private javax.swing.JTextField textsapellido;
    private javax.swing.JTextField textsexo;
    // End of variables declaration//GEN-END:variables
}
