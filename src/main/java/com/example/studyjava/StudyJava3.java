package com.example.studyjava;

import java.util.Scanner;

public class StudyJava3 {
    public static void main(String[] args) {
        // データを取得
        Scanner scanner = new Scanner(System.in);
        int loopCount = scanner.nextInt();
        int nums[] = new int[loopCount];
        for (int n = 0; n < loopCount ; n++) {
            nums[n] = scanner.nextInt();
        }

        boolean isNext = true;
        // フラグがtrueの時だけループする
        int looped = 0;
        while (isNext) {
            for (int n = 0; n < nums.length ; n++) {
                if (nums[n] % 2 == 1) {
                    isNext = false;
                    break;
                }
                nums[n] /= 2;
            }
            looped++;
        }
        System.out.println(looped - 1);
    }
}
