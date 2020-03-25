package com.luas.javafoundation;

import java.util.Arrays;

/**
 * 字符串
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "字符串" );

        // 子串
        String message = "Hello World!";
        String message_hello = message.substring(0, 5);

        System.out.println("message.substring(0, 5) = " + message_hello);

        // 判断相等
        String a = "A";
        String b = "A";
        String c = new String("A");

        System.out.println("a == b " + a == b);
        System.out.println("a.equals(b) " + a.equals(b));
        System.out.println("a == c " + a == c);
        System.out.println("a.equals(c) " + a.equals(c));

        // 字符串拼接
        connect();

        // 空串
        String emptyStr = "";
        System.out.println("空串长度 " + emptyStr.length());

        // null
        String nullStr = null;

        // 代码单元
        unit();

        // 码点
        codePointsCount();

        // 码点流
        codePointsStream();

        // 码点流构造方法
        codePointsConstruct();
    }

    private static void connect() {
        String a = "Hello ";
        String b = "World";
        String c = a + b + "!";

        System.out.println("a + b + c = " + c);
    }

    private static void unit() {
        String message = "Hello World!";
        int x = message.length();
        System.out.println("Hello World! `s length is " + x);
    }

    private static void codePointsCount() {
        String message = "Hello World!";

        System.out.println("Hello World! `s codePointsCount is " + message.codePointCount(0, message.length()));
    }

    private static void codePointsStream() {
        String message = "Hello World!";
        int[] codePoints = message.codePoints().toArray();
        Arrays.stream(codePoints).forEach(System.out::println);
    }

    private static void codePointsConstruct() {
        String message = "Hello World!";
        int[] codePoints = message.codePoints().toArray();

        String message_new = new String(codePoints, 0, codePoints.length);

        System.out.println("message_new is " + message_new);
    }

}
