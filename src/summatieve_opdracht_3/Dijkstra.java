package summatieve_opdracht_3;

import java.util.ArrayList;;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Dijkstra{


    ArrayList<Node> calculateBestPath(PriorityQueue<Node> unsettlednode){

        ArrayList<Node> settlednode = new ArrayList<Node>();

        Node evaluationnode = null;

        unsettlednode.peek().setAmount(0);// set the start node to 0
        LinkedList<Node> initialShortestPath = new LinkedList<Node>();
        initialShortestPath.add(unsettlednode.peek());
        unsettlednode.peek().setShortestPath(initialShortestPath);// peek() get head of the priorityqueu

        while(unsettlednode.size() > 0) {
            evaluationnode = unsettlednode.poll();

            for(int i = 0;i < evaluationnode.getStapRoutes().size();i++){
                Stap stapRoute = evaluationnode.getStapRoutes().get(i);


                if((evaluationnode.getAmount() +stapRoute.getValue()) < stapRoute.getEndnode().getAmount()){
                    stapRoute.getEndnode().setAmount(evaluationnode.getAmount() +stapRoute.getValue());
                    LinkedList<Node> ultimateShortPath = (LinkedList<Node>) evaluationnode.getShortestPath().clone();
                    ultimateShortPath.add(stapRoute.getEndnode());
                    stapRoute.getEndnode().setShortestPath(ultimateShortPath);

                    if (!settlednode.contains(stapRoute.getEndnode())){
                        unsettlednode.remove(stapRoute.getEndnode());
                        unsettlednode.add(stapRoute.getEndnode());}



                }
            }
            settlednode.add(evaluationnode);
        }// end of while loop
    return settlednode;
    }

}