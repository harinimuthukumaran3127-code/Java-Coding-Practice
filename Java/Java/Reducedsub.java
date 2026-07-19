import java.util.Scanner;

public class Reducedsub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        while (num.length() > 2) {
            String ans = "";
            for (int i = 0; i < num.length() - 1; i++) {
                int d1 = num.charAt(i) - '0';
                int d2 = num.charAt(i + 1) - '0';
                ans = ans + Math.abs(d1 - d2);
            }
             num = ans;
        }

        System.out.println(num);
    }
}

