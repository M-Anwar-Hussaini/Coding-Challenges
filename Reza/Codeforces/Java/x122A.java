
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _122A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String ns = String.valueOf(n);
        
        Pattern p = Pattern.compile("[^47]");
        Matcher m = p.matcher(ns);
        
        if(m.find()) {
            int i = 2;
            while(true) {
                int nn = n/i;
                ns = String.valueOf(nn);
                if(nn>=4) {
                    if(n%nn==0) {
                        m = p.matcher(ns);
                        if(!m.find()) {
                            System.out.println("YES");
                            break;
                        }
                    }
                    i++;
                }else {
                    System.out.println("NO");
                    break;
                }
                
            }
        } else {
            System.out.println("YES");
        }
    }
    
}
