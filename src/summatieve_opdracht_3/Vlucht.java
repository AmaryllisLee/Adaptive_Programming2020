package summatieve_opdracht_3;

import java.util.HashMap;

public class Vlucht extends Stap {
    Integer  euro;
    Integer kansBagageKwijt;


    public Vlucht(Node startn, Node endn, Integer euro, Integer kansBagageKwijt){
        super(startn, endn);
        this.euro = euro;
        this.kansBagageKwijt = kansBagageKwijt;
    }

    @Override
    Integer getValue() {
        return (int) euro * kansBagageKwijt;
    }
}
