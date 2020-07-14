package summatieve_opdracht_2;



public class TekstNode extends Node{

    TekstNode(String n){
        super(n);
    }

    @Override
    public Boolean addPath(Node node, Object value) {
        if (value instanceof String){
            nodes.put(node, value);
            return true;
        }
        return false;
    }


}
