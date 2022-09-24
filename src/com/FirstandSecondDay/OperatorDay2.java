package com.FirstandSecondDay;

public class OperatorDay2 {

        public static  void main(String[] args){
            int number_1 = 2;
            int number_2 = 9;

            System.out.println(number_1 == number_2);
            System.out.println(number_1 != number_2);
            System.out.println(number_1 <= number_2);
            System.out.println(number_1 >= number_2);
            System.out.println(number_1 < number_2);
            System.out.println(number_1 > number_2);

            int shume = number_1 + number_2;
            shume =shume + number_1; // eshte e barabarte me shume =+numer_1;
            //Ne momentin q e plusi eshte pas variablit
            // do te ekzekutohet Sytem.out.println para dhe pastaj
            //behet rritja e vleres se variablit
            System.out.println("Vlera e variablit number_1 eshte :" + number_1++);
            System.out.println("Vlera e variablit number_2 eshte :" + number_2--);

            //Ne momentin qe plusi eshte para variablit
            // do te ekzekutohet rritja e vleres me nje dhe pastaj
            //behet rritja e vleres se variablit
            System.out.println("Vlera e variablit number_1 eshte :" + ++number_1);
            System.out.println("Vlera e variablit number_2 eshte :" + --number_2);


            boolean vlera1 = true;
            boolean vlera3 = false, vlera4 = true;

            //Operatoret
            System.out.println(vlera1 && vlera3);
            System.out.println(!vlera3);
            System.out.println(vlera4 && vlera3);
            System.out.println(vlera1 && vlera3);
            System.out.println(vlera1 || vlera3);
            System.out.println(vlera1 || vlera1);
            System.out.println(vlera3 || vlera3);
            System.out.println(vlera1 || vlera3);


        }
    }


