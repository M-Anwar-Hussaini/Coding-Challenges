import java.util.*;

public class x1857A_ArrayColoring {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int arr[] = new int[n];
            int total = 0;
            for(int i = 0; i < n;i++){
                arr[i] = input.nextInt();
                total += arr[i];
            }
            
            boolean flag = false;
            for(int num: arr){
                if(num % 2 == (total - num) % 2){
                    flag = true;
                    break;
                }
            }
            
            System.out.println(flag ? "YES":"NO");
        }
    }

}
