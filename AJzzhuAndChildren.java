
import java.util.*;

public class AJzzhuAndChildren {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        ArrayList<Integer> indexlist = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            indexlist.add(i);
        }

        int lastchild = -1;

        while (!list.isEmpty()) {
            int candies = list.remove(0);
            int idx = indexlist.remove(0);

            if (candies <= m) {
                lastchild = idx;
            } else {
                list.add(candies - m);
                indexlist.add(idx);
            }
        }

        System.out.println(lastchild);
        sc.close();
    }
}
