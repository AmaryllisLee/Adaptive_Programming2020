package Formatieve_opdracht_1a_Autoverhuur_Gameswinkel.Gameshop;

import java.util.ArrayList; // import the ArrayList class - W3schools
public class Persoon {
    private String naam;
    private int  budget;
    public Games g;

    ArrayList<Games> mijnGames = new ArrayList<>(); // Create an ArrayList object


    public Persoon (String nm, int b)
    {   naam = nm;
        budget = b;
    }

    String koop(Games g){
        if((budget < g.prijs) & (mijnGames.contains(g) == false)){
            mijnGames.add(g);
            return ("Gelukt");
        }else{
            return("Niet gelukt");
        }
    }

    boolean verkoop(Games g, Persoon koper){
        if((koper.budget >= g.prijs) & (mijnGames.contains(g)== true)){
            return true;
        }else{return false;}
    }

    public String toString(){
        String s = naam +" heeft een budget van " + budget + " en bezit de volgende games: "+ g + "\n";
        return s;
    }

}



