package com.ClassExercise;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        Poem[] poem = new Poem[3];
        Poem poem1 = new Poem("Albino Lumi",12);
        Poem poem2 = new Poem("Rais Sallagaj", 14);
        Poem poem3 = new Poem("Paolo Vuksani", 16);
        poem[0]= poem1;
        poem[1] = poem2;
        poem[2] = poem3;

        Author author = new Author("lumi");
        Author author1 = new Author("Sallagaj");
        Author author2 = new Author("Vuksani");



        maxPoem(poem);





    }

    public static void maxPoem(Poem[] poems) {
        String max1= String.valueOf(0);
        int max = poems[0].getStropheNumbers();
        for (int i = 1; i < poems.length; i++) {
            if (max < poems[i].getStropheNumbers())
                max = poems[i].getStropheNumbers();

            max1 = poems[i].getCreator();


        }
        System.out.println("The longes poem written is by : " +max1 + " with " +max + " Strophes");


    }

}

