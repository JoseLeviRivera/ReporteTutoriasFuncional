package org.example.Util.LoadProperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperties {
    public static void loadPropertiesLocal(){
        try {
            FileInputStream archivo = new FileInputStream("src/main/resources/config.properties");
            Properties properties = new Properties(System.getProperties());
            properties.load(archivo);
            System.setProperties(properties);
        } catch (IOException e) {
            System.err.println("La localizacion del archivo para cargar las propiedades no exite o no es la adecuada");
        }
    }
}
