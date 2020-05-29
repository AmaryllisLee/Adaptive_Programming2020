package summatieve_opdracht_3;

import org.junit.Assert;
import org.junit.Test;
import sumatieve_opdracht_1.Animal;

import static org.junit.Assert.*;

public class VluchtTest {

    @Test
    public void getValue() {
        Node a = new Node("a");
        Node b = new Node("b");

        Stap test = new Vlucht(a, b, 10, .2);

        Assert.assertTrue(test.getValue() == 12);
    }
}