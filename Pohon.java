import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pohon {

    // Time complexity:
    // Space complexity:
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        Set<Double> angles = new HashSet<>();

        for (int i = 0; i < n; ++i) {
            int pi = scanner.nextInt();
            int qi = scanner.nextInt();
            angles.add(Math.atan2(pi - x, y - qi));
        }

        System.out.println(angles.size());
    }
}
