public class Divisors {

    static void printDivisors(int n) {
        for(int i = 0 ; i < n; i++) {
            if(i%n == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
    }
}