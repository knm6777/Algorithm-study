package 문자열;

import java.util.Scanner;

public class BOJ_2675 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // 반복 횟수
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int count = in.nextInt();
            String str = in.next();

            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < count; k++) {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
/*
예제입력      예제출력
2           AAABBBCCC
3 ABC       /////HHHHHTTTTTPPPPP
5 /HTP
*/
