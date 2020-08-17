package netEase.previous._2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] T = new int[m];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < m; i++) {
            T[i] = sc.nextInt();
            set.add(T[i]);
        }
        int[] ans = new int[n];
        int j = 0, num = 1;
        for (int i = 0; i < n; i++) {
            if (num < T[j] && !set.contains(num)){
                ans[i] = num;
            }else if (num == T[j]){
                
            }
        }
    }
}
