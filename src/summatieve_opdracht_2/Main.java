package summatieve_opdracht_2;

import java.util.*;


public class Main {
    public static void main(String[] arg) {
        Loterij loterij = new Loterij();
        ArrayList<String> number  = loterij.pickNumber(); // works

        ChanceNode startnode = new ChanceNode("start");
        ArrayList<ChanceNode> pathtome  = new ArrayList<>();
        loterij.createFSMrecursive(startnode, 2, pathtome);

    }
}