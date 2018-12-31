package com.example.studyjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudyJava7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = "01BBB";
        String[] line =  input.split("");

        List<String> list = new ArrayList<>();
        for (String word : line) {
            switch (word) {
                case ("0"):
                    list.add(word);
                    break;
                case ("1"):
                    list.add(word);
                    break;
                case ("B"):
                    if (list.size() == 0) {
                        break;
                    } else {
                        list.remove(0);
                        break;
                    }
            }
        }
        String result = "";
        for (String word : list) {
            result += word;
        }
        System.out.println(result);
    }
}
