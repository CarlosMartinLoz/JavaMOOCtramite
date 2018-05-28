/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursograficoscom;

import javax.swing.ImageIcon;

/**
 *
 * @author Durfen
 */
public class Botones {
    public ImageIcon Botonnext(){
        ImageIcon img = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenescomun/next.png")).getImage());
        return img;
    }
    public ImageIcon Botonback(){
        ImageIcon img = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenescomun/botonback.png")).getImage());
        return img;
    }
}
