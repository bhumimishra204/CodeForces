import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AKString {
    public  static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        String str= sc.next();
        // HashMap<Character,Integer> map= new HashMap<>();
        // for(int i=0 ;i<str.length();i++){
        //     char ch= str.charAt(i);
        //     map.put(ch ,map.getOrDefault(ch, 0)+1);
        // }
        // ArrayList result= new ArrayList<>();
        // while(map.size()!=0){
          
        // }
        int []count= new int[26];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            count[i]=ch-'A';
        }
    }
}
