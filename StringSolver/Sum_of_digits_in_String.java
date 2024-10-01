package StringSolver;
import java.util.*;

/**
 * Sum_of_digits_in_String
 */

public class Sum_of_digits_in_String {
    public int sum_digits(String str) 
	{
		int l = str.length();
        int sum=0;
       
        for(int i=0; i<l; i++){
            char input = str.charAt(i);
            if(Character.isDigit(input)){
                sum= sum+Character.getNumericValue(input);
            }
        }
        return sum;
	}

    public static void main(String[] args){

           String str= "A1nu2j3jj43jk21";
           Sum_of_digits_in_String s1 = new Sum_of_digits_in_String();
           s1.sum_digits(str);
           System.out.println(s1.sum_digits(str));
    }
}