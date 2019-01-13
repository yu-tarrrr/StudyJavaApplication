package com.example.studyjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudyJava8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // 数字の取得
        int price = scanner.nextInt();
        int hate = scanner.nextInt();

        // 数字を取得してリストにしておく
        List<Integer> hateList = new ArrayList();
        for (int n = 0; n <= hate; n ++) {
            int num = scanner.nextInt();
            hateList.add(num);
        }

        // priceの中身を検証
        String[] stringPrice = String.valueOf(price).split("");
        for (int n = 0; n <= stringPrice.length; n++) {
            int num = Integer.parseInt(stringPrice[n]);
            if (hateList.contains(num)) {
                hateList.remove(num);
            }
        }


    }
}
