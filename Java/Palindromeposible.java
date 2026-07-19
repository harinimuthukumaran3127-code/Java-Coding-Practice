import java.util.Scanner;
public class Palindromeposible {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] freq = new int[10];
        for(int i=1;i<=num;i++){
            int digit = num%10;
            freq[digit]++;
            num = num/10;
        } 
        int oddCount = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] % 2 != 0) {
            oddCount++;
            }
        }
        if (oddCount <= 1) {
            System.out.println("Palindrome Possible");
        } else {
            System.out.println("Palindrome Not Possible");
        }
       
    

    }
}


