package sumatieve_opdracht_1;

public class Main {
    public static void main(String[] arg) {
        Petshop petsmart = new Petshop("Petsmart");
        Breed chihuahabreed = new Breed("Chihuaha");
        Breed frenchbulldogbreed = new Breed("French Bulldog");

        Breed parrotbreed = new Breed("Papegaai");
        Breed rattlesnakebreed = new Breed("Rattlesnake");

        Bird papegaai = new Bird("Paulie", 3000.0, parrotbreed);
        Snake rattlesnake = new Snake("Viper", 1.0, rattlesnakebreed);
        Dog chihuaha = new Dog("Tequila", 20.50,chihuahabreed);
        Dog frenchbulldog = new Dog ("Frietjes",50.75,frenchbulldogbreed);

        petsmart.addAnimalsTosell(chihuaha);
        petsmart.addAnimalsTosell(frenchbulldog);
        petsmart.addAnimalsTosell(papegaai);
        petsmart.addAnimalsTosell(rattlesnake);



        Customer persoon = new Customer("Jeroen", 30.50);


        System.out.println(String.format("%s has %s pets",petsmart.getName(), petsmart.getList().size()));
        System.out.println(String.format("%s has %s pets",persoon.getName(), persoon.getList().size()));

        for(int i = 0; i < petsmart.getList().size(); i++){
            Animal animal = petsmart.getList().get(i);
            if (animal instanceof EntertainmentInteface){
                if(petsmart.buyPet(animal, persoon)){
                    System.out.println(String.format("%s bought  a %s named %s", persoon.getName(),animal.getBreed(), animal.getName()));
                    i--;
                }
                else {System.out.println(String.format("%s is to broke to buy a %s named  %s", persoon.getName(),animal.getBreed(), animal.getName()));}
            }
            else{
               System.out.println(String.format("%s can not entertain %s. %s is not interested", animal.getName(), persoon.getName(), persoon.getName()));
            }
        }


        System.out.println(String.format("%s has %s pets",petsmart.getName(), petsmart.getList().size()));
        System.out.println(String.format("%s has %s pets",persoon.getName(), persoon.getList().size()));


    }

}
