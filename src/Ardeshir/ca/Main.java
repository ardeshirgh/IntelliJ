package Ardeshir.ca;

public class Main {

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
    }
}
