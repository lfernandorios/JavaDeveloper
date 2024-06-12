package co.com.bancolombia.javadev;

import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;

public class Ejercicio3 {
    public static void main(String[] args) {

        ResourceBundle bundleCO = ResourceBundle.getBundle("MessagesBundle", Locale.getDefault());
        ResourceBundle bundleUS = ResourceBundle.getBundle("MessagesBundle", Locale.US);
        ResourceBundle bundleFR = ResourceBundle.getBundle("MessagesBundle", Locale.FRANCE);
        ResourceBundle bundleMX = ResourceBundle.getBundle("MessagesBundle", new Locale("es","MX"));

        ArrayList<ResourceBundle> resourceBundles = new ArrayList<>();
        resourceBundles.add(bundleCO);
        resourceBundles.add(bundleUS);
        resourceBundles.add(bundleFR);
        resourceBundles.add(bundleMX);

        for (ResourceBundle bundle : resourceBundles) {
            System.out.println("Saludo en: " + bundle.getLocale() + ": " + bundle.getString("greeting"));
            System.out.println("Despedida en: " + bundle.getLocale() + ": " + bundle.getString("farewell"));
        }





    }
}
