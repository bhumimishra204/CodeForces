import java.util.*;
public class AStonesOnTheTable {
    public static void main(String args[]){
             Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    String str=sc.next();
   
   int ans=0 ;
   for(int i=1;i<n;i++) {
     if(str.charAt(i)==str.charAt(i-1)) ans++;
    
    }
    System.out.println(ans);
   }
  
}