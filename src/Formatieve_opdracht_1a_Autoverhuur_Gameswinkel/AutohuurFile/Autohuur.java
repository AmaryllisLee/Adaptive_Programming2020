package Formatieve_opdracht_1a_Autoverhuur_Gameswinkel;

public class Autohuur {
    private int aantalDagen ;
    private Auto auto;
    private Klant klant;


    public Autohuur(){}

    public void setAantalDagen(int aD){aantalDagen = aD;}
    public void setGehuurdeAuto(Auto gA){auto= gA;}
    public Auto getGehuurdeAuto(){return auto;}
    public void setHuurder(Klant k){klant = k;}
    public Klant getHuurder(){return klant;}
    //public Double totaalPrijs(){return aantalDagen * }
    //Totaalprijs = aantal dagen * prijs_per_dag* kortings%

    public String toString(){
    String s  = "er is geen auto bekend \n" +
            "er is geen huurder bekend \n" +
            "aantal dagen: " + aantalDagen + " en dat kost ...";
    return s;
    }

}
