package summatieve_opdracht_3;

import java.util.HashMap;

public class Vlucht extends Stap {
    Integer  euro;
    Double kansBagageKwijt;


    public Vlucht(Node startn, Node endn, Integer euro, Double kansBagageKwijt){
        super(startn, endn);
        this.euro = euro;
        this.kansBagageKwijt = kansBagageKwijt;
    }

    @Override
    Integer getValue() {
        Integer cost =(int) Math.round(euro * (1+kansBagageKwijt));
        return cost;
    }
}
