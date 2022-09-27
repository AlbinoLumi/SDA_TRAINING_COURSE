package RecapEverything;
//4. Write a Java program to copy an array by iterating the array.
//5. Write a Java program to find the duplicate values of an array of integer values


import com.DesignPatters.Observer.ForeCastDisplay;

import java.util.Arrays;
import java.util.Iterator;

public class Task5 {
    public static void main(String[] args) {
        int[] my_array = new int[]{4, 5, 9, 8, 2, 5};
        int[] new_array = new int[6];
        iterateArray(my_array, new_array);
        findDuplicates(my_array);


    }

    public static void iterateArray(int[] my_array, int[] new_array) {
        System.out.println("Original array " + Arrays.toString(my_array));

        for (int i = 0; i < my_array.length; i++) {
            new_array[i] = my_array[i];
        }

        System.out.println("New array is : " + Arrays.toString(new_array));
    }

    public static void findDuplicates(int[] my_array) {
        for (int i = 0; i < my_array.length - 1; i++) {
            for (int j = i + 1; j < my_array.length; j++) {
                if (my_array[i] == my_array[j]) {
                    System.out.println("There is a duplicate: " + my_array[j]);
                }

            }

        }
    }
}




