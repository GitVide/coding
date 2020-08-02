package poj;

import java.util.Scanner;

public class Main_1664 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int k = putApple(m, n);
            System.out.println(k);
        }
    }

    public static int putApple(int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        return dfs(m, n, dp);
    }

    private static int dfs(int m, int n, int[][] dp) {
        if (m == 0 || n == 0) {
            return 1;
        }
        if (m == 1 || n == 1) {
            return 1;
        }
        if (dp[m][n] != 0) {
            return dp[m][n];
        }
        if (m < n) {
            return dfs(m, m, dp);
        }
        dp[m][n] = dfs(m - n, n, dp) + dfs(m, n - 1, dp);
        return dp[m][n];
    }

}
