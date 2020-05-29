package summatieve_opdracht_3;

import java.util.Comparator;
import java.util.HashMap;

public abstract class Stap {
    private Node startnode;
    private Node endnode;

    public Stap(Node startnode, Node endnode) {
        this.startnode = startnode;
        this.endnode = endnode;
    }

    abstract Integer getValue();


    public Node getStartnode() {

        return startnode;
    }


    public Node getEndnode() {

        return endnode;
    }
}








