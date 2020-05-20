package Formatieve_opdracht_2b;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
public class MonteCarlo {
    public static void main(String[] arg)
    {
        ArrayList<String> states = new ArrayList<String>();

        //Define Nodes of a 6 dice
        //Nodes of the states
        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");
        Node s3 = new Node("s3");
        Node s4 = new Node("s4");
        Node s5 = new Node("s5");
        Node s6 = new Node("s6");

        //Nodes of the dice , end nodes
        Node d1 = new Node("Dice 1");
        Node d2 = new Node("Dice 2");
        Node d3 = new Node("Dice 3");
        Node d4 = new Node("Dice 4");
        Node d5 = new Node("Dice 5");
        Node d6 = new Node("Dice 6");

        // set the transitions of the nodes and the probability of the path
        s0.setPath(s1, 0.5);
        s0.setPath(s2, 0.5);


        s1.setPath(s3, 0.5);
        s1.setPath(s4, 0.5);
        s2.setPath(s5, 0.5);
        s2.setPath(s6, 0.5 );

        s3.setPath(s1, 0.5);
        s6.setPath(s1, 0.5);

        s3.setPath(d1, 0.5);
        s4.setPath(d2, 0.5);
        s4.setPath(d3, 0.5);
        s5.setPath(d4, 0.5);
        s5.setPath(d5, 0.5);
        s6.setPath(d6, 0.5);

        //Implement FSM
        Random random = new Random(); // create a instance random in order to generate a random number

        HashMap<String, Node> statesdiceNodes = new HashMap<String, Node>();

        statesdiceNodes.put("s0",s0);
        statesdiceNodes.put("s1",s1);
        statesdiceNodes.put("s2",s2);
        statesdiceNodes.put("s3",s3);
        statesdiceNodes.put("s4",s4);
        statesdiceNodes.put("s5",s5);
        statesdiceNodes.put("s6",s6);

        statesdiceNodes.put("Dice 1",d1);
        statesdiceNodes.put("Dice 2",d2);
        statesdiceNodes.put("Dice 3",d3);
        statesdiceNodes.put("Dice 4",d4);
        statesdiceNodes.put("Dice 5",d5);
        statesdiceNodes.put("Dice 6",d6);




        Node currentNode = s0;
        HashMap<String, Double> dictNode = currentNode.getHMapofPath(); //

        System.out.println(dictNode);


        do {
            double p = 0;
            Double randomnumber = random.nextDouble();
            states.add(currentNode.getState());

            for (String i : dictNode.keySet()) {


                System.out.println(currentNode.getState() + " "+ randomnumber+ " " + dictNode);

                if ((p + dictNode.get(i)) >= randomnumber){
                    currentNode = statesdiceNodes.get(i);
                    dictNode = currentNode.getHMapofPath();
                    p = 0;
                    break;
                }
                else{
                    p  += dictNode.get(i);
                }
        }

        }while(currentNode.getHMapofPath().size() > 0);

         System.out.println(states + " " + currentNode.getState());






    }
}
