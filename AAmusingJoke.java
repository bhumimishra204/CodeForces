import java.util.*;
public class AAmusingJoke {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String name=sc.next();
        String host_name=sc.next();
        String letter_in_pile=sc.next();
        HashMap<Character ,Integer> map=new HashMap<>();
       
        for(int i=0;i<name.length();i++){
            char ch= name.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<host_name.length();i++){
            char ch=host_name.charAt(i);
            map.put(ch ,map.getOrDefault(ch, 0)+1);
        }
        for(int i=0;i<letter_in_pile.length();i++){
            char ch=letter_in_pile.charAt(i);
            if(map.containsKey(ch)){
                
                map.put(ch ,map.get(ch)-1);
            }else {
                System.out.println("NO");
                return;
            }
        }
       boolean allZero = true;
        for(int val : map.values()){
            if(val != 0){
            allZero = false;
            break;
        }
      }
        if(allZero){
        System.out.println("YES");
        }else{
              System.out.println("NO");
           }

       
        sc.close();
    }
}
