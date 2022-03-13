public class Problem50 {
    static double myPow(double x, int n) {
        double output = 1d;
             long power = n;
             if(power < 0)
                 power = -1 * power;
             
             while(power > 0){
                 if(power % 2 == 1){
                     output = output * x;
                     power = power - 1;
                 } else {
                     x = x * x;
                     power = power / 2;
                 }
             }
             if(n<0){
                 output = (double)(1.0) / (double)(output);
             }
             return output;
     }
     public static void main(String args[]){
        double x = 2.00000;
         int n = 10;
        System.out.println(myPow(x,n));
     }
}
