
public class Main {

    public static void main(String[] args) {
        String input = "Ali";
        int n = input.length();
        int totalSubsets = 1 << n;

        for (int mask = 0; mask < totalSubsets; mask++) {
            System.out.println("Subset: "+(mask+1));
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    System.out.print(input.charAt(i));
                }
            }System.out.println("");
        }
    }
}
