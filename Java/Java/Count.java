public class Count {
    public static void main(String[] args){
        int a=53467;
        String odd = "";
        String even = "";
        int oddcount = 0;
        int evencount = 0;
        while(a>0){
            int digit = a % 10;
            if(digit%2==0){
                even = even + digit;
                evencount++;
            }
            else{
                odd = odd + digit;
                oddcount++;
            }
            a = a/10;

        }
        System.out.println("Even" + evencount);
        System.out.println("odd" + oddcount );
    }
    
}
