/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionamiento;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


//Clase que envia los resultados de los ejercicios
public class Conexion {

    //elementos lógicos
    private ResultSet rs;
    private Connection cn = null;
    //datos acceso BBDD
    private final String ruta = "jdbc:mysql://db4free.net:3306/proyectoelena?autoReconnect=true&useSSL=false";
    private final String usuario = "durfen";
    private final String contraseña = "Mariobrostomija1";
    private Statement statement;
    private PreparedStatement pstatement;
   

    //Envia los resultados de los ejercicios con respuestas String
    public void ejercicioExpresion(int id, String respuestas) {
        try {
            //Abre conexión
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(ruta, usuario, contraseña);
            statement = cn.createStatement();
            //Ejecuta query
            String s = "select id from expresionescri where id = " + id;
            rs = statement.executeQuery(s);
            //Si no devuelve nada significa que que no existen registros del usuario
            if (rs.next()) {
                pstatement = cn.prepareStatement("update expresionescri set id = ?, texto = ? where id = "+id);
                pstatement.setInt(1, id);
                pstatement.setString(2, respuestas);    
                pstatement.executeUpdate();
                //se cierran conexiones
                pstatement.close();
                statement.close();
                cn.close();
            } else {
                //se insertan los datos
                pstatement = cn.prepareStatement("insert into expresionescri(id,texto) values(?,?)");
                pstatement.setInt(1, id);
                pstatement.setString(2, respuestas);
                pstatement.executeUpdate();
                //se cierran conexiones
                pstatement.close();
                statement.close();
                cn.close();
            }
        } catch (Exception e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    //Envia los resultados de los ejercicios tipo test
    public void Test(int id, byte resultado, int correctas, int idejercicio) {
        try {
            //abre conexión
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(ruta, usuario, contraseña);
            //ejecuta query ver si usario ya existe
            statement = cn.createStatement();
            String s = "select id from resultados where id = " + id;
            rs = statement.executeQuery(s);
            System.out.println(id + " " + correctas);
            //si existe update
            if (rs.next()) {
                pstatement = cn.prepareStatement("update resultados set id = ?, resultado = ?, correctas= ?, idtest = ? where id = " + id);
                pstatement.setInt(1, id);
                pstatement.setInt(2, resultado);
                pstatement.setInt(3, correctas);
                pstatement.setInt(4, idejercicio);
                pstatement.executeUpdate();
            } else {
                //en caso false, insert
                pstatement = cn.prepareStatement("insert into resultados values(?,?,?,?)");
                pstatement.setInt(1, id);
                pstatement.setInt(2, resultado);
                pstatement.setInt(3, 1);
                pstatement.setInt(4, idejercicio);
                pstatement.executeUpdate();
            }
            //se cierran conexiones
            pstatement.close();
            statement.close();
            rs.close();
            cn.close();
        } catch (Exception e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void url(int id, String url) {
        try {
            //se abre conexiones
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(ruta, usuario, contraseña);
            //ejecuta query ver si usario ya existe
            statement = cn.createStatement();
            String s = "select id from videos where id = " + id;
            rs = statement.executeQuery(s);
            //si existe update
            if (rs.next()) {
                pstatement = cn.prepareStatement("update videos set enlace = ? where id = " + id);
                pstatement.setString(1, url);
                pstatement.executeUpdate();
                
            } else {
                //en caso false, insert
                pstatement = cn.prepareStatement("insert into videos (id,enlace) values(?,?)");
                pstatement.setInt(1, id);
                pstatement.setString(2, url);
                pstatement.executeUpdate();
            }
            //cerrar conexiones
            pstatement.close();
            statement.close();
            rs.close();
            cn.close();
        } catch (Exception e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public void ejercicioIntroducion(int id, String [] respuestas){
        try{
            //se abren conexiones
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(ruta, usuario, contraseña);
            //ejecuta query
            statement = cn.createStatement();
            String s = "select id from introduccion where id = " + id;
            rs = statement.executeQuery(s);
            //si existe update
            if(rs.next()){
                pstatement = cn.prepareStatement("update introduccion set texto1 = ?,texto2 = ?,texto3 = ?, texto4 = ?, texto5 = ?, "
                        + "texto6 = ?, texto7 = ? where id = " + id);
                pstatement.setString(1, respuestas[0]);
                pstatement.setString(2, respuestas[1]);
                pstatement.setString(3, respuestas[2]);
                pstatement.setString(4, respuestas[3]);
                pstatement.setString(5, respuestas[4]);
                pstatement.setString(6, respuestas[5]);
                pstatement.setString(7, respuestas[6]);
                pstatement.executeUpdate();
            }else{
                //en caso false, insert
                pstatement = cn.prepareStatement("insert into introduccion (id,texto1,texto2,texto3,texto4,texto5,texto6,texto7) values(?,?,?,?,?,?,?,?)");
                pstatement.setInt(1, id);
                pstatement.setString(2, respuestas[0]);
                pstatement.setString(3, respuestas[1]);
                pstatement.setString(4, respuestas[2]);
                pstatement.setString(5, respuestas[3]);
                pstatement.setString(6, respuestas[4]);
                pstatement.setString(7, respuestas[5]);
                pstatement.setString(8, respuestas[6]);
                pstatement.executeUpdate();
            }
            //cerrar conexiones
            pstatement.close();
            statement.close();
            rs.close();
            cn.close();
           
        }catch(Exception e){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void correcionintroduccion(int idsuario,int puntuacion){
        try{
            //abre conexión
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(ruta, usuario, contraseña);
            statement = cn.createStatement();
            //se actualiza evaluación
            pstatement = cn.prepareStatement("update introduccion set evaluacion = ? where id = " + idsuario);
            pstatement.setInt(1, puntuacion);
            pstatement.executeUpdate();
            
            //cerrar conexiones
            pstatement.close();
            statement.close();
            cn.close();
            
        }catch(Exception e){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public void correcionExpresion(int idsuario,int puntuacion){
        try{
            //abre conexión
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(ruta, usuario, contraseña);
            statement = cn.createStatement();
            //actualiza evaluacion
            pstatement = cn.prepareStatement("update expresionescri set evaluacion = ? where id = " + idsuario);
            pstatement.setInt(1, puntuacion);
            //cierra conexión
            pstatement.executeUpdate();
            pstatement.close();
            statement.close();
            
            cn.close();
            
        }catch(Exception e){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public void correcionPronunciacion(int idsuario,int puntuacion){
        try{
            //abre conexión
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(ruta, usuario, contraseña);
            statement = cn.createStatement();
            //actualiza evaluación
            pstatement = cn.prepareStatement("update videos set evaluacion = ? where id = " + idsuario);
            pstatement.setInt(1, puntuacion);
            pstatement.executeUpdate();
            //cierra conexión
            pstatement.close();
            statement.close();
            cn.close();
            
        }catch(Exception e){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
