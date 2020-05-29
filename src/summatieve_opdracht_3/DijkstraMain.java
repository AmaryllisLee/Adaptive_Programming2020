package summatieve_opdracht_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class DijkstraMain  {


    public static void main(String[] arg) {

        Dijkstra dijkstra = new Dijkstra();

        //Trein

        Node ta = new Node("A");
        Node tb = new Node("B");
        Node tc = new Node("C");
        Node td = new Node("D");
        Node te = new Node("E");
        Node tf = new Node("F");


      Stap tab = new  Treinrit(ta, tb, 10);
      Stap tac = new Treinrit (ta, tc, 15);
      Stap tbf= new Treinrit (tb, tf, 15);
      Stap tbd = new Treinrit (tb, td, 12);
      Stap tce = new Treinrit(tc, te, 10);
      Stap tdf = new Treinrit(td, tf, 1);
      Stap tde = new Treinrit(td, te, 2);
      Stap tfe = new Treinrit(tf, te, 5);

      ta.addPath(tab);
      ta.addPath(tac);

      tb.addPath(tbf);
      tb.addPath(tbd);

      tc.addPath(tce);
      td.addPath(tde);
      td.addPath(tdf);
      tf.addPath(tfe);


        LinkedList<Node> r0 = new LinkedList<Node>();
        r0.add(ta);
        r0.add(tb);
        r0.add(tf);
        r0.add(te);

        LinkedList<Node> r1= new LinkedList<Node>();
        r1.add(ta);
        r1.add(tb);
        r1.add(td);
        r1.add(te);


        try {
            Reis treinreis0 = new Reis(r0);
            Reis treinreis1 = new Reis(r1);

            if (treinreis0.compareTo(treinreis1) <0)
            {
                System.out.println("reis 0 is korter dan reis 1");
            }
            else if (treinreis0.compareTo(treinreis1) >0){
                System.out.println("Reis 1 is korter dan reis 0 ");
            }
            else
                {
                    System.out.println("Reis 1 is gelijk aan reis 0 ");
                }
        }catch (Exception fout) {
            System.out.println("Error: " + fout.getMessage());
        }


        PriorityQueue<Node> unsettlednode = new PriorityQueue<Node>(new NodeComparator());
        unsettlednode.add(ta);

        ArrayList<Node> bestPath = dijkstra.calculateBestPath(unsettlednode);
        for (int i = 0;i <bestPath.size();i++){
            System.out.println(bestPath.get(i).getName() + " " + bestPath.get(i).getAmount()+ " "+ bestPath.get(i).getShortestPath());
        }


        //print new line
        System.out.println("\n");


        //Rit
        Node ca = new  Node("a");
        Node cb = new  Node("b");
        Node cc = new  Node("c");
        Node cd = new  Node("d");
        Node ce = new  Node("e");
        Node cf = new  Node("f");

        Stap cab = new Rit(ca, cb, 10);
        Stap cac = new Rit(ca, cc, 15);
        Stap cbf = new Rit(cb, cf, 15);
        Stap cbd = new Rit(cb, cd, 12);
        Stap cce = new Rit(cc, ce, 10);
        Stap cdf = new Rit(cd, cf, 1);
        Stap cde = new Rit(cd, ce, 2);
        Stap cfe = new Rit(cf, ce, 5);

        ca.addPath(cab);
        ca.addPath(cac);

        cb.addPath(cbf);
        cb.addPath(cbd);

        cc.addPath(cce);
        cd.addPath(cde);
        cd.addPath(cdf);
        cf.addPath(cfe);

       LinkedList<Node> a0 = new LinkedList<Node>();
        a0.add(cb);
        a0.add(cd);
        a0.add(cf);
        a0.add(ce);

        LinkedList<Node> a1= new LinkedList<Node>();
        a1.add(ca);
        a1.add(cb);


        try {
            Reis autoreis0 = new Reis(a0);
            Reis autoreis1 = new Reis(a1);

            if (autoreis0.compareTo(autoreis1) <0)
            {
                System.out.println("Autoreis 0 is korter dan Autoreis 1");
            }
            else if (autoreis0.compareTo(autoreis1) >0){
                System.out.println("Autoreis 1 is korter dan Autoreis 0 ");
            }
            else
            {
                System.out.println("Autoreis 1 is gelijk aan Autoreis 0 ");
            }
        }catch (Exception fout) {
            System.out.println("Error: " + fout.getMessage());
        }

        PriorityQueue<Node> unsettlednodeAuto= new PriorityQueue<Node>(new NodeComparator());
        unsettlednodeAuto.add(ca);

        ArrayList<Node> bestPathAuto = dijkstra.calculateBestPath(unsettlednodeAuto);
        for (int i = 0;i <bestPath.size();i++){
            System.out.println(bestPath.get(i).getName() + " "+ bestPath.get(i).getAmount()+ " "+ bestPath.get(i).getShortestPath());
        }

        //print a new line
        System.out.println("\n");

        












    }
}







//Born - https://www.baeldung.com/java-dijkstra