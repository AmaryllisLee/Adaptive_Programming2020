package Formatieve_opdracht_2b;


import java.util.HashMap;
import java.util.Hashtable;

public class Node {
    private String  state;

    private HashMap<String,Double > nodes = new HashMap();// list to store all possible paths with probability

    public Node (String s){
        state=s;
    }

    //Method to add node paths to array nodes
    public void setPath(Node n, Double probability){
        nodes.put(n.state, probability);
    }

    public HashMap getHMapofPath(){return nodes;} //get array nodes

    public String  getState() {
        return state;
    }
}
