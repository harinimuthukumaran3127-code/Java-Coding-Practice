public class Pattern19 {
    public static void main(String[] args) {
        int[] arr={50,20,150,20,50,10,30,10,10};
        for(int i=0;i<arr.length;i++) {
            boolean visited=false;
            for(int j=0;j<i;j++) {
                if(arr[i]==arr[j]) {
                    visited=true;
                    break;
                }
            }
            if(!visited) {
                int count=1;
                for(int j=i+1;j<arr.length;j++) {
                    if(arr[i]==arr[j])
                        count++;
                }
                System.out.println(arr[i]+" -> "+count);
            }
        }
    }
}