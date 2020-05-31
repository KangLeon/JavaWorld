package com.sum;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("请输入需要加分的成绩：");
        Scanner scanner=new Scanner(System.in);
        System.out.println();
        int score=scanner.nextInt();
        int times=0;
        while (score<60){
            score++;
            times++;
        }
        System.out.println("加分前的成绩："+score);
        System.out.println("共加了："+times+"次");
    }
}
