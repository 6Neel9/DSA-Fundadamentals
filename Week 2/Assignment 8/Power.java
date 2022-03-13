public class Power {
    static int power(int base, int power_raised){
        if(power_raised != 0) return(base*power(base,power_raised - 1));
        else return 1;
    }
    public static void main(String args[]){
        int base = 3, power_raised = 4;
       int result = power(base, power_raised);
        System.out.println("The power of the number is "+result);
    }
}
