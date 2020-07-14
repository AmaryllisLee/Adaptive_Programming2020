package summatieve_opdracht_2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;


public class Loterij {
    public static void main(String[] arg) {
        System.out.println("Loterij \n") ;
        Loterij loterij = new Loterij();
        ArrayList<String> number  = loterij.pickNumber(); // works

        loterij.createFSM();
        ArrayList<String>  winnerTicket = loterij.drawnNumber();
        System.out.println(winnerTicket);

        Boolean ultimate_result = Loterij.winnerLoser(number, winnerTicket);

        if(ultimate_result){
            System.out.println("Congratulations, YOU HAVE WON 10000000000000000000000000000000000 EUROS");
        }
        else{
            System.out.println("Next time  :( ");
        }

    }
    private int numbersTopick = 10;
    private ChanceNode startnode  = new ChanceNode("start");
    private int size_loterijTickets= 3 ;


    public ArrayList<String> pickNumber(){
        ArrayList<String>unique_keuzesplit = new  ArrayList<>();

        do{
            System.out.println(String.format("Please pick %s numbers from 1 - %s, separated by a space", size_loterijTickets, numbersTopick));
            Scanner obj = new Scanner(System.in);
            String keuze = obj.nextLine(); // input numbers
            String[] keuzesplit = keuze.split(" ");
            unique_keuzesplit.clear();


            for(int i= 0; i < keuzesplit.length; i++){
                if (!unique_keuzesplit.contains(keuzesplit[i])){
                    if (Integer.parseInt(keuzesplit[i]) > 0 && Integer.parseInt(keuzesplit[i]) <= numbersTopick ){
                        unique_keuzesplit.add(keuzesplit[i]);
                    }
                }
            }//end of for loop
        }while(unique_keuzesplit.size() != size_loterijTickets);
        return unique_keuzesplit;
    }



    private void createFSMrecursive(ChanceNode currentnode, int depth ,ArrayList<String> pathtome){
        for (int i = 1; i <= numbersTopick; i++){
            if (!pathtome.contains(String.valueOf(i))){

                ChanceNode newnode = new ChanceNode(String.valueOf(i));
                Double probability = 1.0/(numbersTopick -depth +1.0);
                //System.out.println(newnode.getName() +" "+probability);
                currentnode.addPath(newnode,probability);

                if (depth < size_loterijTickets){
                    ArrayList<String> cloned_pathtome = (ArrayList<String>) pathtome.clone();
                    cloned_pathtome.add(newnode.getName());
                    createFSMrecursive(newnode, depth +1, cloned_pathtome);
                }
            }
        }
    }

    public void createFSM(){
        ArrayList<String> pathtome  = new ArrayList<>();
        pathtome.add(startnode.getName());
        createFSMrecursive(startnode,  1 ,pathtome);
    }



    public ArrayList<String> drawnNumber(){
        Random random = new Random(); // create a instance random in order to generate a random number
        ArrayList<String> winnerTicket = new ArrayList<>();
        Node currentNode = startnode;
        HashMap<Node, Object> paths_currentnode = currentNode.getNodes();//

        do {
            double p = 0;
            double randomnumber = random.nextDouble();

            for (Node i : paths_currentnode.keySet()) {
                if ((p + (double)paths_currentnode.get(i)) >= randomnumber){
                    currentNode = i;
                    winnerTicket.add(currentNode.getName());
                    paths_currentnode = currentNode.getNodes();
                    p = 0;
                    break;
                }
                else{
                    p  += (double) paths_currentnode.get(i);
                }
            }

        }while(currentNode.getNodes().size() > 0);
        System.out.println("Winning ticket");
        return winnerTicket;
    }

    static boolean winnerLoser(ArrayList<String> arrayList1, ArrayList<String> arrayList2 ){
       return arrayList1.containsAll(arrayList2);

    }




}
