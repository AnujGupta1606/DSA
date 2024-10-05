package Array;
import java.util.Scanner



public class LargestElement {
    public static void Lg(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max= arr[i];

            }
        }
        System.out.println("Largest Element: "+ max);   //Time complexity O(n)
    }
    public static void main(String[] args){f
        Scanner sc = new Scanner(System.in); // Ccdorrected Scanner initialization
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // Reading array elements
        }

        Lg(arr);
        sc.close();


    }
}
