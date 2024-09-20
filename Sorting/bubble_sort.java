package Sorting;
import java.util.*;

public class Bubble_sort {
    public static void bubble_sort(int []arr, int n){

        for(int i= n-1; i>=1; i--){
            for (int j=0; j<=i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }


    }
    public static void main(String[] args) {
        int[] arr= {34,23,27,54,75,34};
        int n= arr.length;
        
        bubble_sort(arr, n);

        for (int i=0; i<arr.length; i++){
             System.out.println(arr[i]);
        }
    }
}
