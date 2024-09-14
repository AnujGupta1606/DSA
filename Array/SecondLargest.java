package Array;

import java.util.Scanner;


public class SecondLargest {

    static private void secondSmallest(int[] arr, int n)
{
	// if (n < 2)
	// {
	// 	return -1;
	// }
	int small = Integer.MAX_VALUE;
	int second_small = Integer.MAX_VALUE;
	int i;
	for (i = 0; i < n; i++)
	{
	   if (arr[i] < small)
	   {
		  second_small = small;
		  small = arr[i];
	   }
	   else if (arr[i] < second_small && arr[i] != small)
	   {
		  second_small = arr[i];
	   }
	}
   System.out.println(second_small);
}
static private void secondLargest(int[] arr, int n)
{
	
	int large = Integer.MIN_VALUE;
	int second_large = Integer.MIN_VALUE;
	int i;
	for (i = 0; i < n; i++)
	{
		if (arr[i] > large)
		{
			second_large = large;
			large = arr[i];
		}

		else if (arr[i] > second_large && arr[i] != large)
		{
			second_large = arr[i];
		}
	}
	System.out.println(second_large);
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

            secondLargest(arr,5);
            secondSmallest(arr,5);
            sc.close();
    }
    
}
