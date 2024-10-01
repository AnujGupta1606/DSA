package Gene;

import java.util.ArrayList;

public class G1 {
    // autoboxin and unboxing
    public static void main(String[] args) {
      
        // Integer obj1= Integer.valueOf(12);//autoboxing
        // Integer obj2= 12;
        // int i = obj1;//unboxing
 
  
        // System.out.println(obj1);
        // System.out.println(obj2);
        // System.out.println(i);

        //if you convert any data type into another data type use valueOf() method
        // Integer obj1= Integer.valueOf("123");
        // System.out.println(obj1+245);

        // ArrayList<Integer> list = new ArrayList<Integer>();
        
       Dog<String> d1= new Dog<>("Tommy");
       Dog<Integer> d2 = new Dog<>(12);
       System.out.println(d1);
       System.out.println(d2);


    }
}

public class Dog<T>{
    private T name;

    public Dog(T name){
        this.name= name;
    }


}
    

