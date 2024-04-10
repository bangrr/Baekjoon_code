import java.io.*;
import java.util.*;

public class Bj_31242 {
    static int[] DR = {1, 2, 2, 1,-1,-2,-2,-1};
    static int[] DC = {2, 1,-1,-2,-2,-1, 1, 2};
    static int r, c;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int[][] arr = new int[4][5];
        for (int i=0; i<4; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 1) {
                    r = i; c = j;
                }
            }
        }

        int p = 2;
        boolean next = true;
        while (next) {
            int i = 0;
            for (i=0; i<8; i++) {
                int tr = r + DR[i];
                int tc = c + DC[i];
                if (tr < 0 || tr > 3 || tc < 0 || tc > 4) continue;
                if (arr[tr][tc] == p) {
                    r = tr; c = tc; p++;
                    break;
                }
            }
            if (i == 8) next = false;
        }
        System.out.print(arr[r][c]);
    }
}