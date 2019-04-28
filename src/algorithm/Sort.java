package algorithm;

import java.util.Random;

public class Sort {

    long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */
    public static void main(String[]args){
        int []ArrayNumber =new int[10];
        Random random = new Random();
        for (int x = 0; x<ArrayNumber.length;x++){
            ArrayNumber[x]= random.nextInt(1000);
        }
        Sort sort = new Sort();
        sort.selectionSort(ArrayNumber);
        System.out.println("Sorted Array : ");
        for (int a = 0; a<ArrayNumber.length; a++){
            System.out.println(ArrayNumber[a] + " ");
        }
        System.out.println();
        System.out.println("Execution Time : " + sort.executionTime);
    }
    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here



        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int[] array) {
        int[] list = array;
        //implement here
        int[] ArrayNumber = new int[1000];
        Random random = new Random();
        for (int x = 0; x < ArrayNumber.length; x++) {
            ArrayNumber[x] = random.nextInt(1000);
        }
        Sort bubbleSort = new Sort();
        bubbleSort.bubbleSort(ArrayNumber);
        System.out.print("Sorted Array : ");
        for (int a = 0; a < ArrayNumber.length; a++) {
            System.out.print(ArrayNumber[a] + " ");
        }

        System.out.println();
        System.out.println("Execution Time : " + bubbleSort.executionTime);


        return list;
    }

    public int[] mergeSort(int[] array) {
        int[] list = array;
        //implement here


        return list;
    }

    public int[] quickSort(int[] array) {
        int[] list = array;
        //implement here


        return list;
    }

    public int[] heapSort(int[] array) {
        int[] list = array;
        //implement here


        return list;
    }

    public int[] bucketSort(int[] array) {
        int[] list = array;
        //implement here


        return list;
    }

    public int[] shellSort(int[] array) {
        int[] list = array;
        //implement here


        return list;
    }
}
