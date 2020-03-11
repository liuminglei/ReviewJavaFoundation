package com.luas.javafoundation;

import java.math.BigDecimal;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println("int 类型占4个字节， 取值范围为：" + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);

        System.out.println("short 类型占2个字节， 取值范围为：" + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);

        System.out.println("long 类型占2个字节， 取值范围为：" + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);

        System.out.println("byte 类型占2个字节， 取值范围为：" + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);

        long p = 4000000000L;

        System.out.println("长整形以L/l结尾：" + p);

        long p1 = 4_000_000_000L;

        System.out.println("Java7开始，数字字面量可以添加_以加强可读性：" + p1);

        int i = 0b1001;

        System.out.println("二进制数字以0b/0B开头：" + i);

        int i1 = 1001;

        System.out.println("不添加0b的话，默认为十进制：" + i1);

        System.out.println("float 类型占2个字节， 取值范围为：± " + Float.MAX_VALUE);

        System.out.println("double 类型占2个字节， 取值范围为：± " + Double.MAX_VALUE);

        System.out.println("char 类型占2个字节， 取值范围为：" + (int) Character.MIN_VALUE + " ~ " + (int) Character.MAX_VALUE);

    }
}
