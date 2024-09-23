package String;
import java.util.*;

public class practice {
    public static void main(String[] args) {
         //Print Characters Presented at Odd Positions by Using the charAt() Method

        
Scanner sc= new Scanner(System.in);
String str = sc.nextLine();

for(int i=0; i<str.length(); i++){
    if(i%2!=0){
          System.out.println(str.charAt(i));
    }
}


        
    }
   



}
