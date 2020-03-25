package com.luas.javafoundation;

/**
 * 运算符级别
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "运算符级别" );

        boolean a = false;
        boolean b = true;
        boolean c = false;

        System.out.println("a && b || c = " + (a && b || c));
        System.out.println("(a && b) || c = " + ((a && b) || c));

        int x = 2;
        int y = 8;
        int z = 12;

        System.out.println("x *= y += z = " + (x *= y += z));

        x = 2;
        y = 8;
        z = 12;

        System.out.println("x *= y += z = " + (x *= (y += z)));

    }
}
