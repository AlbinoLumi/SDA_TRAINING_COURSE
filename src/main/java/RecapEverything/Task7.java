package RecapEverything;

////7. Write a Java program to find the common elements between two arrays (string values).


import java.util.ArrayList;
import java.util.HashSet;

public class Task7 {
    public static void main(String[] args) {
        String[] name1 = new String[]{"Albino","Asra","Marta"};
        String[] name2 = new String[]{"Manuela","Briselda","Marta", "elelele", "sdajflj"};

        HashSet<String> set = new HashSet<String>();


        for(int i = 0; i < name1.length-1 ; i++){
            for(int j = 0; i < name2.length-1; j++){
                if (name1[i].equals(name2[j])){

                }
                set.add(name1[i]);
            }
            System.out.println("The common elements are : " +(set));
        }



    }
}
