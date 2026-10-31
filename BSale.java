import java.util.*;
public class BSale {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int price[]=new int[n];
        
        for(int i=0;i<n;i++){
            price[i]=sc.nextInt();
        }
        Arrays.sort(price);
        int profit = 0;
        for(int i = 0; i < m; i++) {
                  if(price[i] < 0)
              profit += -price[i];
        }

System.out.println(profit);
    }
}