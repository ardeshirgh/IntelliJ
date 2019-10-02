package Ardeshir.ca;

import Ardeshir.ca.Varibale;

public class condition {
    public static void condition () {
        Varibale.varibale();
        int year = 2019;
        //year = year + 1;
        // pre increment
        System.out.println(++year);// ? 2020
        //post increment
        System.out.println(year++);// ? 2020
        //here the year value is 2021
        System.out.println(year); // ? 2021

        year %= 2;
        System.out.println(year); // ? 1


        //conditions
        //if blocks
        int age = 28;

        if (age >= 120) {
            System.out.println("sorry you are dead :(");
        } else if (age >= 18) {
            System.out.println("you are adult");
        } else {
            System.out.println("you are NOT adult");
        }
        boolean isLightsOn = true;
        if (isLightsOn) {
            System.out.println("can you turn off the light ?");
        } else {
            System.out.println("can you turn on the light ?");
        }


        //ternary operator
        int studentMark = 70;
        double gpa;

        gpa = studentMark > 80 ? 4.0 : 3.0;

        System.out.println("student gpa is " + gpa);

        //1 - green 2 - red
        int light = 1;
        boolean go;
        go = light == 1 ? true : false;
        System.out.println("should i pass if the light is green? : " + go);
        System.out.println("should i pass if the light is red? : " + !go);

        //&&
        // || Ok

        age = 18;
        boolean parentPermission = false;

        if ( age >= 18 || parentPermission ){
            System.out.println("you are allowed to do stuff ");
        } else {
            System.out.println("you need to grow up or you need permission");
        }

        if (age < 18 && parentPermission){
            System.out.println("you need to grow up or you need permission");
        } else {
            System.out.println("you are allowed to do stuff");
        }

        int dayOfWeek = 3; // 0 .... 6
        // 0 - sunday
        // 1 - monday
        // ... so on
        switch (dayOfWeek) {
            case 0:
                System.out.println("its sunday");
            case 1:
                System.out.println("its monday");
            case 2:
                System.out.println("its tuesday");
            case 3:
                System.out.println("its wednesday");
            case 4:
                System.out.println("its thursday");
            case 5:
                System.out.println("its friday");
            case 6:
                System.out.println("its saturday");
        }

    }

}


