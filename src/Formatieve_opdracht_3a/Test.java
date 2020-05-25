package Formatieve_opdracht_3a;

import java.util.ArrayList;

public class Test implements Comparable<Test> {
        int iint;
    public Test (int i){iint = i;}

    @Override
    public int compareTo(Test o) {
        if (this.iint ==o.iint){
        return 0;
        }else if (this.iint > o.iint){
            return 1;
        }else
            {return -1;}
    }

    static ArrayList<Comparable> bubbleSortGeneric(ArrayList<Comparable> lst){
        for (int i = 0; i < lst.size() - 1; i++){
            int swap = 0;
            for (int j = 0; j < lst.size() - 1; j++) {
                if ((lst.get(j).compareTo(lst.get(j + 1)) > 0)) {
                    //swap element
                    Comparable temp = lst.get(j);
                    lst.set(j, lst.get(j + 1));
                    lst.set(j + 1, temp);

                    swap++;
                }
            }//end of for loop

            if (swap == 0) {
                break;
            } }
        return lst;
    }
    public String toString(){
        return Integer.toString(iint);
    }


    /*
    @Override
    public boolean equals(Test test) {
        return super.equals(test);
    }


*/
    public static void main(String[] arg){
        Test t = new Test(7);
        Test t2 = new Test(6);
        Test t3 = new Test(4);

        System.out.println(t.compareTo(t2));

        // Datastructure<Test> n = new Datastrucutre<Test>();


        ArrayList<Comparable> arr = new ArrayList<Comparable>();
        arr.add(t);
        arr.add(t2);
        arr.add(t3);

        System.out.println(arr);

        System.out.println(bubbleSortGeneric(arr));


    }

}


