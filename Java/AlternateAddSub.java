public class AlternateAddSub {
    public static void main(String[] args) {
        int n = 12345;
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n = n / 10;
        }
        int result = 0;
        int pos = 1;
        while (rev > 0) {
            int digit = rev % 10;
            if (pos % 2 != 0) {
                result = result + digit;  
            } else {
                result = result - digit;   
            }
            rev = rev / 10;
            pos++;
        }
        System.out.println(result);
    }
}