import java.util.*;
public class ALittleElephantAndRozdil{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       long[] arr = new long[n];
        int count_cities=0;
        for(int i=0;i<n;i++){
           arr[i]= sc.nextLong();
            
        }
        int index=0;
        long min=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<min){
                 min=arr[i];
                 index=i;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==min) count_cities++;
        }
        


        if(count_cities>=2){
            System.out.println("Still Rozdil");
        }
        else {
            System.out.println(index+1);
        }
        sc.close();
    }
}