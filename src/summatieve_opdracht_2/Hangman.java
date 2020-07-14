package summatieve_opdracht_2;


import java.util.*;

public class Hangman {
    public static void main(String[] arg) {
        //Hangman
        System.out.println("Hangman");
        Hangman hangman = new Hangman();

        ArrayList<Character> word = hangman.choose_word();
        HashMap<String, TekstNode> define_states = hangman.define_states(word);
        HashMap<String, TekstNode> states = hangman.putPath_states(word, define_states);

        ArrayList<TekstNode> result = hangman.playHangman(word,states);
        String winnerLoser = hangman.aliveOrdead(result);
        System.out.println(winnerLoser);
    }


    public ArrayList<Character> choose_word() {
        // User chooses a word and the word gets separated  in to a list unique char
        //Define word
        Scanner obj = new Scanner(System.in);
        String word = obj.nextLine();

        // separate word in to a list of unique char
        Set<Character> unique = new LinkedHashSet<>();
        for (int i = 0; i < word.length(); i++) {
            unique.add(word.charAt(i));
        }
        ArrayList<Character> charWord = new ArrayList<>(unique);
        System.out.println(word+" : " + charWord);
        return charWord;
    }

    public HashMap<String, TekstNode> define_states(ArrayList<Character> charword) {
        //Define all the states( nodes) that is necessary
        HashMap<String, TekstNode> states = new HashMap<>();

        //defining states

        for (int goedLetter = 0; goedLetter <= charword.size(); goedLetter++) {
            for (int foutLetter = 0; foutLetter <= 6; foutLetter++) {

                //defining state --> node
                //defining Node (goedLetter,badletter)
                TekstNode tekstNode = new TekstNode(goedLetter+ "" + foutLetter);
                states.put(goedLetter +""+ foutLetter, tekstNode);
            }
        }// end of loop
        // define end states

        return states;
    }


    public HashMap<String, TekstNode> putPath_states(ArrayList charWord, HashMap<String, TekstNode> states) {
        //Adding transitions (path) to defined states Nodes
        TekstNode win = new TekstNode("WIN");
        TekstNode lose = new TekstNode("LOSE");
        for (int goedLetter = 0; goedLetter < charWord.size(); goedLetter++) {
            for (int foutLetter = 0; foutLetter < 6; foutLetter++) {
                int gLAddOne = goedLetter + 1;
                int bLAddOne = foutLetter + 1;
                String currentStateName = goedLetter+ "" + foutLetter;

                states.get(currentStateName).addPath(states.get(currentStateName), "Invalid");
                if (goedLetter == charWord.size()-1){
                    states.get(currentStateName).addPath(win, "Right");
                }else {
                    states.get(currentStateName).addPath(states.get(gLAddOne + "" + foutLetter), "Right");
                }

                if (foutLetter == 5){ //6 -1
                    states.get(currentStateName).addPath(lose, "Wrong");
                }else {
                    states.get(currentStateName).addPath(states.get(goedLetter + "" + bLAddOne), "Wrong");
                }
            }
        }// end of loop
        return states;
    }

    public TekstNode getPathbyValue(Node node, String value){
        for (Node i : node.getNodes().keySet()){
            if (node.getNodes().get(i).equals(value)){
                return (TekstNode) i;
            }
        }
        return null;
    }

    public ArrayList<TekstNode> playHangman(ArrayList<Character> word, HashMap<String, TekstNode> states) {
        //Implement FSM
        TekstNode currentnode = states.get("00");//  start node
        ArrayList<TekstNode> result = new ArrayList<>(); // array that gives the states of the game


        do {
            System.out.println(word + " " + word.size());

            result.add(currentnode);
            System.out.println(currentnode.getName());

            //User chooses letter
            Scanner obj = new Scanner(System.in);
            String letterinput = obj.nextLine(); //input letter string
            Character letter = letterinput.charAt(0); // string to character

            if (!Character.isLetter(letter)){
                currentnode = getPathbyValue(currentnode, "Invalid");
                System.out.println("Please enter a letter from A to Z");
            }
            if (word.contains(letter)) {
                //currentnode = currentnode.getPathRight();
                currentnode = getPathbyValue(currentnode, "Right");
                word.remove(letter);

            } else {
                currentnode = getPathbyValue(currentnode, "Wrong");
            }

        } while (currentnode.getNodes().size() != 0);

        result.add(currentnode);

        return result;
    }

    public String aliveOrdead(ArrayList<TekstNode> result){
        //Determine if player won or lost
        if (result.get(result.size()-1).getName().equals("WIN")){
            //result.add(currentnode.getName());
            return " Congratulations, you WIN !";
        } else if (result.get(result.size()-1).getName().equals("LOSE")){
            //result.add(currentnode.getName());
            return "YOU ARE DEAADDD";
        }
        return "Error has occurred, correct: " + result.get(result.size()-1).getName();
    }

}





