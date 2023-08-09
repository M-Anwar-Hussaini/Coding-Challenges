
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class x1629A_DownloadMoreRAM {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            int total = 0;
            int[] capacity = new int[n];
            for (int i = 0; i < n; i++) {
                capacity[i] = input.nextInt();
            }

            RAM[] rams = new RAM[n];

            for (int i = 0; i < n; i++) {
                rams[i] = (new RAM(input.nextInt(), capacity[i]));
            }

            Arrays.sort(rams);
            for (int i = 0; i < n; i++) {
                if (rams[i].capacity <= k) {
                    k += rams[i].bonus;
                }
            }
            System.out.println(k);
        }
    }

    private static class RAM implements Comparable<RAM> {

        int bonus;
        int capacity;

        public RAM(int bonus, int needed) {
            this.bonus = bonus;
            this.capacity = needed;
        }

        @Override
        public int compareTo(RAM o) {
            return this.capacity - o.capacity;
        }

    }

}
