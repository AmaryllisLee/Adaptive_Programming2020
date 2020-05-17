package Formatieve_opdracht_1a_Autoverhuur_Gameswinkel.AutohuurFile;

public class Autohuur {
    private int aantalDagen ;
    private Auto auto;
    private Klant k;



    public Autohuur(){}

    public void setAantalDagen(int aD){aantalDagen = aD;}

    public void setGehuurdeAuto(Auto gA){}

    public Auto getGehuurdeAuto(){return auto;}

    public void setHuurder(Klant klant){ k = klant;}

    public Klant getHuurder(){return k;}

    public Double totaalPrijs(){
        double totaalprijs  = 0;
        totaalprijs = aantalDagen * auto.getPrijsperDag() * k.getKortingsPercentage();
       return totaalprijs;
    }
    //public Double totaalPrijs(){return aantalDagen * }
    //Totaalprijs = aantal dagen * prijs_per_dag* kortings%

    public String toString(){
    String s  = "er is geen auto bekend \n" +
            "er is geen huurder bekend \n" +
            "aantal dagen: " + aantalDagen + " en dat kost %s";
    return s;
    }

}
