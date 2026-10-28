import java.util.*;

public class AHq9 {
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        String p=sc.next();
        for(char ch:p.toCharArray()){
            if(ch=='H' || ch=='Q' || ch=='9' ){
                System.out.println("YES");
                return;
            }

        }
        System.out.println("NO");
    }
}