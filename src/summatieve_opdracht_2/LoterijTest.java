package summatieve_opdracht_2;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class LoterijTest {

    @Test
    public void pickNumber() {

        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("1 1 2 3 3 3".getBytes());
        System.setIn(in);

        Loterij loterij = new Loterij();
        ArrayList<String> actual = loterij.pickNumber();

        ArrayList<String> expected = new ArrayList<>();
        expected.add("1");
        expected.add("2");
        expected.add("3");

        assertEquals(expected, actual);

    }

    @Test
    public void winnerLoser() {
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("winner");
        arr1.add("loser");
        arr1.add("draw");

        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("winner");
        arr2.add("notloser");
        arr2.add("draw");

        boolean res = Loterij.winnerLoser(arr1, arr2);
        assertFalse(res);

    }
}