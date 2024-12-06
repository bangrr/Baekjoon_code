import java.util.*;
import java.io.*;

public class Bj_1958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        char[] strA = br.readLine().toCharArray();
        char[] strB = br.readLine().toCharArray();
        char[] strC = br.readLine().toCharArray();
        int lenA = strA.length;
        int lenB = strB.length;
        int lenC = strC.length;

        int[][][] memo = new int[lenA+1][lenB+1][lenC+1];

        for (int i = 1; i <= lenA; i++) {
            for (int j = 1; j <= lenB; j++) {
                for (int k = 1; k <= lenC; k++) {
                    if (strA[i-1] == strB[j-1] && strB[j-1] == strC[k-1]) {
                        memo[i][j][k] = memo[i-1][j-1][k-1] + 1;
                    } else {
                        memo[i][j][k] = Math.max(memo[i-1][j][k], Math.max(memo[i][j-1][k], memo[i][j][k-1]));
                    }
                }
            }
        }
        System.out.print(memo[lenA][lenB][lenC]);
    }
}
