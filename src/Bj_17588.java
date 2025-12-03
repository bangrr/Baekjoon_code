import java.io.*;
import java.util.*;

public class Bj_17588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[201];
        int last = 0;
        for (int i=0; i<n; i++) {
            int a = Integer.parseInt(br.readLine());
            arr[a] = true;
            last = a;
        }
        for (int i=1; i<=last; i++) {
            if (!arr[i]) sb.append(i).append("\n");
        }
        System.out.print(sb.length() == 0 ? "good job" : sb);
    }
}