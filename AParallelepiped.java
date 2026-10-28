import java.util.*;
public class AParallelepiped{
    public  static void main(String args[]){
     Scanner sc= new Scanner(System.in);
     int A=sc.nextInt();
          int B=sc.nextInt();
int C=sc.nextInt();
int a = (int)Math.sqrt((long)A * C / B);
        int b = (int)Math.sqrt((long)A * B / C);
        int c = (int)Math.sqrt((long)B * C / A);
int  sum_edges=4*(a+b+c);
          System.out.println(sum_edges);
    }
}