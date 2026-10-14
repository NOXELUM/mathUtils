package org.haiDangDev;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //test run#1
            testFactorialGivenValidN5RunWells();
            testFactorialGivenValidN6RunWells();
        }
        //test case #1 check the getFactorial() method with valid n, n = 5
        public static void testFactorialGivenValidN5RunWells(){
            int n = 5;
            long expectedValue = 120;//hy vong 5! trả về 120
            long actualValue = MathUtil.getFactorial((5));
            System.out.print("5! => Expected  = " + expectedValue);

            System.out.println(" Actual = "+ actualValue );
        }

    public static void testFactorialGivenValidN6RunWells(){
        int n = 6;
        long expectedValue = 720;//hy vong 5! trả về 120
        long actualValue = MathUtil.getFactorial(n);
        System.out.print("5! => Expected  = " + expectedValue);
        System.out.println(" Actual = " + actualValue );
    }
    }