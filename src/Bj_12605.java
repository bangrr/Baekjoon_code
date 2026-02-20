import java.io.*;
import java.util.*;

public class Bj_12605 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i=1; i<=n; i++) {
            String[] arr = br.readLine().split(" ");
            sb.append("Case #").append(i).append(": ");
            for (int j=0; j<arr.length; j++) {
                sb.append(arr[arr.length - 1 - j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}