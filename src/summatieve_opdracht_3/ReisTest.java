package summatieve_opdracht_3;

import org.junit.Assert;
import org.junit.Test;


import java.util.LinkedList;



public class ReisTest {

    Node ta = new Node("A");
    Node tb = new Node("B");
    Node tc = new Node("C");
    Node td = new Node("D");
    Node te = new Node("E");
    Node tf = new Node("F");


    Stap tab = new Treinrit(ta, tb, 10);
    Stap tac = new Treinrit (ta, tc, 15);
    Stap tbf= new Treinrit (tb, tf, 15);
    Stap tbd = new Treinrit (tb, td, 12);
    Stap tce = new Treinrit(tc, te, 10);
    Stap tdf = new Treinrit(td, tf, 1);
    Stap tde = new Treinrit(td, te, 2);
    Stap tfe = new Treinrit(tf, te, 5);

    @Test
    public void constructorTest() {
        ta.addPath(tab);
        ta.addPath(tac);

        tb.addPath(tbf);
        tb.addPath(tbd);

        tc.addPath(tce);
        td.addPath(tde);
        td.addPath(tdf);
        tf.addPath(tfe);

        LinkedList<Node> linkedListReis  = new LinkedList<Node>();
        linkedListReis.add(ta);
        linkedListReis.add(tc);
        linkedListReis.add(te);
        try{
        Reis reis = new Reis(linkedListReis);
        Integer distance  = reis.distance;
            Assert.assertEquals(distance, reis.getDistance());
        }catch (Exception fout){
            System.out.println(fout.getMessage());
        }
    }
}

//Bron:
//https://examples.javacodegeeks.com/core-java/junit/junit-test-constructor-example/