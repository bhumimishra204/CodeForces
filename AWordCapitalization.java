import java.util.*;
public class AWordCapitalization {
    public static void main(String args[]){
          Scanner sc= new Scanner(System.in);
          String str=sc.nextLine();
          
          char fch=str.charAt(0);
          if(fch>='a' && fch<='z') {
                fch=Character.toUpperCase(fch);
            }
            String ans= fch+str.substring(1);
            System.out.print(ans);
          sc.close();
    }
}