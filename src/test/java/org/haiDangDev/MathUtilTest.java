package org.haiDangDev;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MathUtilTest {

    @Test
    void testFactorialGivenValidN6ReturnsWell720() {
        //test case #2 n=6!, expected = 720
        int n = 6;
        long expectedValue = 720;
        long actualValue = MathUtil.getFactorial(n);

        //so sánh bằng cơm hay bằng framework
        //bằng cơm, in log file, đã chơi và nay ko chơi, xem bên main()
        //so sánh bằn tool xanh
        assertEquals(expectedValue,actualValue);

    }
    @Test
    void testFactorialGivenValidN5ReturnsWell120() {
        //test case #1 n=5!, expected = 120
        int n = 5;
        long expectedValue = 120;
        long actualValue = MathUtil.getFactorial(n);

        //so sánh bằng cơm hay bằng framework
        //bằng cơm, in log file, đã chơi và nay ko chơi, xem bên main()
        //so sánh bằn tool xanh
        assertEquals(expectedValue,actualValue);

    }

    @Test
    void testFactorialGivenValidN0ReturnsWell1() {
        //test case #3 n=0!, expected = 1
        int n = 0;
        long expectedValue = 1;
        long actualValue = MathUtil.getFactorial(n);

        //so sánh bằng cơm hay bằng framework
        //bằng cơm, in log file, đã chơi và nay ko chơi, xem bên main()
        //so sánh bằn tool xanh
        assertEquals(expectedValue,actualValue);

    }

    @Test
    void testFactorialGivenInValidThowsException() {
        //test case #4 n=1!, expected = throw ngoai le
        // ngoai le la thu ko the assertEquals() a phai dung 1 assert khac
        int  invaliN= -1;
        //assertThrows(ngoai le can bat xem co xh ko, ham Lambda co lenh goi ham - code chinh ma gay ra loi);
        assertThrows(IllegalArgumentException.class, () -> {
            MathUtil.getFactorial(invaliN);
        });

    }
}