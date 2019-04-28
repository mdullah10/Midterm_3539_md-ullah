package string.problems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String x = "Cat";
        String y = "Act";

        char[] arrayOfCharFromStringA=x.toCharArray();
        char[] arrayOfCharFromStringB=y.toCharArray();

        Arrays.sort(arrayOfCharFromStringA);
        Arrays.sort(arrayOfCharFromStringB);

        if (Arrays.equals(arrayOfCharFromStringA, arrayOfCharFromStringB)){
            System.out.println("Word are Annangram");
        } else {
            System.out.println("Word are not Annangram");
        }



    }
}
