import java.io.*;
import java.util.*;

public class Bj_18242 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] arr = new char[n][m];
        
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.charAt(j);
            }
        }

        int sr = -1, sc = -1, er = -1, ec = -1;

        for (int i = 0; i < n; i++) {
            String s = String.valueOf(arr[i]);
            if (s.indexOf('#') == -1) continue;

            sc = s.indexOf('#');
            sr = i;
            i += n;
        }

        for (int i = n - 1; i >= 0; i--) {
            String s = String.valueOf(arr[i]);
            if (s.lastIndexOf('#') == -1) continue;

            ec = s.lastIndexOf('#');
            er = i;
            i -= n;
        }

        int d = (er - sr) / 2;
        if (arr[sr][sc+d] == '.') {
            System.out.print("UP");
        } else if (arr[sr+d][sc] == '.') {
            System.out.print("LEFT");
        } else if (arr[er][ec-d] == '.') {
            System.out.print("DOWN");
        } else {
            System.out.print("RIGHT");
        }
    }
}