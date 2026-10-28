import java.util.*;
public class AJeffAndDigits {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int numbers[]=new int[n];
         int sum=0;
         int countoffive=0,zero=0;
        for(int i=0;i<n ;i++){
            numbers[i]=sc.nextInt();
           sum+=numbers[i];
           if(numbers[i]==5) countoffive++;
          else if(numbers[i]==0) zero++;

        }
        if(zero == 0){
           System.out.println(-1);
             return;
        }
        if(countoffive < 9) {
          System.out.println(0);
          return;
        } 
        int fivesToUse = (countoffive / 9) * 9;
        for(int i=0;i<fivesToUse;i++){
             System.out.print(5);
        }
        for(int i=0;i<zero;i++){
             System.out.print(0);
        }

    }
}