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

/**
 *
 * @author Durfen
 */
public class ConexionResultados {

    private ResultSet rs;
    private Connection cn = null;
    //datos acceso BBDD
    private final String ruta = "jdbc:mysql://db4free.net:3306/proyectoelena?autoReconnect=true&useSSL=false";
    private final String usuario = "durfen";
    private final String contraseña = "Mariobrostomija1";
    private Statement statement;
    private PreparedStatement pstatement;
    private String texto;
    private int id;

    public ConexionResultados(int id) {
        this.id = id;
    }

    public String resultadoIntroduccion() {
        texto = "No se ha completado.";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(ruta, usuario, contraseña);
            statement = cn.createStatement();
            String s = "select evaluacion from introduccion where id = " + id;
            rs = statement.executeQuery(s);
            if (rs.next()) {
                texto = "La valoración de los compañeros es: " + rs.getInt(1);
            }
        } catch (Exception e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
        return texto;
    }

    public String resultadoExpresionescrita() {
        texto = "No se ha completado.";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(ruta, usuario, contraseña);
            statement = cn.createStatement();
            String s = "select evaluacion from expresionescri where id = " + id;
            rs = statement.executeQuery(s);
            if (rs.next()) {
                texto = "La valoración de los compañeros es: " + rs.getInt(1);
            }
        } catch (Exception e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
        return texto;
    }

    public String resultadoPronunciacion() {
        texto = "No se ha completado.";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(ruta, usuario, contraseña);
            statement = cn.createStatement();
            String s = "select evaluacion from expresionescri where id = " + id;
            rs = statement.executeQuery(s);
            if (rs.next()) {
                texto = "La valoración de los compañeros es: " + rs.getInt(1);
            }
        } catch (Exception e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
        return texto;
    }

    public String resultadoGramatica() {
        texto = "No se ha completado.";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(ruta, usuario, contraseña);
            statement = cn.createStatement();
            String s = "select resultado from resultados where id = " + id + " and idtest = 3";
            rs = statement.executeQuery(s);
            if (rs.next()) {
                if (rs.getInt(1) == 1) {
                    texto = "Aprobado.";
                }else{
                    texto = "Suspenso";
                }
            }
        } catch (Exception e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
        return texto;
    }
    public String resultadoVideo() {
        texto = "No se ha completado.";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(ruta, usuario, contraseña);
            statement = cn.createStatement();
            String s = "select resultado from resultados where id = " + id + " and idtest = 1";
            rs = statement.executeQuery(s);
            if (rs.next()) {
                if (rs.getInt(1) == 1) {
                    texto = "Aprobado.";
                }else{
                    texto = "Suspenso";
                }
            }
        } catch (Exception e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
        return texto;
    }
    public String resultadoLectora() {
        texto = "No se ha completado.";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(ruta, usuario, contraseña);
            statement = cn.createStatement();
            String s = "select resultado from resultados where id = " + id + " and idtest = 2";
            rs = statement.executeQuery(s);
            if (rs.next()) {
                if (rs.getInt(1) == 1) {
                    texto = "Aprobado.";
                }else{
                    texto = "Suspenso";
                }
            }
        } catch (Exception e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
        return texto;
    }

}
