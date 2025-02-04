import java.io.*;
import java.util.*;

public class Bj_2204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String s;
        while ((s = br.readLine()) != null) {
            int n = Integer.parseInt(s);
            if (n == 0) {
                break;
            }
            String[][] arr = new String[n][2];
            for (int i = 0; i < n; i++) {
                arr[i][0] = br.readLine();
                arr[i][1] = arr[i][0].toLowerCase();
            }
            Arrays.sort(arr, Comparator.comparing(o -> o[1]));
            sb.append(arr[0][0]).append("\n");
        }
        System.out.print(sb);
    }
}
