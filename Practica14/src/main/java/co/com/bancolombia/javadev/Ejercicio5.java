package co.com.bancolombia.javadev;

import java.util.Properties;

public class Ejercicio5 {
    public static void main(String[] args) {
        String userName = System.getProperty("username");
        String password = System.getProperty("password");

        System.out.println(userName);
        System.out.println(password);

    }
}
