package sumatieve_opdracht_1;

public class Bird extends Animal implements EntertainmentInteface{

    public Bird (String n,Double p, Breed b){
        super(n,p,b);}

    public String entertain(){
    return "fly throught a hoop ";
    }
}
