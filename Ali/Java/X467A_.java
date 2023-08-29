
import java.util.Scanner;

public class X467A_ {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rooms = input.nextInt();
        int emptyRooms = 0;
        while (rooms-- > 0) {
            int p = input.nextInt();
            int q = input.nextInt();
            if (q - p >= 2) {
                emptyRooms++;
            }
        }
        System.out.println(emptyRooms);
    }
}
