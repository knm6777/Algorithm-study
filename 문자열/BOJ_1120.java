package 문자열;

import java.util.*;

public class BOJ_1120 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String A = in.next();
        String B = in.next();

        int ans = A.length();

        for(int i=0; i<=B.length()-A.length(); i++) {
            int tmp = 0;
            for(int j=0; j<A.length(); j++) {
                if (A.charAt(j) != B.charAt(i+j)){
                    tmp++;
                }
            }
            if(ans > tmp){
                ans = tmp;
            }
        }
        System.out.println(ans);
        in.close();
    }
}
