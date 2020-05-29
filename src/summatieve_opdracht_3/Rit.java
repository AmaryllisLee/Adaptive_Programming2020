package summatieve_opdracht_3;

import java.util.HashMap;

public class Rit extends Stap {
    Integer kilometers;

    public Rit(Node startn, Node endn, Integer kilometers){super(startn, endn);this.kilometers = kilometers;}

    @Override
    Integer getValue() {
        return kilometers;
    }
}
