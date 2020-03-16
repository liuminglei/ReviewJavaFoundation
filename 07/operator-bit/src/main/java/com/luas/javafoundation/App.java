package com.luas.javafoundation;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "位运算符" );

        // 与
        System.out.println("（100）0110 0100 & （12）0000 1100 = （4）0000 0100 = " + (100 & 12));

        // 清零
        System.out.println("（12）0000 1100 & （0） 0000 0000 = （0）0000 0000 = " + (12 & 0));

        // 或
        System.out.println("（100）0110 0100  | （12）0000 1100 = （108）0110 1100 = " + (100 | 12));

        // 特殊用法，所有位全部为1
        System.out.println("（100）0110 0100  | （155）1001 1011 = （255）1111 1111 = " + (100 | 155));

        // 异或
        System.out.println("（100）0110 0100  ^ （12）0000 1100 = （104）0110 1000 = " + (100 ^ 12));

        // 取反
        System.out.println("~ 1 = " + (~ 1));
        System.out.println("~ 0 = " + (~ 0));
        System.out.println("~（100）0110 0100 = " + (~ 100));

        // 左位移，1左移3位=8
        System.out.println("1 << 3 = 8 = " + (1 << 3));

        // 左位移，10左移1位=20
        System.out.println("10 << 1 = 20 = " + (10 << 1));

        // 右位移，8右移3位=1
        System.out.println("8 >> 3 = 1" + (8 >> 3));
        System.out.println("-20 >> 2 = -20 / 2 / 2 = -5 = " + (-20 >> 2));
        System.out.println("-19 >> 2 = -10 / 2 = " + (-19 >> 2));

        // 无符号右移
        System.out.println("(-14) 11111111 11111111 11111111 11110010 >>> 2 = （1073741820）00111111 11111111 11111111 11111100 = " + (-14 >>> 2));

        // 取第三位
        getThirdBitValue();
    }

    private static void getThirdBitValue() {
        //取第三位
        int x = 14;

        int thridBitFormRight = (x & 0b100) / 0b100;

        System.out.println(thridBitFormRight);

        // 逻辑与、左移、右移实现取第三位
        thridBitFormRight = (x & 1 << 2) >> 2;

        System.out.println(thridBitFormRight);

        System.out.println(11 << 2);
    }
}
