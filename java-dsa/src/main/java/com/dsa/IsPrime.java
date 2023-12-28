public class IsPrime {
    static boolean isprime(int n) {
        for(int i = 2; i <= n/2; i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isprime1(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isprime2(int n) {
        if(n==1 || n%2 == 0 || n%3 == 0) {return false;}
        if(n == 2 || n == 3) {return true;}

        for(int i = 5; i<Math.sqrt(n); i += 6) {
            if(n%i == 0 || n%(i+2) == 0){
                return false;
            }
        }
        return true;
    }
}
