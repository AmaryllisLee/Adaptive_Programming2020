package Formatieve_opdracht_2a;

import java.util.ArrayList;

public class Node {
//public Klant(String nm){naam = nm;}
    String string; //input string


    public Node (String s){
        ArrayList<String> nodes = new ArrayList<String>();// Create ArrayList object
        int state =0;

        nodes.add("s0"); //initial node, Wether it is an A or an B, string s start at s0
       loop: for (int ind  = 0 ; ind  < s.length(); ind++)
        {
            switch (state){
                case 0:
                {
                    if (s.charAt(ind)=='A') // if s[ind] is equal to @
                    {
                        nodes.add("s2");
                        state = 2;

                    }
                    else if (s.charAt((ind))=='B')
                    {
                        nodes.add("s1");
                        state = 1;
                    }

                    break;
                }
                case 1:
                {
                    if (s.charAt(ind) == 'A')// check if s[ind] occurs in string .
                    {
                        nodes.add("s1");
                        state = 1;
                    }
                    else if (s.charAt(ind)== 'B')
                    {
                        nodes.add("s2");
                        state = 2;
                    }

                    break;
                }
                case 2:;
                {
                    if (s.charAt(ind)== 'B')
                    {
                        nodes.add("s3");
                        state = 3;

                    }
                    else
                    {
                        break loop;
                    }

                    break;
                }
                case 3:
                {
                    if (s.charAt(ind)== 'A')
                    {
                        nodes.add("s3");
                        state = 3;
                    }
                    else if (s.charAt(ind)== 'B')
                    {
                        nodes.add("s0");
                        state = 0;
                    }
                    break;
                }
                default:
                    nodes.add("s0");
                    state=0;
            }
        }//end of for loop


        if (state == 0)
            System.out.println(nodes);
        else
            System.out.println(nodes);

    }




    /*
    private String s ;
    ArrayList<Integer> nodes = new ArrayList<Integer>();// Create ArrayList object
    private int state = 0;


    for (int ind  = 0 ; ind  < s.length(); ind++)
    {
        switch (state){
            case 0:
            {
                if (s.charAt(ind)=='A') // if s[ind] is equal to @
                    state = 2;
                else if (s.charAt((ind))=='B')
                    state = 1;

                nodes.add(state);
                break;
            }
            case 1:
            {
                if (s.charAt(ind) == 'A')// check if s[ind] occurs in string .
                    state = 1;
                else if (s.charAt(ind)== 'B')
                    state = 2;

                nodes.add(state);
                break;
            }
            case 2:
            {
                if (s.charAt(ind)== 'B')
                    state = 3;

                nodes.add(state);
                break;
            }
            case 3:
            {
                if (s.charAt(ind)== 'A')
                    state = 3;
                else if (s.charAt(ind)== 'B')
                    state= 0;

                nodes.add(state);

                break;
            }
        }
    }//end of for loop

    if (state == 3)
        System.out.println(nodes);
    else
        System.out.println(nodes);


    }

     */
}
