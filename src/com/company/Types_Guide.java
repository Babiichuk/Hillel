package com.company;

import java.util.Scanner;

public class Types_Guide {


    // function to print tata types
    public static void allTypes() {

        System.out.println("Primitive data types in Java:");
        System.out.println(" ");
        System.out.println("byte");
        System.out.println("short");
        System.out.println("int");
        System.out.println("long");
        System.out.println("float");
        System.out.println("double");
        System.out.println("char");
        System.out.println("boolean");
        System.out.println(" ");
        System.out.println("Input data type name to know more about it");

    }

    public static void aboutTypes(String typeInfo) {
        if (typeInfo.equals("byte")) {
            System.out.println("The Byte data type is an 8-bit integer.");
            System.out.println("It has a minimum value -128 and a maximum value 127");
        } else if (typeInfo.equals("short")) {
            System.out.println("The short data type is a 16-bit integer.");
            System.out.println("It has a minimum value -32768 and a maximum value 32767");
        } else if (typeInfo.equals("int")) {
            System.out.println("The int data type is a 32-bit integer.");
            System.out.println("Which has a minimum value -2147483648 and a maximum value 2147483647");
        } else if (typeInfo.equals("long")) {
            System.out.println("The long data type is a 64-bit integer.");
            System.out.println("Long has a minimum value -9223372036854775808 and a maximum 9223372036854775807");
        } else if (typeInfo.equals("double")) {
            System.out.println("The double data type is a double-precision 64-bit floating point number.");
            System.out.println("Its value range is unlimited.");
        } else if (typeInfo.equals("float")) {
            System.out.println("The float data type is a single-precision 32-bit IEEE 754 floating point number.");
            System.out.println("Its value range is unlimited.");
        } else if (typeInfo.equals("char")) {
            System.out.println("The char data type is a single 16-bit Unicode character.");
            System.out.println("Its value-range lies between '\\u0000' (or 0) to '\\uffff' ");
            System.out.println("The char data type is used to store characters.");
        } else if (typeInfo.equals("boolean")) {
            System.out.println("The Boolean data type is used to store only two possible values: true and false.");
            System.out.println("This data type is used for simple flags that track true/false conditions.");
        }
        System.out.println(" ");
        System.out.println("To start testing input s, to read more about data types input ? or q to exit program");
    }

    public static void questionBlock(int inScores, String correctAnswer) {

        Scanner scanAnswer = new Scanner(System.in);
        String userAnswer = scanAnswer.nextLine();
        if (userAnswer.equals(correctAnswer)) {
            System.out.println("Correct!");
            inScores = inScores + 10;
        } else {
            System.out.println("Wrong!");
        }
        System.out.println("You've got " + inScores + " %");
    }

    public static void typeTest() {
        System.out.println("Input number of correct statement");
        System.out.println(" ");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println(" ");

    }


    public static void main(String[] args) {
        int scores = 0;
        String typeByte;
        String typeShort;
        String typeInt;
        String typeLong;
        String typeFloat;
        String typeDouble;
        String typeChar;
        String typeBoolean;

        System.out.println("Hi! What's your name?");

        Scanner scanTypes = new Scanner(System.in);
        String userName = scanTypes.nextLine();

        System.out.println("Welcome to Java primitive data types guide, " + userName + " !");
        System.out.println("To see list of data types input ? to pass the test input t");

        String userInput = scanTypes.nextLine();

        if (userInput.equals("?")) {
            allTypes();

            // System.out.println("Input data type name to know more about it");
            String typeInput = scanTypes.nextLine();

            aboutTypes(typeInput);

        } else if (userInput.equals("t")) {
            System.out.println("Here you can check if you know Java data types well");
            System.out.println("To start testing input s, to read more about data types input ? or q to exit program");
            String startTest = scanTypes.nextLine();
            if (startTest.equals("s")) {
                typeTest();
               questionBlock(scores, "2");

                typeTest();
                questionBlock(scores, "1");
            } else if (startTest.equals("?")) {
                allTypes();
                String typeInput = scanTypes.nextLine();
                aboutTypes(typeInput);
                userInput = scanTypes.nextLine();
            } else if (startTest.equals("q")) {
                System.out.println("Good bye " + userName + " !");
            }
        }


    }
}
