public class Reversenumber {
     public static void main(String[] args){
        int a = 143;
        int rev = 0;
        while(a>0){
            int digit = a % 10;
            rev = rev * 10 + digit;
              a = a/10;
           
        }
       
        System.out.println(rev);
        }
        }
     
    

