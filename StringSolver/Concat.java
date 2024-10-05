package StringSolver;

import java.util.Arrays;
import java.util.StringJoiner;

public class Concat {
// String Literal
// -> Java String literal is created by using double quotes. For Example:
//    String s="welcome";  
// Each time you create a string literal, the JVM checks the "string constant pool" first. If the string already exists in the pool, a reference to the pooled instance is returned. If the string doesn't exist in the pool, a new string instance is created and placed in the pool. For example:
// String s1="Welcome";  
// String s2="Welcome";//It doesn't create a new instance  
// Java String
// In the above example, only one object will be created. Firstly, JVM will not find any string object with the value "Welcome" in string constant pool that is why it will create a new object. After that it will find the string with the value "Welcome" in the pool, it will not create a new object but will return the reference to the same instance.
// Note: String objects are stored in a special memory area known as the "string constant pool".
ccx
  public static void main(String[] args) {ccccdvdd
//     String s1 = new String("Welcome");
//     String s2 = "Teacher ".concat(s1);
//     System.out.println(s1);
//     System.out.println(s2);

//     String s="Sachin";  
//    s=s.concat(" Tendulkar");  
//    System.out.println(s);  
//    StringBuilder s3 = new StringBuilder("Hello");    //String 1  
//         StringBuilder s4 = new StringBuilder(" World");    //String 2 
        
//         StringBuilder s5 = s3.append(s4);   //String 3 to store the result  
//             System.out.println(s5.toString());  //Displays result  

            //joi method
        //     String s8 = new String("Hello");    //String 1  
        // String s7 = new String(" World");    //String 2  
        // String s9= String.join("--",s8,s7);   //String 3 to store the result  
        //     System.out.println(s9.toString());  //Displays result
        // StringJoiner s = new StringJoiner(", ");   //StringeJoiner object  
        // s.add("Hello");    //String 1   
        // s.add("World");    //String 2  
        // System.out.println(s.toString());
   

       

  
  }
}

