public class WeightofHillPattern {
    public static void main(String args[]){
        int rows = 4;
        int start = 2;
        int diff = 3;
        int weight = 0;
        int value = start;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                weight += value;
            }
            value += diff;
        }
        System.out.println(weight);
    }
}
    

