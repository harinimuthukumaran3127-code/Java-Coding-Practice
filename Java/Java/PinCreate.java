public class PinCreate{
    public static void main(String[] args) {
        int alpha = 3521;
        int beta = 2452;
        int gamma = 1352;
        int max = 0;
        int pin = 0;
        int place = 1;
        int a = alpha;
        while (a > 0) {
            int d = a % 10;
            if (d > max)
                max = d;
            a =a/10;
        }
        int b = beta;
        while (b > 0) {
            int d = b % 10;
            if (d > max)
                max = d;
            b = b/10;
        }
        int c = gamma;
        while (c > 0) {
            int d = c % 10;
            if (d > max)
                max = d;
            c = c/10;
        }
        while (alpha > 0 && beta > 0 && gamma > 0) {
            int d1 = alpha % 10;
            int d2 = beta % 10;
            int d3 = gamma % 10;
            int min = d1;
            if (d2 < min)
                min = d2;
            if (d3 < min)
                min = d3;
            pin = pin + (min * place);
            place = place * 10;
            alpha /= 10;
            beta /= 10;
            gamma /= 10;
        }
        System.out.println("PIN = " + max + pin);
    }
}