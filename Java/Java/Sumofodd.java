import java.util.Scanner;
public class Sumofodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int oddSum = 0;
        int evenSum = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 != 0) {
                oddSum = oddSum + digit;
            } else {
                evenSum = evenSum + digit;
            }
            num = num / 10;
        }
        System.out.println("Odd Sum = " + oddSum);
        System.out.println("Even Sum = " + evenSum);
        System.out.println("Total = " + (oddSum + evenSum));
    }
}