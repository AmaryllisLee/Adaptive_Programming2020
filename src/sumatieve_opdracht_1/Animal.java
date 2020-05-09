package sumatieve_opdracht_1;

public class Animal {
    private String name;
    private Double price;

    public Animal(String n , Double p){
        name = n;
        price = p;
    }
    public String getName(){return name;}
    public void setName(String n){name = n;}

    public Double getPrice(){return price;}
    public void setPrice(Double p){price = p;}
}
