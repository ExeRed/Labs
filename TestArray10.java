package Labs;

import java.util.Arrays;

class Array {
    double findMax(double[] array) {
        double n = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > n) {
                n = array[i];
            }
        }
        return n;
    }

    void printArray(double[] array) {
        System.out.println(Arrays.toString(array));
    }

    double sumAll(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    void sortArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    double a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }
    }

    void odwroc(double[] array) {
        for (int i = 0; i < array.length/2; i++){
            double t = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = t;
        }
    }
}

public class TestArray10 {
    public static void main(String[] args) {
        double[] myList = {4.9, 1.9, 3.4, 3.2};
        double result;
        Array arr = new Array();

        // Print all the array elements
        System.out.print("Array demo");
        arr.printArray(myList);

        //Summing all elements
        result = arr.sumAll(myList);
        System.out.printf("Total is %.2f\n", result);

        // Finding the largest element
        result = arr.findMax(myList);
        System.out.println("Max is " + result);

        // Sortowanie tablicy
        System.out.print("Sorted array: ");
        arr.sortArray(myList);
        arr.printArray(myList);

        // Odwracanie kolejności elementów
        System.out.print("Reversed array: ");
        arr.odwroc(myList);
        arr.printArray(myList);
    }
}