public class PrimeFactors {
    static primeFactors(int n) {
        int i = 2;
        while(i*i <= n) {
            while (n%i == 0) {
                System.out.println(i);
                n = n/i;
            }
            i++;
        }

        if(n > 1) {
            System.out.prinln(n);
        }
    }

    public static void main(String[] args) {

    }
}