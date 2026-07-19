public class Remove{
    static boolean palindrome(int n) {
        int temp = n;
        int rev = 0;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp = temp / 10;
        }
        return rev == n;
    }
    public static void main(String[] args) {
        int n = 12321;
        if (palindrome(n)) {
            System.out.println(n + " is a Palindrome");
        } 
        else {
            System.out.println(n + " is Not a Palindrome");
        }
    }
}