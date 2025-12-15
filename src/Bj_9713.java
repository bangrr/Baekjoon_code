import java.io.*;
import java.util.*;

public class Bj_9713 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int m = (n+1)/2;
            sb.append(m*m).append("\n");
        }
        System.out.print(sb);
    }
}