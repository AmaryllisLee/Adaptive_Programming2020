package sumatieve_opdracht_1;

import java.util.ArrayList;
public class Customer {
    private String name;
    private double budget;

    private ArrayList<Animal> pets= new ArrayList<Animal>();

    public Customer(String n, Double bg){
        name = n;
        budget=bg;
    }

    public String getName(){return name;}
    public void setName(String n){name = n;}

    public Double getBudget(){return budget;}
    public void setBudget(Double bg){budget = bg;}

    public void addPets(Animal animal){pets.add(animal);}

    public ArrayList<Animal> getList(){return pets;}

}
