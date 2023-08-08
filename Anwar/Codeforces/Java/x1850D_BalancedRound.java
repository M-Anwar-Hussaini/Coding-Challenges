
import java.io.*;
import java.util.*;

public class x1850D_BalancedRound {

    public static void main(String[] args) {
        Reader input = new Reader();
        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            PriorityQueue<Integer> queue = new PriorityQueue<>();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                queue.offer(input.nextInt());
            }
            Arrays.sort(arr);
            
            int cur = 1;
            int max = 0;
            int curValue = queue.poll();
            while (!queue.isEmpty()) {
                if (queue.peek() - curValue <= k) {
                    cur++;
                } else {
                    max = Math.max(max, cur);
                    cur = 1;
                }
                curValue = queue.poll();
            }
            max = Math.max(max, cur);
            System.out.println(n - max);
        }
    }

    /**
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     */
    static class Reader {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        String nextLine() throws IOException {
            while (st.hasMoreTokens()) {
                st.nextToken();
            }
            return br.readLine();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    /**
     * Most important math methods.
     */
    static class MyMath {

        static int gcd(int a, int b) {
            if (b == 0) {
                return a;
            }
            return gcd(b, a % b);
        }

        static int lcm(int a, int b) {
            return (a * b) / gcd(a, b);
        }

        static long gcd(long a, long b) {
            if (b == 0) {
                return a;
            }
            return gcd(b, a % b);
        }

        static long lcm(long a, long b) {
            return (a * b) / gcd(a, b);
        }

        static double log(double logNumber, double base) {
            return Math.log(logNumber) / Math.log(base);
        }

        static boolean isPrime(int num) {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }

        static boolean isPrime(long num) {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

}
