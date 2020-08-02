package qianxin2020c.first;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        memo = new Integer[n + 1];
        //多少钱几个装
        arr = new int[][]{{2, 2}, {2, 3}, {3, 1}, {1, 5}, {5, 4}, {2, 3}};
        boolean[] visited = new boolean[6];
        int ans = dfs(n, visited);
        System.out.println(ans);
    }
    static Integer[] memo;
    static int[][] arr;
    private static int dfs(int n, boolean[] visited){
        if(n == 0){
            return 0;
        }
        if(n < 0){
            return -1;
        }
        if(memo[n] != null)
            return memo[n];
        memo[n] = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(!visited[i]){
                visited[i] = true;
                if(dfs(n - arr[i][0], visited) >= 0){
                    memo[n] = Math.max(memo[n], dfs(n - arr[i][0], visited) + arr[i][1]);
                }
                visited[i] = false;
            }
        }
        if (memo[n] == Integer.MIN_VALUE)
            memo[n] = -1;
        return memo[n];

    }
}
