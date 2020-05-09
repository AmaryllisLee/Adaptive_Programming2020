package Formatieve_opdracht_Opstart_OO.Zwembad;

public class Main {
    public static void main(String[] args) {
        Zwembad z1 = new Zwembad(2.0,5.5 , 1.5);
        Zwembad z2 = new Zwembad(0.0,0.0,0.0); //weet niet hoe ik zonder argument kan runnen

        z2.setBreedte(2.5);
        z2.setLengte(100.0);
        z2.setDiepte(2.0);
        System.out.println("BREEDTE: "+z1.getBreedte());
        System.out.println("LENGTE: "+z1.getLengte());
        System.out.println("DIEPTE: "+z1.getDiepte());
        System.out.println("BEREKENDE INHOUD: "+ z1.inhoud() + "\n");
        System.out.println("Gegeven zwembad : "+ z2.toString());
        System.out.println("Berekend inhoud: "+ z2.inhoud());


    }

}
