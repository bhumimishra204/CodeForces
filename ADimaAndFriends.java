import java.util.*;
public class ADimaAndFriends{
    public static void main(String args[]){
       Scanner sc= new Scanner (System.in);
       int n=sc.nextInt();
       int []friends=new int[5];
        int ans=0;
        int sum=0;
       for(int i=0;i<n;i++){
         friends[i]=sc.nextInt(); //frnds finger
         sum=sum+friends[i];
       }
       for(int i=1;i<=5;i++){ //dima fingers
        int fingersum=i+sum;
        if(fingersum%(n+1)!=1){
            
            ans++;
        }
       }
       System.out.println(ans);
    }
}