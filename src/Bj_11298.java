import java.io.*;
import java.util.*;

public class Bj_11298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            char[][] arr = new char[a * 10 + 1 + b][11];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    if (i == 0 || j == 0) arr[i][j] = '*';
                    else if (a * j + b == i) {
                        arr[i][j] = '*';
                    } else {
                        arr[i][j] = ' ';
                    }
                }
            }

            sb.append(String.format("y = %dx + %d%n", a, b));
            for (int i = arr.length - 1; i >= 0; i--) {
                for (int j = 0; j < arr[0].length; j++) {
                    sb.append(arr[i][j]);
                }
                sb.append("\n");
            }
        }
        System.out.print(sb);
    }
}