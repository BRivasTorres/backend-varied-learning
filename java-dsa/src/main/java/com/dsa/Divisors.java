public class Divisors {

    static void printDivisors(int n) {
        for(int i = 0 ; i < n; i++) {
            if(i%n == 0) {
                System.out.println(i);
            }
        }
    }

    static void printDivisors(int n) {
        int i = 0;
        for(i = 1; i < n; i++) {
            if(n%i == 0) {
                System.out.println(i);
            }
        }

        for(; i >= 1; i--) {
            if(n%1 == 0) {
                System.out.println(n/i);
            }
        }
    }

    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
    }
}