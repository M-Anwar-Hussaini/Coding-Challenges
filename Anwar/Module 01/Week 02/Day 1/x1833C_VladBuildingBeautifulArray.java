import java.util.*;

public class x1833C_VladBuildingBeautifulArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int min = Integer.MAX_VALUE;
            int odds = 0, evens = 0;
            for(int i = 0; i < n; i++){
                int num = input.nextInt();
                min = Math.min(min, num);
                if(num % 2 == 0){
                    evens++;
                } else {
                    odds++;
                }
            }
            if(min % 2 == 1){
                System.out.println("YES");
            } else if(min % 2 == 0 && evens == n){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}
