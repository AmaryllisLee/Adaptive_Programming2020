package sumatieve_opdracht_1;

public class Main {
    public static void main(String[] arg) {
        Petshop petsmart = new Petshop("Petsmart");
        Breed chihuahabreed = new Breed("Chihuaha");
        Breed frenchbulldogbreed = new Breed("French Bulldog");

        Dog chihuaha = new Dog("Tequila", 20.50,chihuahabreed);
        Dog frenchbulldog = new Dog ("Frietjes",50.75,frenchbulldogbreed);

        petsmart.addAnimalsTosell(chihuaha);
        petsmart.addAnimalsTosell(frenchbulldog);



        Customer persoon = new Customer("Jeroen", 30.50);

        System.out.println(String.format("%s has %s pets",petsmart.getName(), petsmart.getList().size()));
        System.out.println(String.format("%s has %s pets",persoon.getName(), persoon.getList().size()));

        if (petsmart.buyPet(frenchbulldog, persoon))
            {System.out.println(String.format("%s bought  a %s named %s", persoon.getName(),frenchbulldog.getBreed(), frenchbulldog.getName()));}
        else {System.out.println(String.format("%s is to broke to buy a %s named  %s", persoon.getName(),frenchbulldog.getBreed(), frenchbulldog.getName()));}

        if (petsmart.buyPet(chihuaha, persoon))
        {System.out.println(String.format("%s bought  a %s named %s . %s  %s", persoon.getName(),chihuaha.getBreed(), chihuaha.getName(), chihuaha.getName(), chihuaha.speak()));}
        else {System.out.println(String.format("%s is to broke to buy a %s named  %s", persoon.getName(),chihuaha.getBreed(), chihuaha.getName()));}

        System.out.println(String.format("%s has %s pets",petsmart.getName(), petsmart.getList().size()));
        System.out.println(String.format("%s has %s pets",persoon.getName(), persoon.getList().size()));


    }

}
