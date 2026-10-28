import java.util.*;
public class BEffectiveApproach{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
      }
      Map<Integer ,Integer> pos= new HashMap<>();
      for(int i=0;i<n;i++){
           pos.put(arr[i],i+1);
        }
        int m=sc.nextInt();
       

        long vasya=0;
       long pasya=0;
        
         for(int i=0;i<m;i++){
            int b=sc.nextInt();
          int posi=pos.get(b);
          vasya+=posi;
          pasya+=(n-posi+1);
        }
    System.out.println(vasya+" "+pasya);
        sc.close();
    }
}