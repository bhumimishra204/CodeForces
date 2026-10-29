import java.util.*;
public class ATranslation{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        
        if(s.length()!=t.length()) {
            System.out.println("NO");
            return;
        }

        for(int i=0;i<s.length();i++){
            if(s.length()==t.length()){
                if(s.charAt(i)!=t.charAt(t.length()-i-1)){
                System.out.println("NO");
                return;
            }
            }
        }
        
        System.out.println("YES");
    }
}