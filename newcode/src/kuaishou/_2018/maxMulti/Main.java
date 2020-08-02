package kuaishou._2018.maxMulti;

public class Main {
    public static void main(String[] args) {

    }

    public static int maxMulti(int[] nums) {
        if (nums.length < 3) {
            return 0;
        }
        int[] multi = new int[3];
        multi[0] = nums[0];
        multi[1] = nums[1];
        multi[2] = nums[2];
        int minValue = multi[0] * multi[1] * multi[2], maxValue = minValue;
        for (int i = 3; i < nums.length; i++) {
            if(nums[i] == 0){
                continue;
            }
            for (int j = 0; j < 3; j++) {
                if (minValue > (minValue / multi[j]) * nums[i]) {
                    multi[j] = nums[i];
                    minValue = 0;
                }
            }
        }
        return 0;
    }
}
