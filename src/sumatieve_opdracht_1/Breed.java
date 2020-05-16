package sumatieve_opdracht_1;

public class Breed {
    private String breedname;

    public Breed(String bn){
        breedname = bn;
    }
    public String getBreedname(){return breedname;}
    public void setBreedname(String b){breedname = b;}

    public String toString(){
        return breedname;
    }
}
