package Formatieve_opdracht_1a_Autoverhuur_Gameswinkel.Gameshop;

import java.time.LocalDate;


public class Games {
    private String naam;
    int releasejaar;
    Double prijs;

    public Games (String nm, int rj, Double p)
    {
        naam = nm;
        releasejaar= rj;
        prijs = p;
    }

    public String getNaam(){return naam;}

    //double huidigeWaarde() {}

    boolean equals(Games game){
        if (this.naam == game.naam){
            return true;
        }else{return false;}
    }

    public String toString(){
        String s = naam + " , uitgegeven in "+ releasejaar + "; " + prijs + " nu voor: ";
        return s;
    }


}


