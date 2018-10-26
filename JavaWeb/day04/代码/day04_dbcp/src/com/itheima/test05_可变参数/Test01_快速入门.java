package com.itheima.test05_可变参数;

public class Test01_快速入门 {
    public static void main(String[] args) {
        /*
            可变参数的底层是一个: 数组.
            如果方法的形参有可变参数, 那么可变参数必须放在: 最后.

         */
        System.out.println(getSum(1,2,3,4,5,6));
    }

    //需求: 定义一个方法, 计算整数和
    public static int getSum( int... a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
