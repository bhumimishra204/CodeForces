import java.util.*;
public class BQueueAtTheSchool {
    // public static void swap (char[]arr ,char i ,char j){
    //     char temp = arr[i];
    //     arr[i]=arr[j];
    //    arr[j] = temp;
    //    return ;
      
    // } wrong
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        String s=sc.next();
        char[] arr=s.toCharArray();
        int i=0;
        while(t-->0){

            while( i<n-1) {
                 if(arr[i]=='B' && arr[i+1]=='G' ){
                   char temp =arr[i];
                   arr[i]=arr[i+1];
                   arr[i+1]=temp;
                   i+=2;
                } else {
                    i++;
                }
                
            }
            i=0;
        }
        System.out.println(new String(arr));
        sc.close();
    }
}
