import java.util.Scanner;

public class BBorze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();   // input Borze code
        StringBuilder result = new StringBuilder();
         int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '.') {
                result.append('0');
                i++;
            } else { // s.charAt(i) == '-'
                if (s.charAt(i + 1) == '.') {
                    result.append('1');
                } else {
                    result.append('2');
                }
                i += 2; 
            }
        }
System.out.println(result.toString());
        sc.close();
    }
}
