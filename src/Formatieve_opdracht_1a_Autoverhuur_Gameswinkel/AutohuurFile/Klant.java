package Formatieve_opdracht_1a_Autoverhuur_Gameswinkel;

public class Klant {
    private String naam;
    private Double kortingsPercentage;

    public Klant(String nm){naam = nm;}

    public void setKortingsPercentage(Double kP){kortingsPercentage = kP;}
    public Double getKortingsPercentage(){return kortingsPercentage;}

    public String toString(){
    String s  = "op naam van: "+ naam +" (korting: "+ kortingsPercentage+")";
    return s;
    }
}
