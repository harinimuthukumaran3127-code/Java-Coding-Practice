public class Pattern23 {
    public static void main(String[] args) {
        int[] arr={40,20,10,50,20,10,30,40};
        int[] freq=new int[arr.length];
        for(int i=0;i<arr.length;i++) {
            freq[i]=1;
            if(arr[i]==-1)
                continue;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]==arr[j]) {
                    freq[i]++;
                    arr[j]=-1;
                }
            }
        }
        for(int i=1;i<freq.length;i++) {
            for(int j=0;j<freq.length-i;j++) {
                if(freq[j]<freq[j+1]) {
                    int temp=freq[j];
                    freq[j]=freq[j+1];
                    freq[j+1]=temp;
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        for(int i=0;i<arr.length;i++) {
            if(arr[i]!=-1)
                System.out.println(arr[i]+" -> "+freq[i]);
        }
    }
}
