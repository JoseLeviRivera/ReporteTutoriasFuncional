package org.example.Util.LoadProperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * Esta clase carga un un archivo .properties para cargar las propiedades propias definidas por el programador para la conexión a la base de datos
 * @author Jose Levi Rivera Mendoza
 * @date 1 feb 2023
 */
public class LoadProperties {
    /**
     * Localiza el archivo para cargar las propiedades definidas
     */
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
