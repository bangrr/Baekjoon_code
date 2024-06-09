import java.io.*;
import java.util.*;

public class Bj_2714 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        final int[] dr = {0, 1, 0, -1};
        final int[] dc = {1, 0, -1, 0};

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            char[][] msg = new char[r + 1][c + 1];
            String s = st.nextToken();
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    msg[i][j] = s.charAt(c * i + j);
                }
            }

            int d = 0;
            int index = 0;
            int y = 0, x = -1;
            char[] str = new char[r * c];
            while (index < str.length) {
                for (int i = 0; i < (d % 2 == 0 ? c : r); i++) {
                    if (d % 2 == 0) x += dc[d];
                    else y += dr[d];
                    str[index++] = msg[y][x];
                }
                if (d % 2 == 0) r--;
                else c--;
                d = (d + 1) % 4;
            }

            ArrayList<String> list = new ArrayList<>();
            String tmp = "";
            for (int i = 0; i < str.length / 5; i++) {
                tmp = "";
                for (int j = 0; j < 5; j++) {
                    tmp += str[i * 5 + j];
                }
                list.add(tmp);
            }

            StringBuilder tsb = new StringBuilder();
            for (String it : list) {
                tsb.append((char)(Integer.parseInt(it, 2)+64));
            }
            sb.append(tsb.toString().replaceAll("@", " ").trim()).append("\n");
        }
        System.out.print(sb);
    }
}