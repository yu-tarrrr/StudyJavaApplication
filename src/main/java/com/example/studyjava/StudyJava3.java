package com.example.studyjava;

import java.util.Scanner;

public class StudyJava3 {
    public static void main(String[] args) {
        // データを取得
        Scanner scanner = new Scanner(System.in);
        // 長さを取得しておく
        int length = scanner.nextInt();
        // lengthの長さで配列を作る
        int[] value = new int[length];
        for (int n = 0; n < length; n++) {
            value[n] = scanner.nextInt();
        }

        // フラグを持たせる
        boolean goNext = true;
        int loopCount = 0;

        while (goNext) {
            for (int n = 0; n < length; n++) {
                // 奇数だったら抜ける
                if (value[n] % 2 == 1) {
                    goNext = false;
                    break;
                }
                // 偶数の場合は2で割る
                value[n] /= 2;
            }
            loopCount++;
        }
        // 抜けた場合でも1加算されているので減算しておく
         System.out.println(loopCount - 1);
    }
}
