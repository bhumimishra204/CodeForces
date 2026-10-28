import java.util.*;
public class ASoftDrinking {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        
        int n = sc.nextInt();  
        int k = sc.nextInt();   
        int l = sc.nextInt();   
        int c = sc.nextInt();  
        int d = sc.nextInt();   
        int p = sc.nextInt();   
        int nl = sc.nextInt();  
        int np = sc.nextInt();
        

        int totaldrink=(k*l)/nl;
        int totallimes=c*d;
        int totalsalt=p/np;

        int maxtoasts= Math.min(totaldrink ,Math.min(totallimes ,totalsalt));

        int result=maxtoasts/n;
        System.out.println(result);
        sc.close();
    }
}
