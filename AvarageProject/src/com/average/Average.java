package com.average;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int classNum=3;
        int stuNum=4;
        double sum=0;
        double avg=0;
        Scanner scanner=new Scanner(System.in);

        for (int i=1;i<=classNum;i++){
            sum=0;
            System.out.println("*******请输入第"+i+"个班级的成绩******");
            for (int j=1;j<=stuNum;j++){
                System.out.println("********请输入第"+j+"个学院的成绩*******");
                int score=scanner.nextInt();
                sum+=score;
            }
            avg=sum/stuNum;
            System.out.println("第"+i+"个班级的平均分是"+avg);
        }
    }
}
