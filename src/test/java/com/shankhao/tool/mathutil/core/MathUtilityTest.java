package com.shankhao.tool.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    @Test //@test mang ý nghĩa biến hàm này thành hàm main() thì mới chạy lệnh test khi run app !!
    //Test case #1: Verify getfactorial with n = 0
    void testFactorialGivenRightArgument0RunsWell() {
        int n = 0;
        long expected = 1; //hy vọng n =0; nghĩa là 0! = 1
        long actual = MathUtility.getFactorial(n);
        assertEquals(expected,actual);
        //so sánh giúp mình nếu thực tế có như kỳ vọng
        // nếu expected == actual, tick màu xanh-- ko thì ra màu đỏ
    }
    //Test case #2: Verify getfactorial with n = 1
    @Test
    void testFactorialGivenRightArgument1RunsWell() {
        int n = 1;
        long expected = 1; //hy vọng n =1; nghĩa là 1! = 1
        long actual = MathUtility.getFactorial(n);
        assertEquals(expected,actual);
        //so sánh giúp mình nếu thực tế có như kỳ vọng
        // nếu expected == actual, tick màu xanh-- ko thì ra màu đỏ
    }

    //Test case #3: Verify getfactorial with n = "some number"
    @Test
    void testFactorialGivenRightArgumentnRunsWell() {
        assertEquals(2,MathUtility.getFactorial(2));
        assertEquals(120,MathUtility.getFactorial(5));
        assertEquals(24,MathUtility.getFactorial(4));
    }

    //VERIFY FACTORIAL WITH N<0, E.G N= 5 TO THROW AN EXCEPTION
    //STEPS
    //1. Given an invalid number n= -5
    //2. call/invoke getFactorial(-5)
    // expected results
    //          an IllegalArgumentException will be thrown
    // NẾU ĐƯA -5 THÌ HY VỌNG SẼ THẤY NGOẠI LỆ
    @Test
    public void testFactorialGivenWrongArgumentnMinus5ThrowsException() {
        assertThrows(IllegalArgumentException.class, ()-> MathUtility.getFactorial(-5));
        //so sánh xem có hiện ngoại lệ n=-5
        // đoán xem đoạn code này có gây ra ngoại lệ không

    }


}