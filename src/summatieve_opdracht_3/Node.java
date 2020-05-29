package summatieve_opdracht_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Node {

    private String name;
    private Integer amount= Integer.MAX_VALUE;


    private LinkedList<Node> shortestPath;

    private ArrayList<Stap> stapRoutes = new ArrayList<Stap>();//path

    public Node (String name){this.name = name;}

    //getter/setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void addPath(Stap s){
        this.stapRoutes.add(s);
    }

    public ArrayList<Stap> getStapRoutes(){return stapRoutes;}

    public LinkedList<Node> getShortestPath() {
        return shortestPath;
    }

    public void setShortestPath(LinkedList<Node> shortestPath) {
        this.shortestPath = shortestPath;
    }

    public String toString(){
        return name  ;
    }

}
