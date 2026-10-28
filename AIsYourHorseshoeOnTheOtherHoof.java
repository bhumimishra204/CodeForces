import java.util.*;
public class AIsYourHorseshoeOnTheOtherHoof {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // int arr[]=new int[4];
        // int count=0;
        // for(int i=0;i<4;i++){
        //     int temp=arr[i];
        //     for(int j=i+1 ;j<4;j++){
        //         if(temp==arr[j]) count++;
        //     }
        // }
        Set<Integer> set = new HashSet<>();
         for (int i = 0; i < 4; i++) {
            set.add(sc.nextInt());
        }
       System.out.println(4 - set.size());
    }
}