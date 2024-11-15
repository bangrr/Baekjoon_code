import java.io.*;
import java.util.*;

public class Bj_32652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int k = Integer.parseInt(br.readLine());
        sb.append("AKARAKA").append("RAKA".repeat(Math.max(0, k - 1)));
        System.out.print(sb);
    }
}