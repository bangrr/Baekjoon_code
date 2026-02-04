import java.io.*;
import java.util.*;

public class Bj_16239 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int k = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i < n; i++) {
            sb.append(i).append("\n");
            k -= i;
        }
        sb.append(k);
        System.out.print(sb);
    }
}