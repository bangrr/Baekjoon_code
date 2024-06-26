import java.io.*;
import java.util.*;

public class Bj_15372 {
    // 입출력 메소드
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    // main 메소드
    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            long n = Long.parseLong(br.readLine());
            sb.append(n*n).append("\n");
        }
        System.out.print(sb);
    }
}