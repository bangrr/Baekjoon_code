import java.io.*;
import java.util.*;

public class Bj_4436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String s;
        while ((s = br.readLine()) != null) {
            long n = Integer.parseInt(s);
            int[] visited = new int[10];
            for (int i = 1; ; i++) {
                long x = n * i;
                while (x > 0) {
                    visited[(int) (x % 10)]++;
                    x /= 10;
                }
                boolean flag = true;
                for (int j = 0; j < 10; j++) {
                    if (visited[j] == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    sb.append(i).append("\n");
                    break;
                }
            }
        }
        System.out.print(sb);
    }
}
