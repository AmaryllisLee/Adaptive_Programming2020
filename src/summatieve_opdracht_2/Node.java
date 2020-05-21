package summatieve_opdracht_2;

public class Node {
    private String goodletter;
    private String badletter;

    private Node pathRight;
    private Node pathWrong;

    Node(String gl, String bl){
        goodletter = gl;
        badletter  = bl;
    }

    public void setPathRight(Node node){ pathRight= node;}
    public void setPathWrong(Node node){ pathWrong = node;}

    public Node getPathRight(){return pathRight;}
    public Node getPathWrong(){return pathWrong;}

    public String getGoodletter(){return goodletter;}
    public String getBadletter(){return badletter;}




}
