package com.example.studyjava;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * ABC081A - Placing Marbles用のクラス
 */
class Main {

    public static void main(String[] args) {


        // データを取得する
        Scanner sc = new Scanner(System.in);
        String obtain =  sc.next();

        // データを配列に分ける
        String[] seperatedObtains = obtain.split("");

        // 判定する
        List<Integer> result = Arrays.stream(seperatedObtains)
                .map(seperate -> Integer.parseInt(seperate))
                .filter(seperate -> seperate % 2 == 1)
                .collect(Collectors.toList());
        System.out.println(result.size());

    }
}
