import java.util.*;

public class coba2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> res = new ArrayList<Integer>();
        
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt();
            for (int j = 0; j < m; j++) {
                list.add(scanner.nextInt());
            }
            res.add(list.size());
            list.removeAll(list);
        }

        

        System.out.println(res);
        scanner.close();
    }
}
