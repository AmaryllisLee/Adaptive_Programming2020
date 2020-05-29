package summatieve_opdracht_3;

import java.util.HashMap;

public class Treinrit extends Stap{
   Integer duration ;


   public Treinrit(Node startn, Node endn, Integer duration){
      super(startn, endn);
      this.duration = duration;}

   @Override
   Integer getValue() {
      return duration;
   }
}
