package Formatieve_opdracht_2a;

import java.util.Scanner;


public class FSM {

    public static void main(String[] arg) {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();

        Node s0 = new Node("s0");
        Node s1 = new Node ("s1");
        Node s2 = new Node ("s2");
        Node s3 = new Node ("s3");

        s0.setNodeOnPathA(s2);
        s0.setNodeOnPathB(s1);
        s1.setNodeOnPathA(s1);
        s1.setNodeOnPathB(s2);
        s2.setNodeOnPathB(s3);
        s3.setNodeOnPathA(s3);
        s3.setNodeOnPathB(s0);

        Node node = s0;
        for(Integer letter = 0; letter < s.length(); letter++){
            if (s.charAt(letter) == 'A')
            {
                System.out.println(node);
                if (node.getNodeOnPathA() == null ){
                    System.out.println("Transition bestaat niet.");
                    return;
                }
                else{
                    node = node.getNodeOnPathA();
                }
            }
            else if (s.charAt(letter) == 'B')
            {
                System.out.println(node);
                if (node.getNodeOnPathB() ==null){
                    System.out.println("Transition bestaat niet.");
                    return;
                }
                else{
                node = node.getNodeOnPathB();
                }
            }
            else
                {
                    System.out.println("Transition bestaat niet.");
                return;


            }
        }
        System.out.println(node.getName());
    }
}
