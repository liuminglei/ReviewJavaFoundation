package com.luas.javafoundation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "自增、自减预算符" );

        demo1();

        demo2();
    }

    private static void demo1() {
        int x = 20;

        x++;

        System.out.println(x);
    }

    private static void demo2() {
        int x = 5;
        int y = 5;

        int m = 2 * x++;
        int n = 2 * ++y;

        System.out.println("m is " + m + ", n = " + n + ", x = " + x + ", y = " + y);
    }
}
