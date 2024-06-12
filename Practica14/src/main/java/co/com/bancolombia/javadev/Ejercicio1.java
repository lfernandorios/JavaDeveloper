package co.com.bancolombia.javadev;

import java.util.ArrayList;
import java.util.Locale;

public class Ejercicio1 {

    public static void main(String[] args) {

        Locale usaLocale = new Locale("en","US");
        Locale franceLocale = new Locale("fr","FR");
        Locale japanLocale = new Locale("ja","JP");
        Locale mexicoLocale = new Locale("es","MX");

        ArrayList<Locale> locales = new ArrayList<>();
        locales.add(usaLocale);
        locales.add(franceLocale);
        locales.add(japanLocale);
        locales.add(mexicoLocale);

        for (Locale locale : locales) {

            System.out.println("EL país "+ locale.getDisplayCountry() + " con su idioma " + locale.getDisplayLanguage());

        }


    }
}
