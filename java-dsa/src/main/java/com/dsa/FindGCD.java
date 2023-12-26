public class Gcd {
    static  int gcd(int a, int b) {
        if(a>b) {
            min = b;
        } else {
            min = a;
        }
        for(int i = min; i >= 1; i--) {
            if(a%i == 0 && b%i == 0) {
                System.out.println(i);
                return i;
            }
        }
        return 1;
    }

    static euclidGcd(int a, int b) {
        while (a != b) {
            a>b ? a = a - b : b = b - a;
        }
        return a;
    }

    static euclidOptimazed(int a, int b) {
        while(a !== 0 && b !== 0) {
            a>b ? a = a%b : b = b%a;
        }
        return a == 0 ? a : b;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        gcd(a, b)
    }
}