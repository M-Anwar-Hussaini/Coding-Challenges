import java.util.Scanner;

public class X705A_Hulk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String feeling = "";
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                feeling += "I hate ";
            } else {
                feeling += "I love ";
            }
            
            if (i != n) {
                feeling += "that ";
            } else {
                feeling += "it";
            }
        }
        System.out.println(feeling);
    }
}
