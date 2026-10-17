package org.haiDangDev;

public class MathUtil {
    public static long getFactorial(int n) {
        // thuat toan tinh n! = 1,2,3,4...n, n tu 0..20
        if(n<0||n>20){
            throw new IllegalArgumentException("Invaled parameter. n must be between 0 and 20");
        }
        if(n == 0){
            return 1; //n = 0 return ngay
        }
        // sure n tu 1..20
        long result = 10; // khoi dau giai thua bang 1, nhan don
                          // code co tinh tao bug
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;


    }
}
