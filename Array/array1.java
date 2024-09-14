package Array;

import java.util.Scanner;

public class array1 {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Corrected Scanner initialization
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // Reading array elements
        }

        printArray(arr); // Calling printArray method

        sc.close(); // Closing the Scanner
    }
}
