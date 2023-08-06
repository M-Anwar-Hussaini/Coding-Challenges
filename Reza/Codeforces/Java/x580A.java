
import java.util.Scanner;

public class x580A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int prev = 0;
        int max = 0;
        int counter = 0;
        for(int i=0; i<n; i++) {
            int a = in.nextInt();
            if(a>=prev) {
                counter++;
                prev = a;
            } 
            if (a<prev || i==n-1) {
                if(max < counter) {
                    max = counter;
                }
                prev = a;
                counter = 1;
            }
        }
        System.out.println(max);
    }
    
}
