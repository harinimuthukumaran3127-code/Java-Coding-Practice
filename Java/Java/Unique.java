import java.util.Scanner;
public class Unique {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] freq = new int[10];
        
        while(num>0){
            int digit = num%10;
            freq[digit]++;
            num = num/10;
        }
        int count = 0;
        for(int i=0;i<10;i++){
            if(freq[i] > 0){
                count++;
            }
        }
        System.out.println(count);
    }


    
}
