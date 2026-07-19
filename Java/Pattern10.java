public class Pattern10 {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--) {
            for(int s=1;s<=n-i;s++)
                System.out.print(" ");
            if(i%2!=0) {
                for(char ch=(char)('A'+i-1);ch>='A';ch--)
                    System.out.print(ch+" ");
            } else {
                for(char ch='A';ch<=(char)('A'+i-1);ch++)
                    System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}