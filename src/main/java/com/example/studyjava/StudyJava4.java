package com.example.studyjava;

import java.util.Scanner;

public class StudyJava4 {

    public static void main(String[] args){
        //　数字の取得
        Scanner scanner = new Scanner(System.in);
        int value = 20;
        int min = 2;
        int max = 5;
        int result = 0;


        for (int n = 1; n <= value; n ++) {
            int sum =  calculate(n);
            if (min <=sum && sum <= max) {
                result += n;
            }
        }
        System.out.println(result);

    }
    public static int calculate(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
