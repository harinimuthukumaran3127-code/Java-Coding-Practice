import java.util.Scanner;
public class Ascending {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() ;
      
        for(int i=1;i<=9;i++){
          int sum = a;  
            while(sum>0){
            int digit = sum%10;
            if(digit == i){
                System.out.println("yes"+digit);

            }
            else{
                System.out.println("No");
            }

            sum = sum/10;
        }
    }
    
}
}
