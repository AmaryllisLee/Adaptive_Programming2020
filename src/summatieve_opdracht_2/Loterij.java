package summatieve_opdracht_2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Loterij {
    private int numbersTopick;
    private ChanceNode startnode;


    public ArrayList<String> pickNumber(){
        //Define word

        Scanner obj = new Scanner(System.in);
        String keuze = obj.nextLine();
        String[] keuzesplit = keuze.split(" ");

        ArrayList<String>unique_keuzesplit = new ArrayList<>();
        for(int i= 0; i < keuzesplit.length - 1; i++){
            if (!unique_keuzesplit.contains(keuzesplit[i])){
                if (Integer.parseInt(keuzesplit[i]) > 0 && Integer.parseInt(keuzesplit[i]) <= numbersTopick ){
                unique_keuzesplit.add(keuzesplit[i]);
                }
            }
        }//end of for loop

        if (unique_keuzesplit.size() != 3){
            return null;
        }
        else{
            return unique_keuzesplit;
        }
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





}
