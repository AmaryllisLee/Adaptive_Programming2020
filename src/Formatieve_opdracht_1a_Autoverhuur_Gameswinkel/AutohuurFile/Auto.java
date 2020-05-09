package Formatieve_opdracht_1a_Autoverhuur_Gameswinkel;

public class Auto {
    private String type;
    private Double prijsperDag;

    public Auto(String tp, Double prPd)
    {
        type = tp;
        prijsperDag = prPd;
    }

    public void setPrijsperDag(Double prPd){prijsperDag = prPd;}
    public Double getPrijsperDag(){return prijsperDag;}

    public String toString(){
    String s  = "autotype: "+ type +" met prijs per dag: "+ prijsperDag;
    return s;
    }
}
