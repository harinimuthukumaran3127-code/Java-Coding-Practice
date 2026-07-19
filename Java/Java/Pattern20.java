public class Pattern20 {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,25,35,45};
        int d=2;
        for(int i=0;i<arr.length;i=i+d+1) {
            int start=i;
            int end=Math.min(i+d,arr.length-1);
            while(start<end) {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}