
import java.util.*;


public class x1840A_CipherShifer {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while(test-- > 0){
            int len = input.nextInt();
            String str = input.next();
            char first = str.charAt(0);
            StringBuilder sb = new StringBuilder();
            sb.append(first);
            for(int i = 1; i < len ;i++){
                if(str.charAt(i) == first && i + 1 < len) {
                    first = str.charAt(i + 1);
                    sb.append(first);
                    i++;
                }
            }
            System.out.println(sb);
        }
    }

}
