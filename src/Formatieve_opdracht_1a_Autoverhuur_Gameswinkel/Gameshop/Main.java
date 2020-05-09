package Formatieve_opdracht_1a_Autoverhuur_Gameswinkel.Gameshop;

import java.time.LocalDate;

public class Main {
    public static void main(String[] arg) {
        int releaseJaar1 = LocalDate.now().getYear() - 1; // 1 jaar geleden
        int releaseJaar2 = LocalDate.now().getYear() - 2; // 2 jaar geleden


        Games g1 = new Games("Just Cause 3", releaseJaar1, 49.98);
        Games g2 = new Games("Need for Speed: Rivals", releaseJaar2, 45.99);
        Games g3 = new Games("Need for Speed: Rivals", releaseJaar2, 45.99);


        Persoon p1 = new Persoon("Eric", 200);
        Persoon p2 = new Persoon("Hans", 55);
        Persoon p3 = new Persoon("Arno", 185);


// Druk de volgende transacties af (pas de code aan)
        p1.koop(g1);
        p1.koop(g2);
        p1.koop(g3);
        p2.koop(g2);
        p2.koop(g1);
        p3.koop(g3);


// Druk personen p1 p2 p3 nu af naar de console
        p1.koop(g1);
        System.out.println("p1: "+p1.toString());
        p1.koop(g2);
        System.out.println("p1: "+p1.toString());
        p1.koop(g3);
        System.out.println("p1: "+p1.toString());

// Druk de volgende transacties af (pas de code aan)
        p1.verkoop(g1, p3);
        p2.verkoop(g2, p3);
        p2.verkoop(g1, p1);


// Druk personen p1 p2 p3 nu af naar de console
    }
}
