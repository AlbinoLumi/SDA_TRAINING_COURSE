package com.sda.classess;

public class ImplementationPlan {
    public static void main(String[] args) {
        Telefon iphone = new Telefon(12.0, "Iphone",4.4);
        Laptop laptop = new Laptop();
        System.out.println(iphone.getKamera());
        System.out.println(iphone.getMarka());
        System.out.println(iphone.getProcesor());

        Laptop dell = new Laptop(8,"dell",4.8);
        System.out.println(dell.getProcesor());
        System.out.println(dell.getRam());
        System.out.println(dell.getMarka());

        Qyteti shkoder = new Qyteti("Shqiperi", "Shkoder", 4852);
        System.out.println(shkoder.getShtetiKueshte());
        System.out.println(shkoder.getEmri());
        System.out.println(shkoder.getSiperfaqja());




    }
}
