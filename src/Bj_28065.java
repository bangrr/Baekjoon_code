import java.io.*;
import java.util.*;

public class Bj_28065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <n/2+1; i++) {
            sb.append(i).append(" ").append(n + 1 - i).append(" ");
        }
        if (n % 2 == 1) {
            sb.append(n/2+1);
        }
        System.out.print(sb);
    }
}