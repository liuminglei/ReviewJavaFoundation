package com.luas.javafoundation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "关系、布尔运算符" );

        // 等于
        System.out.println(2 == 3);

        //不等于
        System.out.println(2 != 3);

        // 小于
        System.out.println(2 < 3);

        // 大于
        System.out.println(2 > 3);

        // 小于等于
        System.out.println(2 <= 3);

        //大于等于
        System.out.println(2 >= 3);

        // &&
        System.out.println(2 == 3 && 3 == 3);

        // ||
        System.out.println(2 == 3 || 3 == 3);

        // !
        System.out.println(!(2 == 3));

        // 三元运算符
        System.out.println(2 < 3 ? 2 : 3);
    }
}
