/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionamiento;

import java.io.BufferedReader;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 *
 * @author Durfen
 */
/*
    Futuro uso: Limitar al usuario los ejercicios para que los haga
    en orden.
*/
public class Leer {
    
    private File archivo;
    private FileReader frleer;
    private FileWriter fwescribir;
    private BufferedReader leer;
    private BufferedWriter escribir;
    private static String [] almasplit;
    private String parte;
    
    public void  leer(){
        //se utiliza Stream de la Api de java 8
        String ruta ="src/texto/comprobar.txt";
        //se utiliza Stream de la Api de java 8
        
        List <String> lista = new ArrayList<>();
        Path path = Paths.get(ruta);
        Stream <String> stream;
        try {
            stream = Files.lines(path);
        
        stream.forEach(s->lista.add(s));
        
        } catch (IOException ex) {
            Logger.getLogger(Leer.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i)+"\n");
        }
        
        
         
    }
    public void escribir(String cadena,int numcambio){
        
    }
    
}
