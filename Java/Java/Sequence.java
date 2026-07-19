public class Sequence {
    public static void main(String[] args) {
        int n = 361589;
        int temp = n;
        String odd = "";
        String even = "";
        int oddCount = 0;
        int evenCount = 0;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit % 2 == 0) {
                even = digit + even;
                evenCount++;
            } 
            else {
                odd = digit + odd;
                oddCount++;
            }
            temp = temp / 10;
        }
        System.out.println(odd + even + oddCount + evenCount);
    }
}