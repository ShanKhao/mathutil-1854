package com.shankhao.tool.mathutil.core;

public class MathUtility {


    //Class này chứa các hàm static, là những hàm tiện ích dùng chung mọi nơi
    //Đây là hàm mô phỏng thư viện toán học math. của jdk
    //hàm này tính N!
    //n! = 1x2x3..N
    //không có giai thừa âm
    // 0!=1
    //20! là vừa kiểm đủ long, tức là 21! vượt quá kiểu long

    public static long getFactorial(int n){
        //đem code chính ra sửa goi là refactor/refactoring
        if(n<0 || n>20){
            throw new IllegalArgumentException("n must be between 0 and 20");
        }
        //bạn đưa invalid data, mình ném ra ngoại lệ, hàm ko được chạy thành công, ko value trả về
        if(n==0){
            return 1;
        }
        // sống sót đến đây thì
        long result =1;
        for (int i = 1; i <=n ; i++) {
            result *=i ;
        }
        return result;
    }
}
