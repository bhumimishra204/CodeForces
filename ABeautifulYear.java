import java.util.*;
public class ABeautifulYear {
    public static boolean distinct(int year){
        String s= String.valueOf(year);
        Set<Character> set= new HashSet<>();
        for(char ch: s.toCharArray()){
            if(set.contains(ch)) return false;
            set.add(ch);
        }
        return true;
    }
        public static void main(String args[]){
              Scanner sc= new Scanner (System.in);
              int y=sc.nextInt();
            int next=y+1;
              while(!distinct(next)) next++;
              System.out.println(next);
              sc.close();
        }
}