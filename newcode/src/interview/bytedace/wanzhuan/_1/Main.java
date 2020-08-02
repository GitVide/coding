package interview.bytedace.wanzhuan._1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 10000001;
        int sum = 0;
        int[] ans = new int[count];
        int[] arr = new int[count];
        for(int i = 1; i < count; i++){
            arr[i] = arr[i >> 1] + (i & 1);
            sum += arr[i];
            ans[i] = sum;
        }
        int T = sc.nextInt();
        while (T-- > 0) {
            System.out.println(ans[sc.nextInt()]);
        }
    }

}
