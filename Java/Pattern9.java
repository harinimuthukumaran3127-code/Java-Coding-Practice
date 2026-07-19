public class Pattern9 {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--) {
            for(int s=1;s<=n-i;s++)
                System.out.print(" ");
            for(char ch=(char)('A'+i-1);ch>='A';ch--)
                System.out.print(ch+" ");
            System.out.println();
        }
    }
}
