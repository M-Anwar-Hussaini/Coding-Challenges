

import java.util.*;

public class x1850_BTenWordsofWisdom {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int maxQuality = 0;
            int num = 0;
            for(int i = 1; i <= n; i++){
                int words = input.nextInt();
                int quality = input.nextInt();
                if(words > 10 ){
                    continue;
                }
                if(quality > maxQuality) {
                    maxQuality = quality;
                    num = i;
                }
            }
            System.out.println(num);
        }
    }

}
