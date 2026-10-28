import java.util.*;
public class AWord {
       public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        int countL=0;
        int countU=0;
        for(char ch: str.toCharArray()) {
            if(ch>='a' && ch<='z') countL++;
            else countU++;

        }
        if(countL>=countU)
             {
            for(char ch:str.toCharArray()){
              
                System.out.print(Character.toLowerCase(ch))    ;
                
            }

        } else {
             for(char ch:str.toCharArray()){
                  System.out.print(Character.toUpperCase(ch))    ; 
            }
        }

        sc.close();
       }
}