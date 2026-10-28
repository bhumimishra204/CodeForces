import java.util.*;

public class AWayTooLongWords{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String str[]=new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }
        for(int i=0 ;i<n;i++){
            int len=str[i].length();
            if(len>10){
               // int j=0;
                String word=str[i];
               // int len=word.length();
                char ch=word.charAt(0);
                char last=word.charAt(len-1);
                System.out.println(""+ch+(len-2)+last); // mistake
               // System.out.println(new StringBuilder().append(ch).append(len - 2).append(last));


            }else{
                System.out.println(str[i]);
            }
        }
    }
}