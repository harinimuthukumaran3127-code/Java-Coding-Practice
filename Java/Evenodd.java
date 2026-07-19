import java.util.Scanner;
public class Evenodd {
         public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        System.out.println("1. Even Digit Sum");
        System.out.println("2. Odd Digit Sum");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();
        int sum=0;
        while(num>0){
            int digit = num % 10;
            if (choice == 1) {
                if (digit % 2 == 0) {
                    sum = sum + digit;
            }
            }
            else if (choice == 2) {
                if (digit % 2 != 0) {
                    sum = sum + digit;
                }
            }

            num = num / 10;
        }

        System.out.println("Sum = " + sum);
    }
}