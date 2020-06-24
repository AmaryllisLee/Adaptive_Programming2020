package sumatieve_opdracht_1;
 import java.util.ArrayList;
public class Dog extends Animal implements  EntertainmentInteface{


    public Dog(String n,Double p, Breed b){
       super(n, p, b);}


//       ps.addAnimals(this);
//       dogTosell.add(n);





    public String entertain(){
        return ("Roll over !");
    }

}
