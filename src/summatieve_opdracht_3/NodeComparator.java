package summatieve_opdracht_3;

import java.util.Comparator;

public class NodeComparator implements Comparator<Node> {


    @Override
    public int compare(Node s1, Node s2) {
        // Custom compare method om node te sorteren op base van distance in een Priority queue
        if ( s1.getAmount() > s2.getAmount()) {
            return 1;
        }
        else  if (s1.getAmount() < s2.getAmount()){
            return -1;
        }
        else{
            return 0;
        }
    }


}
