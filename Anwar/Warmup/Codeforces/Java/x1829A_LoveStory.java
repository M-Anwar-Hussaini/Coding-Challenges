
import java.util.*;


public class x1829A_LoveStory {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        
        String codeforces = "codeforces";
        while(test-- > 0){
            String str = input.next();
            int counter = 0;
            for(int i = 0; i < 10 ;i++){
                if(codeforces.charAt(i) != str.charAt(i)) {
                    counter++;
                }
            }
            System.out.println(counter);
        }
        
    }

}
