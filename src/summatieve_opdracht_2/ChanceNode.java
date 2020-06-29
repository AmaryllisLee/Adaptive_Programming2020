package summatieve_opdracht_2;

public class ChanceNode extends Node{

    ChanceNode(String n){
        super(n);
    }

    @Override
    public Boolean addPath(Node node, Object value) {
        if (value instanceof Double){
            nodes.put(node, value);
            return true;
        }
        return false;
    }
}
