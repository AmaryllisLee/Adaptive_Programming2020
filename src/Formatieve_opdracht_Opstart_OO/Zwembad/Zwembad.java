package Formatieve_opdracht_Opstart_OO.Zwembad;

import javafx.animation.ScaleTransition;

public class Zwembad {
    private Double breedte;
    private Double lengte;
    private Double diepte;

    public Zwembad(Double b, Double l, Double d)
    {
        breedte = b;
        lengte = l;
        diepte = d;
    }

    public Double getBreedte(){return breedte; }
    public Double getLengte() { return lengte; }
    public Double getDiepte() { return diepte; }
    public Double inhoud() { return breedte*lengte*diepte; }

    //Set methods
    public void setBreedte(Double sB){breedte = sB;}
    public void setLengte(Double sL){lengte = sL;}
    public void setDiepte(Double sD){diepte = sD;}

    public String toString()
    {
        String s  = "Dit zwembad is "+ breedte +" meter, "+ lengte +" meter lang, en "+ diepte +" meter diep";
        return s;
    }
}
