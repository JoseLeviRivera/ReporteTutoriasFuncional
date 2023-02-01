package org.example.Util.DatabaseConection;

import org.example.Util.LoadProperties.LoadProperties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
        //carga los parametros para establecer la conexion a la base de datos
        String driver = System.getProperty("config.database.driver").toString().trim();
        String url = System.getProperty("config.database.url").toString().trim();
        String database = System.getProperty("config.database.db").toString().trim();
        String user = System.getProperty("config.database.user").toString().trim();
        String password = System.getProperty("config.database.password").toString().toString().trim();
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(url.concat(database), user, password);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    public Connection getConnection() {
        if (conexion == null) {this.createConexion();}
        return conexion;
    }
}
