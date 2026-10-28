import java.util.*;
public class AUltraFastMathematician {
    public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          String str=sc.next();
          String str2=sc.next();
          String ans=" ";
          for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str2.charAt(i)){
                   ans+='1';
            }
            else {
                ans+='0';
            }
          }
          System.out.println(ans);
          sc.close();
    }
}