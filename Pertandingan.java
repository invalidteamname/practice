import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Pertandingan {

    // Time complexity:
    // Space complexity:
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        List<Opponent> opponents = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            opponents.add(new Opponent(scanner.nextInt(), i));
        }

        int[] gain = new int[n];
        for (int i = 0; i < n; ++i) {
            gain[i] = scanner.nextInt();
        }

        opponents.sort(Comparator.comparing(Opponent::getKemahiran));
        for (Opponent opponent : opponents) {
            if (opponent.getKemahiran() > m) break;
            m += gain[opponent.getIndex()];
        }

        System.out.println(m);
    }

    private static class Opponent {
        private final int kemahiran;
        private final int index;

        public Opponent(int kemahiran, int index) {
            this.kemahiran = kemahiran;
            this.index = index;
        }

        public int getKemahiran() {
            return kemahiran;
        }

        public int getIndex() {
            return index;
        }
    }
}
