package Labs;

import java.util.Arrays;

class Array2 {
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

    int szukaj(double[] array, double numToFind) {
        int index = -1;
        int low = 0;
        int high = array.length-1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] < numToFind) {
                low = mid + 1;
            } else if (array[mid] > numToFind) {
                high = mid - 1;
            } else if (array[mid] == numToFind) {
                index = mid;
                break;
            }
        }
        return index;
    }
}

public class Zadanie2 {
    public static void main(String[] args) {
        double[] myList = {4.9, 1.9, 3.4, 3.2};
        double result;
        Array2 arr = new Array2();

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

        int i = arr.szukaj(myList, 4.9);
        System.out.println("Szukany element jest pod indeksem " + i);

        // Odwracanie kolejności elementów
        System.out.print("Reversed array: ");
        arr.odwroc(myList);
        arr.printArray(myList);

    }
}