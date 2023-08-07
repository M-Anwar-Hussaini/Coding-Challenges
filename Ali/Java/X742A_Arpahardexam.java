 
import java.util.Scanner;
 
public class X742A_Arpahardexam {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int exponent = input.nextInt();
        int lastDigit = 8;
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= lastDigit;
            result %= 10;
        }
        System.out.println(result);
    }

    
    
    
    
    
     // Check if a number is prime
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Calculate the least common multiple (LCM)
    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // Calculate the greatest common divisor (GCD)
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
//        long lastNumber = number % 10;
//        long lastTwoDigits = (number / 10) % 10;
//        result = number *10 +lastNumber;
//        result = number / 10;

}