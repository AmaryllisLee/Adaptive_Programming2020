package summatieve_opdracht_2;

import java.util.*;


public class Hangman {
    public static void main(String[] arg) {

        //Define word
        Scanner obj = new Scanner(System.in);
        String word = obj.nextLine();

        // list of unique char
        ArrayList<Character> charWord = new ArrayList<Character>();
        Set<Character> unique = new LinkedHashSet<>();
        for (int i = 0; i < word.length(); i++){
            unique.add(word.charAt(i));
        }
        charWord.addAll(unique);

        // define a list to store all states
        HashMap<String, Node> states =  new HashMap<>();


         for(Integer goedLetter = 0;goedLetter <= charWord.size();goedLetter++)
         {
             for(Integer foutLetter = 0;foutLetter <= 6;foutLetter++)
             {
                 //defining state --> node
                 //defining Node (goedLetter, badletter)
                 Node node  = new Node(Integer.toString(goedLetter), Integer.toString(foutLetter));
                 states.put((Integer.toString(goedLetter) + Integer.toString(foutLetter)), node);
             }
         }// end of loop
        // define end states




        //Define
        //Adding transitions to defined states Nodes

        for(Integer goedLetter = 0;goedLetter < charWord.size();goedLetter++)
        {
            for(Integer foutLetter = 0;foutLetter < 6;foutLetter++)
            {
                //if (== charWord.size() || )  if ( node (4, n) [0] == charWord.size() || node(n , 6) [1] == 6)
                // don't get a path


                Integer gLAddOne = goedLetter +1;
                Integer bLAddOne =  foutLetter + 1;
                String currentStateName = goedLetter + "" + foutLetter;
                states.get(currentStateName).setPathRight(states.get( gLAddOne + "" +foutLetter)); //node(gL, bL) =  node.SetPathRight(node (gL+1, bL))
                states.get(currentStateName).setPathWrong(states.get(goedLetter + "" + bLAddOne)); //node(gL, bL) =  node.setPathWrong(node(gL, bL + 1))

            }
        }// end of loop

    //Implement FSM
        System.out.println(word);//print word

        Node currentnode = states.get("00");//  start node


        ArrayList<String> result  = new ArrayList<String>(); // array that gives the states of the game
        do{
            System.out.println(charWord + " "+  charWord.size());

            result.add((currentnode.getGoodletter()+currentnode.getBadletter()));// add key value of currentnode to list result
            System.out.println(currentnode.getGoodletter() + " "+ currentnode.getBadletter());

            String letterinput  = obj.nextLine(); //input letter string
            Character letter = letterinput.charAt(0); // string to character


            if (charWord.contains(letter)){
                currentnode = currentnode.getPathRight();
                charWord.remove(letter);

        }
            else{

                currentnode = currentnode.getPathWrong();
            }

        }while (currentnode.getPathRight() != null && currentnode.getPathWrong() != null);


        if (currentnode.getGoodletter().equals(charWord.size()))
            {result.add((currentnode.getGoodletter()+currentnode.getBadletter()));
            System.out.println(result + " Congratulations, you WIN !");
        }else if (currentnode.getBadletter().equals("6")){
            result.add((currentnode.getGoodletter()+currentnode.getBadletter()));
            System.out.println(result + "YOU ARE DEAADDD");
        }





    }
}