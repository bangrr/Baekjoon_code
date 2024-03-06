import java.util.*;
import java.io.*;

public class Bj_10994 {
    static char[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int m = n*4-3;
        arr = new char[m][m];

        recur(0, m);

        for (int i=0; i<m; i++) {
            for (int j=0; j<m; j++) {
                if (arr[i][j] != '*') sb.append(' ');
                else sb.append('*');
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

    private static void recur(int start, int len) {
        if (len<start) return;

        for (int i=start; i<len; i++) {
            arr[start][i] = '*';
            arr[i][len-1] = '*';
            arr[i][start] = '*';
            arr[len-1][i] = '*';
        }
        recur(start+2, len-2);
    }
}