package Formatieve_opdracht_1a_Autoverhuur_Gameswinkel.AutohuurFile;

import Formatieve_opdracht_1a_Autoverhuur_Gameswinkel.Auto;
import Formatieve_opdracht_1a_Autoverhuur_Gameswinkel.Autohuur;
import Formatieve_opdracht_1a_Autoverhuur_Gameswinkel.Klant;

public class Main {
    public static void main(String[] arg) {
        Autohuur ah1 = new Autohuur();
        System.out.println("Eerste autohuur: "+ ah1.toString());

        Klant k = new Klant("Mijnheer de Vries");
        k.setKortingsPercentage(10.0);
        ah1.setHuurder(k);
        System.out.println("Eerste autohuur: "+ah1.toString());

        Auto a1 = new Auto("Peugot 207", 50.0);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(4);
        System.out.println("Eerste autohuur: "+ ah1.toString());

        Autohuur ah2 = new Autohuur();
        Auto a2 = new Auto("Ferrari", 3500.0);
        ah2.setGehuurdeAuto(a2);
        ah2.setHuurder(k);
        ah2.setAantalDagen(1);
        System.out.println("Tweede autohuur: "+ ah2.toString());

        System.out.println("Gehuurd: "+ ah1.getGehuurdeAuto());
        System.out.println("Gehuur: "+ ah2.getGehuurdeAuto());


    }
}
