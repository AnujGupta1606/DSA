package Array;

import java.util.Scanner;


public class SecondLargest {

    public static void secondLargest(int [] arr){
        int flarge=1, slarge=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>flarge && arr[i]!= flarge){
                slarge= flarge;
                flarge= arr[i];
                
            }
            else if(flarge>arr[i] && slarge<arr[i]){
                    slarge = arr[i];
            }
        }

        System.out.println(slarge);


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

            secondLargest(arr);
            sc.close();
    }
    
}
