package summatieve_opdracht_2;

import java.util.*;

public class Hangman {


    public ArrayList<Character> choose_word(){
        // User chooses a word and the word gets separated  in to a list unique char
        //Define word
        Scanner obj = new Scanner(System.in);
        String word = obj.nextLine();

        // sepeerate word in to a list of unique char
        ArrayList<Character> charWord = new ArrayList<Character>();
        Set<Character> unique = new LinkedHashSet<>();
        for (int i = 0; i < word.length(); i++){
            unique.add(word.charAt(i));
        }
        charWord.addAll(unique);
        return  charWord;
    }

    public HashMap define_states(ArrayList<Character> charword) {
        //Define all the states( nodes) that is necessary
        HashMap<String, TekstNode> states =  new HashMap<>();

        //defining states
        for(Integer goedLetter = 0;goedLetter <= charword.size();goedLetter++)
        {
            for(Integer foutLetter = 0;foutLetter <= 6;foutLetter++)
            {
                //defining state --> node
                //defining Node (goedLetter,badletter)
                TekstNode tekstNode  = new TekstNode(Integer.toString(goedLetter)+Integer.toString(foutLetter));
                states.put((Integer.toString(goedLetter) + Integer.toString(foutLetter)), tekstNode);
            }
        }// end of loop
        // define end states

        return states;
    }


    public HashMap<String, TekstNode> putPath_states(ArrayList charWord, HashMap<String, TekstNode> states){
        //Adding transitions (path) to defined states Nodes
        for(Integer goedLetter = 0;goedLetter < charWord.size();goedLetter++)
        {
            for(Integer foutLetter = 0;foutLetter < 6;foutLetter++)
            {
                Integer gLAddOne = goedLetter +1;
                Integer bLAddOne =  foutLetter + 1;
                String currentStateName = Integer.toString(goedLetter) +Integer.toString(foutLetter);

                states.get(currentStateName).addPath(states.get( gLAddOne + "" +foutLetter), gLAddOne + "" +foutLetter  ); //node(gL, bL) =  node.SetPathRight(node (gL+1, bL))
                states.get(currentStateName).addPath(states.get(goedLetter + "" + bLAddOne), goedLetter + "" + bLAddOne); //node(gL, bL) =  node.setPathWrong(node(gL, bL + 1))
            }
        }// end of loop
        return states;
    }

/*
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
    
 */



}
