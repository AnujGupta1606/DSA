package Array;

public class Rotated_array {
    static void leftRotate(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp; // Corrected index
    }
    // left rote by array at d places
    static void  leftRotate_Byd(int[]arr,int d){
        int n= arr.length;
        if(d>n){                      //o(n+d)
            d= d%n;
        }
        int [] temp = new int [d];
        for(int i=0; i<d ; i++){
            
           temp[i]=arr[i];
        }
        for(int i=d; i<arr.length; i++){
            arr[i-d]=arr[i];
        }
        
        for(int i=n-d; i<n; i++) {

              arr[i]= temp [i-(n-d)];
             
        }


    }
    //o(n)
    static void left(int[]nums,int k){
        int n = nums.length;
        k = k % n; // In case k is larger than n
        
        // Step 1: Reverse the entire array
        reverse(nums, 0, n - 1);
        
        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);
        
        // Step 3: Reverse the remaining n-k elements
        reverse(nums, k, n - 1);

    }
    static void reverse(int[]nums,int start, int end){
        int n = nums.length;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5,6,7};
        // leftRotate(arr); // Calling the method to rotate the array
        
        // // Printing the rotated array
        // for (int i : arr) {
        //     System.out.print(i + " ");
        // }
        // System.out.println();
        leftRotate_Byd(arr,3);
        for (int i : arr) {
            System.out.print(i + " ");
        }

//         left(arr, 4);
//         System.out.println();

//  for (int i : arr) {
//             System.out.print(i + " ");
//         }

    }
}
