package co.com.bancolombia.javadev;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Ejercicio2 {
    public static void main(String[] args) {

        Properties config = new Properties();
        try(FileInputStream fis = new FileInputStream("Practica14/src/main/resources/config.properties")){
            config.load(fis);
            System.out.println("App Name: " + config.getProperty("appName"));
            System.out.println("Version: " + config.getProperty("version"));
            System.out.println("Author: " + config.getProperty("author"));
        }catch(IOException ex){ System.out.println("Error: "+ ex.getMessage());
        }

    }
}
