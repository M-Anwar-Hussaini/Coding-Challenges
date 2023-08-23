import java.util.*;

public class x746B_Decoding {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String str = input.next();
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for(int i = 1; i < n; i++){
            if(i % 2 == n % 2){
                sb.insert(0, str.charAt(i));
            } else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }

}
