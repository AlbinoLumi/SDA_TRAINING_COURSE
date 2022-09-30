package com.JavaAdvancedCodingTasks;
/*Exercise 5.
Implement the SDAHashSet<E> class that will implement the HashSet<E> logic. It should support methods:
• add
• remove
• size
• contains
• clear*/

import java.util.LinkedHashSet;
import java.util.Scanner;

public class SDAHashsetClass {
    public static void main(String[] args) {
        LinkedHashSet hs = new LinkedHashSet();

        addElement(hs);
        removeElement(hs);
        size(hs);
        containsHashSet(hs);
        clearHashset(hs);


    }






    public static void addElement(LinkedHashSet<String> map){
        Scanner input = new Scanner(System.in);
        System.out.println("Jep numrin e elementeve");
        int size = input.nextInt();
        System.out.println("Jep elementin : ");
        for(int i = 0; i< size ; i++){
            String element = input.next();
            map.add(element);

        }
        System.out.println(map);
    }
    public static void removeElement(LinkedHashSet<String> map){
        System.out.println("Jepni elementin qe doni te hiqni");
        Scanner input = new Scanner(System.in);
        String element = input.nextLine();
        if(map.contains(element)){
            map.remove(element);

        }else {
            System.out.println("Elementi nuk ndodhet ne Hashset");
            System.out.println(map);
        }
    }
    public static void size(LinkedHashSet<String> map){
        System.out.println("Permasat e hashset jane " + map.size());
    }

    public static void containsHashSet (LinkedHashSet<String> map){
        System.out.println("Vendosni vleren per te bere check");
        Scanner input = new Scanner(System.in);
        String element = input.nextLine();
        if(map.contains(element)){
            System.out.println("Vlera u gjet");
        }else {
            System.out.println("Vlera nuk u gjet");
        }

    }
    public static void clearHashset(LinkedHashSet<String> map){
        map = new LinkedHashSet<>();
        System.out.println("\n Hashset pasi eshte bere clear: "+ map);
    }

}
