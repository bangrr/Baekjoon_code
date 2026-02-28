import java.io.*;
import java.util.*;

public class Bj_35213 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        sb.append(n).append("\n");
        for (int i=0; i<n; i++) {
            sb.append(1).append(" ");
        }
        System.out.print(sb);
    }
}