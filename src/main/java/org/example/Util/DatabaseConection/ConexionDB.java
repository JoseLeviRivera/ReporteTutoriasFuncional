package org.example.Util.DatabaseConection;

import org.example.Util.LoadProperties.LoadProperties;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionDB {

    private static ConexionDB instance = new ConexionDB();
    private Connection conexion = null;

    public ConexionDB(){}

    public static ConexionDB getInstance() {
        return instance;
    }

    public boolean createConexion(){
        //carga las propiedades local del sistema
        LoadProperties.loadPropertiesLocal();
        //Se inicializan los parametros para establecer la base de datos
        StringBuilder driver = new StringBuilder(System.getProperty("config.database.driver"));
        StringBuilder url = new StringBuilder(System.getProperty("config.database.url"));
        StringBuilder database = new StringBuilder(System.getProperty("config.database.db"));
        StringBuilder user = new StringBuilder(System.getProperty("config.database.user"));
        StringBuilder password = new StringBuilder(System.getProperty("config.database.password"));

        try {
            Class.forName(driver.toString());
            conexion = DriverManager.getConnection(
                    url.append(database.toString()).toString(),
                    user.toString(), password.toString());
        } catch (Exception e) {
            System.out.println("Ocurrio un problema a la hora de conectar con la base de datos");
            System.out.println("El mensaje es el siguiente: " + e.getMessage());
        }
        return true;
    }

    public Connection getConnection() {
        if (conexion == null) {this.createConexion();}
        return conexion;
    }
}
