package ali.bishi._2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        //StringBuilder s = new StringBuilder(S);
        int n = sc.nextInt();
        String[] strArr = new String[n];
        for (int i = 0; i < n; i++) {
            strArr[i] = sc.next();
        }
        boolean tag = true;
        while (tag) {
            tag = false;
            for (int i = 0; i < n; i++) {
                int index = S.indexOf(strArr[i]);
                if (index != -1) {
                    String temp = S.substring(0, index) + S.substring(index + strArr[i].length(), S.length());
                    if (!"".equals(temp)){
                        S = temp;
                        tag = true;
                        break;
                    }
                    //System.out.println(S);
                }
            }
        }
        System.out.println(S);
    }
}
