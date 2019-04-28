package math.problems;

import java.util.Arrays;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */

        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        int minDiff = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        int n1 = array1.length;
        int n2 = array2.length;
        int diff = 0;

        Arrays.sort(array1);
        Arrays.sort(array2);
        while(i < n1 && j < n2){
            diff = Math.abs(array1[i]-array2[j]);
            if(diff < minDiff){
                minDiff = diff;
            }
            if(array1[i] < array2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        System.out.println("The lowest difference between cells is: "+minDiff);
    }
}
