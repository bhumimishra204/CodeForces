import java.util.*;
public class AEvenOdds{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        long n=sc.nextLong();
        long k=sc.nextLong();
        long oddc=(n+1)/2;
         long ans=0;
        if(k<=oddc){
             ans=2*k-1;
        } else{
             ans=2*(k-oddc);
        }
        System.out.println(ans);
        
    }
}