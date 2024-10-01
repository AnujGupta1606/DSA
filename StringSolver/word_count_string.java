package StringSolver;


import java.util.*;

public class word_count_string {
    public void count(String str){
        int l= str.length();
        String[] input = str.split(" ");
        int wrc=1;
        for(int i=0; i<input.length;i++){
            for(int j=i+1; j<input.length;j++){
                if(input[i].equals(input[j])){
                    wrc +=1;
                    input[j]="0";
                }
            }
                if(input[i]!= "0"){
                    System.out.println(input[i]+":"+wrc);
                    wrc=1;
                }
            }
        }


    
    
    public static void main(String[] args) {

        String str = "HE IS A BOY IS A GIRL";
        word_count_string s1= new word_count_string();
      s1.count(str);

        
    }
    
}
