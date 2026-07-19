import java.util.Scanner;
public class SteppingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n >= 10) {
            int digit1 = n % 10;
            int digit2 = (n / 10) % 10;
            int diff = digit1 - digit2;
            if (diff != 1 && diff != -1) {
                System.out.println("No");
                return;
            }
            n = n / 10;
        }

        System.out.println("Yes");
    }
}