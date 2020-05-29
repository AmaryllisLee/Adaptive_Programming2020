package summatieve_opdracht_3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Reis implements Comparable<Reis> {

    LinkedList<Node> nodes;
    Integer distance;

    public Reis (LinkedList<Node> nodes) throws Exception{
        this.nodes = nodes;

        Integer sumDistance = 0;
        for(int i = 0;i< nodes.size() -1;i++ ){
            ArrayList<Stap> stapRoute = nodes.get(i).getStapRoutes();
            boolean st =false;
            for (int j = 0;j < stapRoute.size();j++){
                Stap stap = stapRoute.get(j);
                if (stap.getStartnode() == nodes.get(i) && stap.getEndnode() == nodes.get(i+1)){
                    st = true;
                    sumDistance += stap.getValue();
                    break;
                }
            }
            if (!st){
            throw new Exception(String.format("Stap van %s naar %s bestaat niet", nodes.get(i).getName(), nodes.get(i+1).getName() ));}

        }
        distance = sumDistance;
    }

    public Integer getDistance() {
        return distance;
    }

    @Override
    public int compareTo(Reis r)
    {
        if(this.distance > r.getDistance()){
            return 1;
        }
        else if ( this.distance <  r.getDistance())
        {
            return -1;
        }
        return 0;
    }



    //https://stackoverflow.com/questions/6952660/java-priority-queue-reordering-when-editing-elements?lq=1




    
}

