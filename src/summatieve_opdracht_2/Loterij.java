package summatieve_opdracht_2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Loterij {
    private int numbersTopick;
    private ChanceNode startnode;
    private ChanceNode currentnode;


    public ArrayList<String> pickNumber(){
        numbersTopick = 10;
        ArrayList<String>unique_keuzesplit = new ArrayList<>();

        do{
            Scanner obj = new Scanner(System.in);
            String keuze = obj.nextLine(); // input numbers
            String[] keuzesplit = keuze.split(" ");

            for(int i= 0; i <= keuzesplit.length - 1; i++){
                if (!unique_keuzesplit.contains(keuzesplit[i])){
                    if (Integer.parseInt(keuzesplit[i]) > 0 && Integer.parseInt(keuzesplit[i]) <= numbersTopick ){
                        unique_keuzesplit.add(keuzesplit[i]);
                    }
                }
            }//end of for loop
        }while(unique_keuzesplit.size() != 3);
        return unique_keuzesplit;
    }


    public void  createFSM(){
        startnode = new ChanceNode("start");
        HashMap<String, ChanceNode>  nodeHashMap = new HashMap<>();

        for (int i = 1; i<= numbersTopick; i++){
            ChanceNode n= new ChanceNode(String.valueOf(i));
            startnode.addPath(n, 1/numbersTopick);
            for(int j = 1;j <= numbersTopick; j++){
                if (j != i){
                    ChanceNode path = new ChanceNode(String.valueOf(j));
                    n.addPath(path, 1/(numbersTopick -1));

                    for(int k  = 1; k <= numbersTopick; k++){
                        if (k != j && k != i) {
                            ChanceNode pathagain = new ChanceNode(String.valueOf(k));
                            path.addPath(pathagain, 1/(numbersTopick - 2));
                        }
                    }
                }
            }

        }
    }


    public void createFSMrecursive(ChanceNode currentnode, int depth, ArrayList<ChanceNode> pathtome){
        for (int i = 1; i <= 10; i++){
            if (!pathtome.contains(i)){
                ChanceNode newnode = new ChanceNode(String.valueOf(i));
                currentnode.addPath(newnode, i/(10-depth));

                if (depth <= 3){
                    pathtome.add(currentnode);
                    createFSMrecursive(newnode, depth +1, pathtome);
                }
            }
        }
    }






}
