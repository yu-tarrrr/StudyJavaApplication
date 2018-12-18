package com.example.studyjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudyJava2 {
    
    public static void main(String[] args) {
        // データを取得
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        //　リストに格納
        List<Integer> numList = new ArrayList<>();
        numList.add(num1);
        numList.add(num2);
        numList.add(num3);

        // 判定
        List<Integer> result = numList.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());

        // 結果出力
        System.out.println(result.size());
    }
}

