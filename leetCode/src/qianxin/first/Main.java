package qianxin.first;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        memo = new Integer[n + 1];
        arr = new int[][]{{2, 2}, {3, 2}, {1, 3}, {5, 1}, {4, 5}, {3, 2}};
        boolean[] visited = new boolean[6];
        int ans = dfs(n, visited);
        System.out.println(ans);
    }

    static Integer[] memo;
    static int[][] arr;

    private static int dfs(int n, boolean[] visited) {
        if (n == 0) {
            return 0;
        }
        if (n < 0) {
            return -1;
        }
        if (memo[n] != null)
            return memo[n];
        memo[n] = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            /*if (!visited[i]) {

                visited[i] = true;
                int temp = dfs(n - arr[i][1], visited);
                visited[i] = false;
                if (temp >= 0) {
                    memo[n] = Math.max(memo[n], temp + arr[i][0]);
                }

            }*/
            if(dfs(n - arr[i][1], visited) >= 0){
                //dfs(n - arr[i][1], visited) + arr[i][0];
            }

        }
        if (memo[n] == Integer.MIN_VALUE)
            memo[n] = -1;
        return memo[n];

    }
}
