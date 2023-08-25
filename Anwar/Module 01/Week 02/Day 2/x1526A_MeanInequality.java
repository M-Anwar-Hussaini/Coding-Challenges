import java.util.*;

public class x1526A_MeanInequality {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt() * 2;
            LinkedList<Integer> list = new LinkedList<>();
            for(int i = 0; i < n; i++){
                list.offer(input.nextInt());
            }
            Collections.sort(list);
            int counter = 0;
            while(!list.isEmpty()) {
                if( counter++ % 2 == 0){
                    System.out.printf("%d ", list.pollLast());
                } else {
                    System.out.printf("%d ", list.pollFirst());
                }
            }
            System.out.println("");
        }
    }

}
