package Formatieve_opdracht_Opstart_OO.Huisjesmelk;

public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon persoon;

    public Huis(String adr, int bwjr){
        adres = adr;
        bouwjaar =  bwjr;
    }

    public Persoon getHuibaas() {return persoon;}
    public void setHuisbaas(Persoon hb) {persoon=hb;}






}
