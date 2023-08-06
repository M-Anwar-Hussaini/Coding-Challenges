
import java.util.Scanner;

public class x1829B_BlankSpaces {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test-- > 0) {
            int len = input.nextInt();
            int max = 0;
            int cur= 0;
            for(int i = 0; i < len ;i++){
                int num = input.nextInt();
                if(num == 0){
                    cur++;
                } else{
                    max = Math.max(max, cur);
                    cur = 0;
                }
            }
            System.out.println(Math.max(max, cur));
        }
    }

}
