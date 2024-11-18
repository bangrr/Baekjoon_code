import java.util.*;
import java.io.*;

public class Bj_9252 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        char[] strA = br.readLine().toCharArray();
        char[] strB = br.readLine().toCharArray();
        int lenA = strA.length;
        int lenB = strB.length;

        int[][] memo = new int[strA.length + 1][strB.length + 1];

        for (int i = 1; i <= lenA; i++) {
            int tmp = 0;
            for (int j = 1; j <= lenB; j++) {
                if (strA[i - 1] == strB[j - 1]) {
                    memo[i][j] = memo[i - 1][j - 1] + 1;
                } else {
                    memo[i][j] = Math.max(memo[i - 1][j], memo[i][j - 1]);
                }
            }
        }

        int i = lenA, j = lenB;
        while (i > 0 && j > 0) {
            if (memo[i][j] == memo[i - 1][j]) {
                i--;
            } else if (memo[i][j] == memo[i][j - 1]) {
                j--;
            } else {
                sb.append(strA[i - 1]);
                i--;
                j--;
            }
        }

        System.out.println(memo[strA.length][strB.length]);
        System.out.print(sb.reverse());
    }
}
