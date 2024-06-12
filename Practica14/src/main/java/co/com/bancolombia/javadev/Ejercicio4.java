package co.com.bancolombia.javadev;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class Ejercicio4 {
    public static void main(String[] args) {

        ArrayList<Locale> locales = new ArrayList<>();
        locales.add(new Locale("en","US"));
        locales.add(new Locale("fr","FR"));
        locales.add(new Locale("ja","JP"));

        double money = 12345.67;
        NumberFormat nf;

        for(Locale locale :locales) {
            nf = NumberFormat.getNumberInstance(locale);
            System.out.println("Money: " + nf.format(money) + " in Locale: " + locale);
        }

    }
}
