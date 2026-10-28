// import java.util.*;
// public class AILoveUsername{
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         int count=0;
//         for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
           
//         }
//          if(n == 1) {   // edge case
//             System.out.println(0);
//             return;
//         }
//          int min=arr[0];
//         int max=arr[0];
//         for(int i=1;i<n;i++){
//            if(arr[i]>max && arr[i]>arr[i-1]){
//             count++;
//             max=Math.max(max,arr[i]);
            
//            }
//            else  if(arr[i]<min && arr[i]<arr[i-1]){
//             count++;
//             min=Math.min(min,arr[i]);
//            }
            
//         }
        
//         System.out.println(count);
//     }
// }
import java.util.*;

public class AILoveUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int first = sc.nextInt();

        int min = first, max = first, count = 0;

        for (int i = 1; i < n; i++) {
            int x = sc.nextInt();

            if (x > max) {
                max = x;
                count++;
            } else if (x < min) {
                min = x;
                count++;
            }
        }

        System.out.println(count);
    }
}