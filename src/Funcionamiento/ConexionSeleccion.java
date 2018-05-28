/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionamiento;
    

import Frames.CorrecionExpresion;
import Frames.CorrecionIntroducion;
import Frames.CorrecionVideo;
import Frames.SeleccionCorrecion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Durfen
 */
/*
    Clase encargada de la selección aleatoria de un ejercicio para su
    correción.
*/

public class ConexionSeleccion {
    //Declaración
    private String query;
    private ResultSet rs;
    private Connection cn = null;
    private final String ruta = "jdbc:mysql://db4free.net:3306/proyectoelena?autoReconnect=true&useSSL=false";
    private final String usuario = "durfen";
    private final String contraseña = "Mariobrostomija1";
    private Statement statement;
    private PreparedStatement pstatement;
    //recogida resultados
    private String resultado;
    private String [] texto = new String[7];
    //id´s usuarios
    private int idusuario;
    private int idquery;
    
    //Constructor
    public ConexionSeleccion(int idusuario){
        this.idusuario = idusuario;
    }
    public void seleccionarEnlace(){
         
        try{
            //abre conexión
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(ruta, usuario, contraseña);
            statement = cn.createStatement();
            //selecciona uno aleatoriamente que no haya sido correguido
            query = "SELECT id,enlace FROM videos where evaluacion is null and id != "+idusuario+ "  ORDER BY RAND() LIMIT 1";
            rs = statement.executeQuery(query);
            //comprobación existencia
            if(rs.next()){
                //obtiene resultados
                idquery = rs.getInt(1);
                resultado = rs.getString(2);
                CorrecionVideo correcion = new CorrecionVideo(idusuario,idquery, resultado);
            }else{
                SeleccionCorrecion correccion = new SeleccionCorrecion(idusuario);
            }//cerrar conexiones
            pstatement.close();
            statement.close();
            rs.close();
            cn.close();
        }catch(Exception e){
            
        }
    }
    public void seleccionarMensaje(){
        try{
            //abre conexión
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(ruta, usuario, contraseña);
            statement = cn.createStatement();
            //selecciona aleatoriamente un valor
            query = "SELECT id,texto FROM expresionescri where evaluacion is null and id != "+idusuario+ " ORDER BY RAND() LIMIT 1";
            rs = statement.executeQuery(query);
            //comprobación existencia
            if(rs.next()){
                idquery = rs.getInt(1);
                resultado = rs.getString(2);
                //crear correcion mensaje
                CorrecionExpresion correcion = new CorrecionExpresion(idusuario,idquery, resultado);
            }else{
                SeleccionCorrecion correccion = new SeleccionCorrecion(idusuario);
            }
            //cerrar conexiones
            pstatement.close();
            statement.close();
            rs.close();
            cn.close();
            
        }catch(Exception e){
            
        }
            
        
    }
    public void seleccionarIntroduccion(){
        try{
            //se abre conexion
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(ruta, usuario, contraseña);
            statement = cn.createStatement();
            query = "SELECT id,texto1,texto2,texto3,texto4,texto5,texto6,texto7 FROM introduccion where evaluacion is null and id != "+idusuario+" ORDER BY RAND() LIMIT 1";
            rs = statement.executeQuery(query);
            //comprobación existencia
            if(rs.next()){
                idquery = rs.getInt(1);
                texto[0] = rs.getString(2);
                texto[1] = rs.getString(3);
                texto[2] = rs.getString(4);
                texto[3] = rs.getString(5);
                texto[4] = rs.getString(6);
                texto[5] = rs.getString(7);
                texto[6] = rs.getString(8);
                //crear correcion mensaje
                CorrecionIntroducion correcion = new CorrecionIntroducion(idusuario,idquery, texto);
            }else{
                SeleccionCorrecion correccion = new SeleccionCorrecion(idusuario);
            }
            //cerrar conexiones
            pstatement.close();
            statement.close();
            rs.close();
            cn.close();
        }catch(Exception e){
            
        }
    }
}
