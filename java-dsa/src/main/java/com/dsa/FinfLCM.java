public clas FindfLCM {
    static int findLCM(int a, int b) {
        int res = Math.max(a, b);
        while(true) {
            if(res % a == 0 && res % b == 0) {
                break;
            }
        }
        return res;
    }
}