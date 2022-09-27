package com.sda.classess;

public class LaptopImplementation {

    public static void main(String[] args) {
        Laptop dell = new Laptop(8, "dell", 3.8);
        System.out.println(dell.getRam());
        System.out.println(dell.getMarka());
        System.out.println(dell.getProcesor());
    }
}
