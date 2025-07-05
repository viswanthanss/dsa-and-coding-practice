import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        LinkedHashSet<Integer> setting = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            setting.add(num);
        }

        // Convert set to list to use traditional for loop
        List<Integer> list = new ArrayList<>(setting);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
