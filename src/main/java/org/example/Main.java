package org.example;

import org.example.Util.DatabaseConection.ConexionDB;
import org.example.Util.LoadProperties.LoadProperties;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Connection connection = ConexionDB.getInstance().getConnection();
        if(connection != null){
            System.out.println("Se establecio la conexion a la base de datos");
        }
    }
}