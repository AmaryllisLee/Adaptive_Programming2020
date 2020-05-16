package sumatieve_opdracht_1;
 import java.util.ArrayList;
public class Dog extends Animal implements  SpeakInterface{

    private Breed breed;


    public Dog(String n,Double p, Breed b){
       super(n, p);
       breed = b;

//       ps.addAnimals(this);
//       dogTosell.add(n);

    }

    public Breed  getBreed(){return breed;}
    public void setBreed(Breed breed){}

    public String speak(){
        return ("WOOF WOOF");
    }

}
