import java.util.*;
public class BDrinks {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        double sum=0;
        for(int i=0;i<n ;i++){
            sum+=sc.nextDouble();
        }
        double ans=sum/n;
        System.out.printf("%.12f%n" ,ans);

        sc.close();
    }
}
