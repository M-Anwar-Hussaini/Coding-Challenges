
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ali Baba
 */
public class X233A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n % 2 == 1) {
            System.out.println(-1);
        } else {
            for (int i = 0; i < n; i += 2) {
                System.out.print((i + 2) + " ");
                System.out.print((i + 1) + " ");
            }
            System.out.println("");
        }
    }
}
