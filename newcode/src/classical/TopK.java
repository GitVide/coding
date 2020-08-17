package classical;

import java.util.Arrays;
import java.util.Comparator;

public class TopK {
    public static void main(String[] args) {

    }

    /* public int[] topKFrequent(int[] nums, int k) {

     }*/
    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];
        for (int i = 0; i < tasks.length; i++) {
            count[tasks[i] - 'A']++;
        }
        int t = 0;
        Arrays.sort(count);
        boolean tag = true;
        while (tag) {
            tag = false;
            int i = 0, index = 25;
            for (i = 1; i <= n && index >= 0 && count[index] > 0;
                 i++) {
                tag = true;
                count[index--]--;
                t++;
            }
            Arrays.sort(count);
            if (tag){
                t += n - i;
            }
        }
        return t;
    }
}
