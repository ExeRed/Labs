package Labs.Lab5;

import java.util.Arrays;

class Array1 {
    double[] arr;// Referencja do tablic
    int size;     // Wielkość tablicy

    Array1(int n) {
        arr = new double[n];
        size = n;
    }

    Array1(double[] tab) {
        this.arr = tab;
    }

    void printArray() {
        System.out.println(Arrays.toString(arr));
    }

    double findMax() {
        // Funkcja zwraca maksymalny element tablicy arr
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    double sumAll() {
        // Uzupełnić sumowanie elementów tablicy arr
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        return total;
    }
}

public class TestArray12 {
    int a;
    
    public static void main(String[] args) {
        double[] myList = {4.9, 1.9, 3.4, 3.2};
        Array1 tab = new Array1(myList);
        double result;

        // Print all the array elements
        System.out.println("Array demo");
        tab.printArray();

        // Summing all
        result = tab.sumAll();
        System.out.println("Total is " + result);

        // Finding the largest element
        result = tab.findMax();
        System.out.println("Max is " + result);
    }
}