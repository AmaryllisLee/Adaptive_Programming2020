package sumatieve_opdracht_1;

import java.util.ArrayList;

public class Petshop {
    private String name;

    private ArrayList<Animal> animalsTosell = new ArrayList<Animal>();

    public Petshop(String n) {
        name = n;
    }


    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }


    public Boolean buyPet(Animal type, Customer klant) {
        int foundIndex = -1;
        for (int index = 0; index < animalsTosell.size(); index++) {
            if (animalsTosell.get(index) == type) {
                foundIndex = index;
//               animalsTosell.remove(index);
                break;
            }
        }
        if (foundIndex >= 0 && klant.getBudget() > type.getPrice()) {
            animalsTosell.remove(foundIndex);
            klant.addPets(type);
            return true;
        }
        return false;
    }


    public void addAnimalsTosell(Animal a) {
        animalsTosell.add(a);
    }

    public ArrayList<Animal> getList() {
        return animalsTosell;
    }

}
