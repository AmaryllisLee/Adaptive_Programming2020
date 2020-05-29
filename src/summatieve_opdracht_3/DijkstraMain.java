package summatieve_opdracht_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class DijkstraMain  {


    public static void main(String[] arg) {

        Dijkstra dijkstra = new Dijkstra();

        //Trein
        //Voor trein heb ik gebruikt gemaakt van de structuur van Baeldung gebruikt.

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
            System.out.println("Trein reis 0 "+r0);
            System.out.println("Trein reis 1 "+r1);
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
        System.out.println("Node    Tijd     Kortse pad");
        for (int i = 0;i <bestPath.size();i++){
            System.out.println(bestPath.get(i).getName() + "        " + bestPath.get(i).getAmount()+ "      "+ bestPath.get(i).getShortestPath());
        }


        //print new line
        System.out.println("\n");

        //vlucht

        Node va = new Node("A");
        Node vb = new Node("B");
        Node vc = new Node("C");
        Node vd = new Node("D");
        Node ve = new Node("E");
        Node vf = new Node ("F");

        Stap vab = new Vlucht(va, vb, 10, 0.2);
        Stap vac = new Vlucht(va, vc, 15, 0.2);
        Stap vbf = new Vlucht(vb, vf, 15, 0.4);
        Stap vbd = new Vlucht(vb, vd, 12, 0.5);
        Stap vce = new Vlucht(vc, ve, 10, 0.5);
        Stap vdf = new Vlucht(vd, vf, 1,  1.0);
        Stap vde = new Vlucht(vd, ve, 2,  0.5);
        Stap vfe = new Vlucht(vf, ve, 5,  0.6);

        va.addPath(vab);
        va.addPath(vac);

        vb.addPath(vbf);
        vb.addPath(vbd);

        vc.addPath(vce);

        vd.addPath(vdf);
        vd.addPath(vde);

        vf.addPath(vfe);


        //Hier wordt reis v0 en v1 met elkaar vergeleken
        //v0 = [A,B,F,E]
        //v1 = [A,B,D,E]
        LinkedList<Node> v0 = new LinkedList<Node>();
        v0.add(va);
        v0.add(vb);
        v0.add(vf);
        v0.add(ve);

        LinkedList<Node> v1 = new LinkedList<Node>();
        v1.add(va);
        v1.add(vb);
        v1.add(vd);
        v1.add(ve);

        try{
            Reis vluchtreis0 = new Reis(v0);
            Reis vluchtreis1 = new Reis(v1);

            System.out.println("Vlucht reis 0 "+v0);
            System.out.println("Vlucht reis 1 "+v1);

            if ((vluchtreis0.compareTo(vluchtreis1)< 0)){
                System.out.println("Vlucht reis 0 is goedkoper dan vlucht reis 1");
            }
            else if ((vluchtreis0.compareTo(vluchtreis1)> 0)){
                System.out.println("Vlucht reis 1 is goedkoper dan vlucht reis 0");
            }
            else{
                System.out.println("Vlucht reis 0 is dezelfde prijs dan vlucht reis 1");
            }
        }
        catch (Exception fout){
            System.out.println("Error: " + fout.getMessage());
        }

        PriorityQueue<Node> unsettlednodeVlucht= new PriorityQueue<Node>(new NodeComparator());
        unsettlednodeVlucht.add(va);

        ArrayList<Node> bestPathVlucht = dijkstra.calculateBestPath(unsettlednodeVlucht);
        System.out.println("Node    Kosten   Kortse pad");
        for (int i = 0;i <bestPathVlucht.size();i++){
            System.out.println(bestPathVlucht.get(i).getName() + "       "+ bestPathVlucht.get(i).getAmount()+ "         " + bestPathVlucht.get(i).getShortestPath());
        }

        //print a new line
        System.out.println("\n");


        //Rit
        //Voor rit heb ik een andere voorbeeld gebruikt om te testen
        //Bron: https://www.codingame.com/playgrounds/1608/shortest-paths-with-dijkstras-algorithm/dijkstras-algorithm
        // Met deze structuur is de startnode C
        //c is voor' car(auto), waardoor ca, cb et.

        Node ca = new  Node("a");
        Node cb = new  Node("b");
        Node cc = new  Node("c");
        Node cd = new  Node("d");
        Node ce = new  Node("e");


        Stap cca = new Rit(cc, ca, 1);
        Stap ccb = new Rit(cc, cb, 7);
        Stap ccd = new Rit(cc, cd, 2);
        Stap cab = new Rit(ca, cb, 3);
        Stap cbe = new Rit(cb, ce, 1);
        Stap cde = new Rit(cd, ce, 7);
        Stap cdb = new Rit(cd, cb, 5);

        cc.addPath(cca);
        cc.addPath(ccb);
        cc.addPath(ccd);
        ca.addPath(cab);
        cb.addPath(cbe);
        cd.addPath(cde);
        cd.addPath(cdb);

        LinkedList<Node> a0 = new LinkedList<Node>();
        a0.add(cc);
        a0.add(cb);
        a0.add(ce);

        LinkedList<Node> a1= new LinkedList<Node>();
        a1.add(cc);
        a1.add(cd);
        a1.add(cb);
        a1.add(ce);


        try {
            Reis autoreis0 = new Reis(a0);
            Reis autoreis1 = new Reis(a1);
            System.out.println("Auto reis 0 "+ a0);
            System.out.println("Auto reis 1 "+ a1);
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
        unsettlednodeAuto.add(cc);

        ArrayList<Node> bestPathAuto = dijkstra.calculateBestPath(unsettlednodeAuto);
        System.out.println("Node    Afstand   Kortse pad");
        for (int i = 0;i <bestPathAuto.size();i++){
            System.out.println(bestPathAuto.get(i).getName() + "        "+ bestPathAuto.get(i).getAmount()+ "       "+ bestPathAuto.get(i).getShortestPath());
        }




















    }
}

//Born - https://www.baeldung.com/java-dijkstra