import java.util.*;
public class APerfectPermutation {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        
        if(n%2!=0){
             System.out.println(-1);
             return ;
        } 
        int [] ans=new int[n];
        for(int i=0;i<n;i++){
          ans[i]=i+1;
        }
        for(int i=0 ;i<ans.length ;i+=2){
            int temp=ans[i];
            ans[i]=ans[i+1];
            ans[i+1]=temp;

        }
       for(int i=0;i<n ;i++){
        System.out.print(ans[i]+" ");
       }
    }
}