package poj;

import java.util.Scanner;

/*
* 兔子繁殖问题：
* 第n个月的兔子数量:
* f(n) = f(n - 1) + 这个月新增的兔子(上上个月有多少兔子，这个月就新增多少兔子)
* f(n) = f(n - 1) + f(n - 2)经典的斐波那契数列
* */
public class Rabbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(rabbit(n));
    }

    private static int rabbit(int n) {
        if (n <= 2) {
            return 1;
        }
        int a = 1, b = 1, c = a + b;
        for(int i = 3; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
