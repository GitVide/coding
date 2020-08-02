package interview.pingduoduo.tiqian._1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (K - arr[i] < 0) {
                count++;
                K = arr[i] - K;
            } else if (K - arr[i] == 0) {

                if(i < N - 1){
                    System.out.println("paradox");
                    return;
                } else{
                    K = 0;
                    break;
                }
            } else {
                K = K - arr[i];
            }
        }
        System.out.println(K + " " + count);
    }
}
