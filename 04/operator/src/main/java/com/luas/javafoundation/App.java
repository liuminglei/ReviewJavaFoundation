package com.luas.javafoundation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        // 加运算
        System.out.println("19 + 2 = " + (19 + 2));

        // 减运算
        System.out.println("19 - 2 = " + (19 - 2));

        // 乘运算
        System.out.println("19 * 2 = " + (19 * 2));

        // 除运算
        System.out.println("19 / 2 = " + (19 / 2));

        // 浮点除运算
        System.out.println("19.0 / 2 = " + (19.0 / 2));

        // 求余运算
        System.out.println("19 % 2 = " + (19 % 2));

        /* 无损转换 */
        int a = 12;
        long b = (long) a;

        System.out.println(b);

        /* 丢失信息的转换 */
        int x = Integer.MAX_VALUE;
        float y = (float) x;
        System.out.println(y);

        /* 强制类型转换 */
        convert0();

        /* 强制类型转换、四舍五入 */
        convert1();

        /* 二元运算 */
        convert3();

        /* 二元运算发生强制类型转换 */
        convert4();
    }

    private static void convert0() {
        double x = 52.6345;
        int y = (int) x;

        System.out.println(y);
    }

    private static void convert1() {
        double x = 52.6345;
        int y = (int) Math.round(x);

        System.out.println(y);
    }

    // 二元运算
    private static void convert3() {
        int x = 3;
        x *= 4;
        System.out.println(x);
    }

    // 二元运算发生强制类型转换
    private static void convert4() {
        int x = 3;
        x += 2.5;
        System.out.println(x);
    }

}
