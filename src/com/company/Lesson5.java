package com.company;

public class Lesson5 {
    public static void main(String[] args) {


        int[][] twoDimArray = {{5, 7, 3, 17}, {7, 0, 1, 12}, {8, 1, 2, 3}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("" + twoDimArray[i][i] + "");
            }
            System.out.println();
        }
    }
}
