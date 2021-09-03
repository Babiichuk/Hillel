package com.company;

public class Lesson5_task1 {
    public static void main(String[] args) {
        String text = "Hi im Max";
        System.out.println(text.length());

        String text1 ="Hello.";
        String text2 ="I am Max";
        System.out.println(text1.concat(text2));

        text1 ="     I am Max      ";
        text2 ="     I am Max";
        System.out.println(text1);
        System.out.println(text2.trim());

        text = "Hi im Maks";
        boolean end1 =text.endsWith("Maks");
        boolean end2 =text.endsWith("Alex");
        System.out.println(end1);
        System.out.println(end2);

        
    }
}
