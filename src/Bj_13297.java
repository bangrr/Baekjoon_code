import java.io.*;
import java.util.*;

public class Bj_13297 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<n; i++) {
            String s = br.readLine();
            sb.append(s.length()).append("\n");
        }
        System.out.print(sb);
    }
}