package Sorting;

public class Insertion_sort {
    public static void insertion_sort(int [] arr, int n){

        for(int i=0; i<arr.length; i++){
          int   j=i;
          while(j>0 && arr[j-1]>arr[j]){

            int temp =arr[j-1];
            arr[j-1]=arr[j];
            arr[j]= temp;
           j--;
              
          }

        }

    }
    public static void main(String[] args) {
        int [] arr= {9,3,6,2,7,2,8};
       int  n= arr.length;

       insertion_sort(arr, n);
       for(int i=0; i<arr.length; i++){
        System.out.println(arr[i]);
       }
        
    }
}
