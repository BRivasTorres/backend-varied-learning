public class IsPrimeEratosthenes {

    static void printPrimes(int n) {
        boolean[] primer = new boolean[n+1];
        for(int i = 2; i*i<= n; i++) {
            if(prime[i] == false) {
                for(int j = i*i; j <= n; j += i){
                    prime[j] = true;
                }
            }
        }
        for(int i = 2; i <= n;i++) {
            if(primer[i] == false) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
    }
}