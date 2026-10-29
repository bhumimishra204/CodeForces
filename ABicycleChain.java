import java.util.*;
public class ABicycleChain{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        
        int n= sc.nextInt();
        int []pedal_axel= new int[n];
        for(int i=0;i<n;i++){
            pedal_axel[i]=sc.nextInt();
         }

        int m= sc.nextInt();
        int []rear_axel=new int[m];
         for(int j=0;j<m;j++){
            rear_axel[j]=sc.nextInt();
         }
        int count=0;
        int max=0;
        
        for(int i=0;i<n;i++){
           

             for(int j=0;j<m;j++){

                if(rear_axel[j]%pedal_axel[i]==0){
                int ratio=rear_axel[j]/pedal_axel[i];
                if(ratio>max){
                    max=ratio;
                    count=1;
                }
                else if(ratio==max) count++;
              }
           
            }
        
        }
        System.out.println(count);
    }
}