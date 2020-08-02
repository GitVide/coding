package interview.bytedace.wanzhuan._2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*int[] nums = {1, 2, 3, 4, 5, 6, -3, -4, -5};
        int[] ans = sort(nums);
        for (int e : ans) {
            System.out.println(e + " ");
        }*/
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] ans = sort(nums);
        for (int i = 0; i < n - 1; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.print(ans[n - 1]);
    }

    private static int[] sort(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }
        int n = nums.length;
        int[] ans = new int[n];
        int i = 0, j = 0;

        int t = 0;
        while (i < n && j < n) {
            while (j < n && nums[j] >= 0) {
                j++;
            }
            while (i < n && nums[i] <= 0) {
                i++;
            }
            if (i < n)
                ans[t++] = nums[i++];
            if (j < n)
                ans[t++] = nums[j++];
        }
        if (j == n) {
            while (t < n) {
                while (i < n && nums[i] <= 0) {
                    i++;
                }
                if (i < n)
                    ans[t++] = nums[i++];
            }
        }
        if (i == n) {
            while (t < n) {
                while (j < n && nums[j] >= 0) {
                    j++;
                }
                if (j < n)
                    ans[t++] = nums[j++];
            }
        }
        return ans;
    }
}
