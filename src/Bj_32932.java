import java.io.*;
import java.util.*;

public class Bj_32932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int x = 500, y = 500;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        boolean[][] arr = new boolean[1001][1001];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a+500][b+500] = true;
        }
        String str = br.readLine();
        for (int i = 0; i < k; i++) {
            char c = str.charAt(i);
            if (c == 'U') {
                if (arr[x][y+1]) {
                    continue;
                }
                y++;
            } else if (c == 'D') {
                if (arr[x][y-1]) {
                    continue;
                }
                y--;
            } else if (c == 'L') {
                if (arr[x-1][y]) {
                    continue;
                }
                x--;
            } else if (c == 'R') {
                if (arr[x+1][y]) {
                    continue;
                }
                x++;
            }
        }
        System.out.print((x-500) + " " + (y-500));
    }
}