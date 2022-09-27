package RecapEverything;
////6. Write a Java program to find the duplicate values of an array of string values.


public class Task6 {
    public static void main(String[] args) {
        String[] names = new String[]{"Albino", "Etjon", "Melita", "Albino"};
        //findDuplicates(names);

    }

    public static void findDuplicates(String[]names){
        for(int i = 0; i <= names.length -1; i++){
            for(int j = i+1; i < names.length; j++){
                if(names[i] == names[j]){
                    System.out.println("The duplicated names is : " +names[j]);
                }
            }
        }
    }

}
