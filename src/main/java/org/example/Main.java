package org.example;

import org.example.Util.DatabaseConection.ConexionDB;
import org.example.Util.LoadProperties.LoadProperties;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection connection = ConexionDB.getInstance().getConnection();
        if(connection != null){
            System.out.println("Se establecio la conexion a la base de datos");
        }
    }
    /*
    public static void insertData(String firstName, String lastName) {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = getConnection();
            statement = connection.createStatement();
            String sql = "INSERT INTO persons (first_name, last_name) " +
                    "VALUES ('" + firstName + "', '" + lastName + "')";
            statement.executeUpdate(sql);
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null)
                    statement.close();
            } catch (SQLException se2) {
            }
            closeConnection(connection);
        }
    }

     */
}