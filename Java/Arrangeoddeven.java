import java.util.Scanner;
public class ArrangeOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        String odd = "";
        String even = "";
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            if (digit % 2 != 0) {
                odd = odd + digit;
            } else {
                even = even + digit;
            }
        }

        System.out.println(odd + even);
    }
}
