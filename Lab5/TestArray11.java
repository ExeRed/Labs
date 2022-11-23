package Labs.Lab5;

import java.util.Arrays;

class Array {
    double findMax(double array[]) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }

    void printArray(double array[]) {
        System.out.println(Arrays.toString(array));
    }

    double sumAll(double array[]) {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total = total + array[i];
        }
        return total;
    }

    int findMax(int array[]) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }

    void printArray(int array[]) {
        System.out.println(Arrays.toString(array));
    }

    int sumAll(int array[]) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total = total + array[i];
        }
        return total;
    }
}

public class TestArray11 {
    public static void main(String[] args) {
        double[] myList = {4.9, 1.9, 3.4, 3.2};
        int[] myList2   = {4,12,1,7,6,9,13};
        Array array = new Array();

        // FOR myList
        // Print all the array elements`
        System.out.print("Array demo double: ");
        array.printArray(myList);

        // Summing all elements
        System.out.printf("Total is %.2f\n", array.sumAll(myList));

        // Finding the largest element
        System.out.println("Max is " + array.findMax(myList));

        // FOR myList2
        // Print all the array elements
        System.out.println();
        System.out.print("Array demo int: ");
        array.printArray(myList2);

        // Summing all elements
        System.out.println("Total is " + array.sumAll(myList2));

        // Finding the largest element
        System.out.println("Max is " + array.findMax(myList2));
    }
}