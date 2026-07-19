import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 8;
        int b = 0;
        int c = 1;
            if(a == 1){
                System.out.println(b);}
            else if(a == 2){
                 System.out.println(c);

            }    
            else{
                for(int i =3;i<=a;i++){
                    int d = b + c;
                    b = c;
                    c = d;

                }
                System.out.println(c);
            }
    
}
}
