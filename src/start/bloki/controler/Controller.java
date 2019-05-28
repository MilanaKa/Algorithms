package start.bloki.controler;

public class Controller {
    public int power(int x, int y) {
        int result = 1;
        for (int i = 1; i <= y; i++) {
            result *= x;

        }
        return result;
    }
}

//    public int fakctorial(int n) {
//        int(n < 0) {
//            return -1;
//        }
//        int result = 1;
//        for (int i = n; i > 1; i--) {
//            result = result * i;
//        }
//        return result;
//        public int geoSequence ( int a0, int q, int n){
//            int sum = 0;
//            for (int i = 0; i < n; i++) {
//                sum = sum + a0 * power(q, i) {
//                    return sum;
//                }
//            }
//        }
//
//    }
