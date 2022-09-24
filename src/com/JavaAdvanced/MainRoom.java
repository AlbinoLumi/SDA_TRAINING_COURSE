package com.JavaAdvanced;

public class MainRoom {
    public static void main(String[] args) {
        Room room1 = new Room(new Bed("bed1", "A"),new TV("lg", 43));
        Room room2 = new Room(new Bed("bed2", "B"), new TV("Samsung", 55));


        System.out.println(room1.getTv().size);
        System.out.println(room1.getBed().bedroomType);
        System.out.println(room2.getTv().size);
        System.out.println(room2.getBed().bedroomType);
        System.out.println(room1.getTv().type);
        System.out.println(room1.getBed().name);
        System.out.println(room2.getTv().size);
        System.out.println(room2.getBed().name);





    }





}
