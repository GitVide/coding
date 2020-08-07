package classical.everyday;

import java.util.Scanner;

public class XiPai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] nums = new int[2 * n];
            for (int i = 0; i < 2 * n; i++) {
                nums[i] = sc.nextInt();
            }

            for (int i = 0; i < k; i++) {
                nums = one(nums);
            }
            for (int i = 0; i < 2 * n - 1; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println(nums[2 * n - 1]);
        }
    }

    private static int[] one(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int index = n / 2, temp = index;
        int t = n - 1;
        while (index > 0) {
            ans[t--] = nums[index + temp - 1];
            ans[t--] = nums[index - 1];
            index--;
        }
        return ans;
    }
}
