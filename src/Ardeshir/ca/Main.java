package Ardeshir.ca;

import java.math.BigDecimal;

public class Main {

    //global static variables are automaticly initialized with value
    // 0
    static int intValue;


    public static void main(String[] args) {

        //different variables
        //byte short int long
        System.out.println("Hello Java");
        byte byteNumber = Byte.MAX_VALUE;
        short shortNumber = Short.MAX_VALUE;
        int intNumberMAX = Integer.MAX_VALUE;
        int intNumberMIN = Integer.MIN_VALUE;

        System.out.println("byte number value is " + byteNumber);
        System.out.println("short number value is " + shortNumber);
        System.out.println("int number value is " + intNumberMAX);
        System.out.println("int number value is " + intNumberMIN);

        byte aByteValue = 60;
        byte anotherByteValue = (byte)(aByteValue/2);

                System.out.println(anotherByteValue);

        int a = 200;
        byte b = (byte)a;
        System.out.println(b);//?

        byte x = 127;
        int y = x;
        System.out.println(y);

        // for long types use L at the end of value
        long longValue =9_223_372_036_854_775_807l;//max long number
        System.out.println(longValue);

        double coffeePrice = 2.75d;// d is optional but better to use it
        float teaPrice = 2.99f; // f is a must
        int coffee = (int)coffeePrice;
        System.out.println("the int coffee price : " + coffee); // 2
        System.out.println("the rounded tea price : " + Math.round(teaPrice)); // 3
        System.out.println("the rounded tea price : " + Math.floor(teaPrice)); // 2.0


        System.out.println("(double)25 / 2 =" +  (double)25 / 2);
        System.out.println("25d / 2 = " + 25d / 2);
        System.out.println("25f / 2 = " + 25f / 2);

        int test = (int)Math.pow(2,32)+1;
        System.out.println(test);

        double dVal = .012;
        double sum = dVal + dVal + dVal;
        System.out.println("wrong calculation .12 + .12 + .12 =" + sum);

        BigDecimal bigValue = new BigDecimal(Double.toString(dVal));
        BigDecimal total = bigValue.add(bigValue).add(bigValue);
        System.out.println("exact result of .12 + .12 + .12 =" + total);
    }
}
