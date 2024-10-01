package StringSolver;
import java.util.*;

public class practice {
    public static void main(String[] args) {
         

        
// Scanner sc= new Scanner(System.in);

// String str = sc.nextLine();

// //Print Characters Presented at Odd Positions by Using the charAt() Method

// for(int i=0; i<str.length(); i++){
//     if(i%2!=0){
//           System.out.println(str.charAt(i));
//     }
// }
// // print the frequency of character
// for (int i=0; i<str.length(); i++){
//     int count=0;
//     if(str.charAt(i) == 't'){
//         count++;
//     }
    
// }

// Online Java Compiler
// Use this editor to write, compile and run your Java code online


    //     String str = "Anuj";
    //   for(int i=0; i<str.length();i++){
    //       for(int j=i+1; j<str.length(); j++){
    //          System.out.println(str.substring(i,j));
    //       }
    //   }

    // reverse a string
    // StringBuilder str = new StringBuilder("Aryan");
    // System.out.println(str.reverse());

    // for(int i=str.length()-1; i>=0;i--){
    //     System.out.print(str.charAt(i));
    // }

      
    // for(int i=0; i<str.length();i++){
    //     System.out.print(str.charAt(i));
    // }
    // }
    // checking pallindrome
    StringBuilder str = new StringBuilder("Anuj");
    StringBuilder reve = str.reverse();
    System.out.println(reve);
    if(str == reve){
        System.out.println("it is not pallindroem");
    }
    else{
        System.out.println("it is not a pallindrome");
    }

    

   


    }
}
