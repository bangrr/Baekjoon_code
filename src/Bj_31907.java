import java.io.*;
import java.util.*;

public class Bj_31907 {
    // 입출력 메소드
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    // main 메소드
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String G = "G".repeat(n);
        String I = "I".repeat(n);
        String S = "S".repeat(n);
        String T = "T".repeat(n);
        String D = ".".repeat(n);

        for (int i=0; i<n; i++) {
            sb.append(G).append(D.repeat(3)).append("\n");
        }
        for (int i=0; i<n; i++) {
            sb.append(D).append(I).append(D).append(T).append("\n");
        }
        for (int i=0; i<n; i++) {
            sb.append(D.repeat(2)).append(S).append(D).append("\n");
        }
        System.out.print(sb);
    }
}