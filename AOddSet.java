import java.util.*;
public class AOddSet {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
       
        while(t-->0){
           int n=sc.nextInt();
        int arr[]=new int[2*n]; 
          int evenCount=0;
        int oddCount=0;
         for(int i=0;i<2*n;i++){
          arr[i] = sc.nextInt();
            if(arr[i]%2==0) evenCount++;
           else oddCount++;
        }
        
       
        if(evenCount==oddCount)
             System.out.println("Yes");
        else    
             System.out.println("No");
    }    
        sc.close();
    }
}
