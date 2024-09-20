package Sorting;
import java.util.*;

public class Selection_Sort {
    static void selection_sort(int [] arr, int n){
        for(int i=0; i<= n-2 ; i++){
            int min = i;
              for(int j=i; j<=n-1; j++){
                 if(arr[j] < arr[min]){
                     min = j ; 
            }
           
          

             
                }
            int  temp = arr[min];
            arr[min] = arr[i];
            arr[i]=temp;
               
             }
    }

   
    
    
    public static void main(String[] args){

        int [] arr ={5,4,3,2,1};
       int n= arr.length;
       
       selection_sort(arr, n);
           for(int i=0; i<arr.length; i++){
               System.out.println(arr[i]);
           }
         

    
             
         

    }

}
