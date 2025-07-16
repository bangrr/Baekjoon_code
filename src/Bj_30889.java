import java.io.*;
import java.util.*;

public class Bj_30889 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        char[][] arr = new char[10][20];
        for (int i=0; i<10; i++) {
            Arrays.fill(arr[i], '.');
        }
        while (n-- > 0) {
            String s = br.readLine();
            char ch = s.charAt(0);
            int num = Integer.parseInt(s.substring(1));
            arr[ch-'A'][num-1] = 'o';
        }
        for (int i=0; i<10; i++) {
            for (int j=0; j<20; j++) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}