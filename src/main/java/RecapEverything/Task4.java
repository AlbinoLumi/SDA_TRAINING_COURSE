package RecapEverything;
//1. Write a Java program to calculate the average value of array elements
//2. Write a Java program to test if an array contains a specific value.


public class Task4 {
    public static void main(String[] args) {
        String[] names = new String[]{"Albino", " Rais", "Eltion"};



        System.out.println(averageValue(names));
        containsAspecificValue(names);



    }

    public static float averageValue(String[] names) {
        int sum = 0;
        float average = 0.0f;
        for (int i = 0; i < names.length; i++) {
            sum += names[i].length();
            average = sum / names.length;

        }
        return average;
    }

    public static void containsAspecificValue(String[] names) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].contains("Albino")) {
                System.out.println("It contains this value");
            } else
                System.out.println("It doesn't");

        }

    }
}



