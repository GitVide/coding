package classical.everyday;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class TaskSchedule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int P = sc.nextInt();
        int[][] tasks = new int[P][4];
        for (int i = 0; i < P; i++) {
            tasks[i][0] = sc.nextInt();
            tasks[i][1] = sc.nextInt();
            tasks[i][2] = sc.nextInt();
            tasks[i][4] = sc.nextInt();
        }
        /*Arrays.sort(tasks, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[2] )
                return 0;
            }
        });*/
    }
}
