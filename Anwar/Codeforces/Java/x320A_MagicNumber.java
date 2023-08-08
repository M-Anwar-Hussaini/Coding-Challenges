
import java.util.*;

public class x320A_MagicNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String st = input.next();
        st = st.replaceAll("144", "s");
        st = st.replaceAll("14", "s");
        st = st.replaceAll("1", "s");
        int counter = 0;
        for(char c: st.toCharArray()) {
            if(c == 's') {
                counter++;
            }
        }
        System.out.println(counter == st.length() ? "YES" : "NO");
    }

}
