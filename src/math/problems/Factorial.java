package math.problems;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5 = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        Factorial factorial = new Factorial();
        int number = factorial.factorial(5);
        System.out.println("factorial of 5 is : "+number);

    }

    public int factorial(int x){
        int number = 1;
        for (int i=1; i<=x; i++) {
            number = number*i;
        }
        return number;
    }
}


