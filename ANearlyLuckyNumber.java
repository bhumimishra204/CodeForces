import java.util.*;

public class ANearlyLuckyNumber{
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        String str= sc.nextLine();
        int count=0;

        for(char ch: str.toCharArray()){
            if(ch=='4' || ch=='7' ) count++;
            
        }
        if(count==4 || count==7){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
       
       
    }
}