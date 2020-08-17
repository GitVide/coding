package classical.everyday;

import java.util.Arrays;
import java.util.Scanner;

public class TouSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(calculate(nums));
    }

    private static int calculate(int[] nums) {
        //先排序，再分组
        Arrays.sort(nums);
        int sum = 0;
        int group = 1, n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (group < 3 && nums[i + 1] - nums[i] <= 10) {
                group++;
            } else if (group < 3 && nums[i + 1] - nums[i] > 10) {
                sum += 3 - group;
                group = 1;
            } else if (group == 3) {
                group = 1;
            }
        }
        sum += 3 - group;
        return sum;
    }

}
