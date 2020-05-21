package summatieve_opdracht_2;

import org.junit.Assert;

import static org.junit.Assert.*;

public class NodeTest {

    @org.junit.Test
    public void setPathRight() throws Exception {
        Node node = new Node("0", "0");
        Node nodeRight = new Node("1", "0");

        node.setPathRight(nodeRight);
        assertTrue(node.getPathRight() == nodeRight);

    }


    @org.junit.Test
    public void setPathWrong() {
        Node node = new Node("0", "0");
        Node nodeWrong = new Node("0", "1");

        node.setPathWrong(nodeWrong);
        assertTrue(node.getPathWrong() == nodeWrong);

    }

    @org.junit.Test
    public void getPathRight() {
        Node node = new Node("0", "0");
        Node nodeRight = new Node("1", "0");

        node.setPathRight(nodeRight);
        assertSame(nodeRight,node.getPathRight());
    }

    @org.junit.Test
    public void getPathWrong() {
        Node node = new Node("0", "0");
        Node nodeWrong = new Node("0", "1");

        assertEquals(nodeWrong,node.getPathWrong());
    }

    @org.junit.Test
    public void getGoodletter() {
        Node node = new Node("4", "0");

        assertEquals("4", node.getGoodletter());
    }

    @org.junit.Test
    public void getBadletter() {
        Node node = new Node("0", "6");

        assertEquals("6", node.getBadletter());
    }
}

//https://www.youtube.com/watch?v=Bld3644bIAo -- bron voor junit testing



