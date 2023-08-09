import java.util.*;

public class x1360B_HonestCoach {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test-- > 0) {
            int len = input.nextInt();
            PriorityQueue<Integer> queue = new PriorityQueue<>();
            for(int i = 0; i < len; i++){
                queue.offer(input.nextInt());
            }
            int min = Integer.MAX_VALUE;
            int previous = queue.poll();
            while(!queue.isEmpty()) {
                int current = queue.poll();
                min = Math.min(min, current - previous);
                previous = current;
            }
            System.out.println(min);
        }
    }

}
