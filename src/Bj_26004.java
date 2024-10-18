import java.io.*;
import java.util.*;

public class Bj_26004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int H = 0, I = 0, A = 0, R = 0, C = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'H') {
                H++;
            } else if (s.charAt(i) == 'I') {
                I++;
            } else if (s.charAt(i) == 'A') {
                A++;
            } else if (s.charAt(i) == 'R') {
                R++;
            } else if (s.charAt(i) == 'C') {
                C++;
            }
        }
        System.out.print(Math.min(H, Math.min(I, Math.min(A, Math.min(R, C)))));
    }
}