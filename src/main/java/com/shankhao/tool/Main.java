package com.shankhao.tool;
import com.shankhao.tool.mathutil.core.MathUtility;
public class Main {

        // test thử hàm vừa gõ
        // cần có test case
        // test case #1: check/verify the getFactorial() method with n = 0
        // steps: given n = 0;
        //	call getFactorial(n=0)
        // Expected result: hope to see 1 as the result ò 0!
        // status: đoán xem, chờ chạy xem
        public static void testFactorialGivenRightArgument0RunsWell(){
                int n=0;
                long actual= MathUtility.getFactorial(n);
                //thực tế là mấy đoán xem
                long expected= 1;
        }
        public static void testFactorialGivenRightArgument1RunsWell(){
                int n=1;
                long actual= MathUtility.getFactorial(n);
                //thực tế là mấy đoán xem
                long expected= 1;
        }

        public static void testFactorialGivenRightArgumentnRunsWell(){
                System.out.println("0!"+" expected:"+ " 1"+ " actual:"+ MathUtility.getFactorial(0));
                System.out.println("1!"+" expected:"+ " 1"+ " actual:"+ MathUtility.getFactorial(1));
                System.out.println("2!"+" expected:"+ " 2"+ " actual:"+ MathUtility.getFactorial(2));
                System.out.println("3!"+" expected:"+ " 6"+ " actual:"+ MathUtility.getFactorial(3));
                System.out.println("4!"+" expected:"+ " 24"+ " actual:"+ MathUtility.getFactorial(4));
        }

        public static void main(String[] args) {
                testFactorialGivenRightArgumentnRunsWell();
        }
}