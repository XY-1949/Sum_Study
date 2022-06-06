package com.yinsd.math.demo01;


import java.util.Random;
import java.util.Scanner;

public class TestDemo{
    public static void main(String[] args) {

            //随机获取两个数字，并计算其值，存储到数组1中；
            //输入结果，并记录到数组2中
            //对两数组一一对比
                Scanner sc = new Scanner(System.in);
                Random r = new Random();
                int a,b,c;
                int num = 0;
                int n1[] = new int[50];
                int n2[] = new int[50];
                for (int i = 0; i < n1.length; i++) {
                    a = r.nextInt(100);
                    b = r.nextInt(100);
                    if (a % 2 == 0) {
                        c = a + b;
                        System.out.println(a + "+" + b + "=");
                    } else {
                        c = a - b;
                        System.out.println(a + "-" + b + "=");
                    }
                    n1[i] = c;
                    num = sc.nextInt();
                    n2[i] = num;
                }
                for (int i = 0; i < n1.length; i++) {
                    if (n1[i] == n2[i]) {
                        System.out.println(i + ":" + "正确");
                    } else {
                        System.out.println(i + ":" + "错误");
                    }
                }
            }
}