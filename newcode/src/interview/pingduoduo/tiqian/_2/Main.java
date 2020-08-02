package interview.pingduoduo.tiqian._2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int T = sc.nextInt();
        int[][] numN = new int[N][2];
        int[][] numM = new int[M][2];
        for (int i = 0; i < N; i++) {
            numN[i][0] = sc.nextInt();
            numN[i][1] = sc.nextInt();
        }
        for (int i = 0; i < M; i++) {
            numM[i][0] = sc.nextInt();
            numM[i][1] = sc.nextInt();
        }

        //System.out.println(baoLi(numN, numM, T));
    }

    /*private static int duoDuo(int[][] N, int[][] M, int T) {
        if (T == 0) {
            return 0;
        }
        int n = N.length, m = M.length;
        Integer[] dp = new Integer[100001];
        for (int i = 0; i < n; i++) {
            if (dp[N[i][1]] == null) {
                dp[N[i][1]] = N[i][0];
            } else {
                dp[N[i][1]] = Math.min(dp[N[i][1]], N[i][0]);
            }
        }
    }*/
    private static int baoLi(int[][] N, int[][] M, int T) {
        if (T == 0){
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        int n = N.length, m = M.length;
        for (int i = 0; i < n; i++) {
            if (T <= N[i][1]) {
                ans = Math.min(ans, N[i][0]);
            }
        }
        for (int i = 0; i < m; i++) {
            if (T <= M[i][1]) {
                ans = Math.min(ans, M[i][0]);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (T <= N[i][1] + M[j][1]) {
                    ans = Math.min(ans, N[i][0] + M[j][0]);
                }
            }
        }
        if (ans == Integer.MAX_VALUE) {
            ans = -1;
        }
        return ans;
    }
}
