import java.util.Scanner;
public class Magicnumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num>=10){
        int sum = 0;
        while(num>0){
            int digit = num%10;
            sum = digit + sum;
            num = num/10;
        }
        num = sum;
    }


        

        if(num==1){
            System.out.println("the given number is magic number");
        }
        else{
            System.out.println("the given number is not a magic number");
        }
    }
    
}





