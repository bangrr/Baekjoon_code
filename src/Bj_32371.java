import java.io.*;
import java.util.*;

public class Bj_32371 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] arr = new char[4][10];
        boolean[][] chk = new boolean[4][10];
        for (int i = 0; i < 4; i++) {
            arr[i] = br.readLine().toCharArray();
        }
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 10; k++) {
                    if (arr[j][k] == s.charAt(i)) {
                        chk[j][k] = true;
                    }
                }
            }
        }
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 10; j++) {
                if (chk[i-1][j] && chk[i-1][j+1] && chk[i][j+1] && chk[i+1][j+1] && chk[i+1][j] && chk[i+1][j-1] && chk[i][j-1] && chk[i-1][j-1]) {
                    System.out.print(arr[i][j]);
                    return;
                }
            }
        }
    }
}