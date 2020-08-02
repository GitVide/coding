package huawei1.first;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] strArr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        for (int i = 0; i < strArr.length - 1; i++) {
            sb.append(convert(strArr[i], set) + " ");
        }
        sb.append(convert(strArr[strArr.length - 1], set));
        System.out.println(sb.toString());
    }

    public static String convert(String s, Set<Character> set) {
        String temp = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while (index < temp.length()) {
            if (set.contains(temp.charAt(index)))
                index++;
            sb.append(temp.charAt(index++));
        }
        return sb.substring(0, 1).toUpperCase() + sb.substring(1, sb.length());
    }
}
