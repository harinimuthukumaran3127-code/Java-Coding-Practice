public class Nonprime {
    public static void main(String[] args) {
        int n = 123456;
        int rev = 0;
        while(n > 0){
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        int index = 0;
        int sum = 0;
        while(rev > 0){
            int digit = rev % 10;
            if(index == 0 || index == 1 || !isPrime(index)){
                sum += digit;
            }
            index++;
            rev /= 10;
        }
        System.out.println(sum);
    }
    static boolean isPrime(int n){
        if(n < 2)
            return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}