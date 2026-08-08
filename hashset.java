import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        HashSet<String> set = new HashSet<>();

        while (t-- > 0) {
            String first = sc.next();
            String second = sc.next();

            set.add(first + " " + second);
            System.out.println(set.size());
        }

        sc.close();
    }
}