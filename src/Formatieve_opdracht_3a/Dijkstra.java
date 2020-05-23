package Formatieve_opdracht_3a;

import java.util.*;

public class Dijkstra {

    // Bubble sort ArrayList
    static ArrayList<String> bubbleSort( ArrayList<String> lst){
        for (int i = 0; i < lst.size() - 1; i++) {
            Integer swap = 0;
            for (int j = 0; j < lst.size() - 1; j++) {
                if ((lst.get(j).compareTo(lst.get(j + 1)) > 0)) {
                    //swap element
                    String temp = lst.get(j);
                    lst.set(j, lst.get(j + 1));
                    lst.set(j + 1, temp);

                    swap++;
                }
            }//end of for loop

            if (swap == 0) {
                break;
            }
        }
        return lst;
    }

    // Bubble sort LinkedList
    static LinkedList<String> bubbleSortLlist (LinkedList<String> lst){
        for(int i = 0; i< lst.size();i++){
            int swap = 0;
            for(int j =0 ; j< lst.size()-1; j++){
                if (lst.get(j).compareTo(lst.get(j + 1)) > 0){
                    // swap

                    String temp = lst.get(j);
                    lst.set(j, lst.get(j + 1));
                    lst.set(j + 1, temp);

                    swap++;
                }

            }//end of loop
            if (swap ==0){
            break;}
        }
        return lst;
    }


    static void Merge(ArrayList<String> arr , ArrayList<String> left, ArrayList<String> right){
        int i = 0;
        int j = 0;
        int index = 0;

        while(i < left.size() && j < right.size()){
            if (left.get(i).compareTo(right.get(j)) < 0) {
                arr.set(index, left.get(i));
                i++;
            }
            else{
                arr.set(index, right.get(j));
                j++;
            }
            index++;
        }

        while (i < left.size()){
            arr.set(index, left.get(i));
            i++;
            index++;
        }

        while (j < right.size()){
            arr.set(index, right.get(j));
            j++;
            index++;
        }

    }

    static ArrayList<String> MergeSort(ArrayList arr){
        System.out.println(arr);
        if (arr == null){
            return null;
        }
        if (arr.size() >1) {
            // Determine middel
            double middel  =  arr.size()/ 2; // round down middel and convert to int
            int m = (int) middel;


            ArrayList left = new ArrayList();
            ArrayList right = new ArrayList();


            for (int i = 0; i < arr.size(); i++) {
                if (i < m) {
                    left.add(arr.get(i));
                } else {
                    right.add(arr.get(i));
                }
            } // merge


            MergeSort(left);
            MergeSort(right);

            // merge
            Merge(arr, left, right);
            return arr;
        }
        return arr;
    }



    public static void main(String[] arg) {
        ArrayList<String> lst = new ArrayList<String>();
        lst.add("calculator");
        lst.add("zzzzzzzz");
        lst.add("apple");
        lst.add("ball");
        lst.add("iphone");
        lst.add("headphones");

        //System.out.println(lst); // list unsorted
        //System.out.println(bubbleSort(lst)); // list sorted

        //System.out.println("\n"); // new line

        LinkedList<String> linkedlst = new LinkedList<String>();
        linkedlst.add("aap");
        linkedlst.add("bindend");
        linkedlst.add("corkcicle");
        linkedlst.add("un");
        linkedlst.add("palabra");
        linkedlst.add("algo");

        //System.out.println(linkedlst);
        //System.out.println(bubbleSortLlist(linkedlst));


        ArrayList<String> arr = new ArrayList<String>();
        arr.add("app");
        arr.add("etui");
        arr.add("pen");
        arr.add("floss");
        arr.add("break");

        System.out.println(MergeSort(arr));








    }


}
