public class gcd {
    static int _gcd(int divident, int divisor){
        if(divisor == 0) 
        return divident;
        return _gcd(divisor,divident%divisor);
    }
    public static void main(String args[]){
        System.out.println(_gcd(3,16));
    }
}
