package sumatieve_opdracht_1;

public class Animal {
    private String name;
    private Double price;
    private Customer owner;
    private Breed breed;

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    public Animal(String n , Double p, Breed b){
        name = n;
        price = p;
        breed = b;
    }
    public String getName(){return name;}
    public void setName(String n){name = n;}

    public Double getPrice(){return price;}
    public void setPrice(Double p){price = p;}
}
