package summatieve_opdracht_2;

import org.junit.Test;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class HangmanTest {

    @Test
    public void choose_word() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("coffee".getBytes());
        System.setIn(in);

        Hangman hangman = new Hangman();
        ArrayList<Character> actual = hangman.choose_word();


        ArrayList<Character> expected= new ArrayList<Character>();
        expected.add('c');
        expected.add('o');
        expected.add('f');
        expected.add('e');
        assertEquals(expected,actual);
    }

    @Test
    public void getPathbyValue() {
        TekstNode node = new TekstNode("testNode");
        TekstNode Anode = new TekstNode("A");
        TekstNode Bnode = new TekstNode("B");
        node.addPath(Anode, "A");
        node.addPath(Bnode, "B");

        Hangman hangman = new Hangman();
        TekstNode res = hangman.getPathbyValue(node, "A");
        TekstNode res2 = hangman.getPathbyValue(node, "D");

        assertEquals(res, Anode);
        assertEquals(res2, null);
    }

    @Test
    public void aliveOrdead(){
        ArrayList<TekstNode> lst = new ArrayList<>();
        TekstNode win = new TekstNode("WIN");
        lst.add(win);

        Hangman hangman = new Hangman();
        assertEquals(hangman.aliveOrdead(lst), " Congratulations, you WIN !");

        TekstNode lose= new TekstNode("LOSE");
        lst.add(lose);
        assertEquals(hangman.aliveOrdead(lst), "YOU ARE DEAADDD");

        TekstNode hello = new TekstNode("HELLO");
        lst.add(hello);
        assertEquals(hangman.aliveOrdead(lst), "Error has occurred, correct: HELLO");

    }
}