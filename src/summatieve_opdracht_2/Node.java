package summatieve_opdracht_2;

import java.util.HashMap;

public abstract class Node {
    private String name;
    HashMap<Node, Object> nodes = new HashMap<>();

    Node(String n){
        name = n;
    }

    public abstract Boolean addPath(Node node, Object value);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<Node, Object> getNodes() {
        return nodes;
    }

    public void setNodes(HashMap<Node, Object> nodes) {
        this.nodes = nodes;
    }

}
