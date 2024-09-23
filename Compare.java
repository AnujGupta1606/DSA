public class Compare {
    public static void main(String[] args) {
        String s1 = "Welcome";
        String s2 = "back";
        System.out.println(s1.compareTo(s2));
        String s5="Sachin";  
        String s6="Sachin";  
        String s3=new String("Sachin");  
        String s4="Saurav";  
        System.out.println(s5.equals(s6));//true  
        System.out.println(s6.equals(s3));//true  
        System.out.println(s5.equals(s4));//false  
        String s8="Sachin";  
   String s9="Sachin";  
   String s10=new String("Sachin");  
   System.out.println(s8==s9);//true (because both refer to same instance)  
   System.out.println(s8==s10);//false(because s3 refers to instance created in nonpool)  

    }
}
