import java.io.*;
import java.util.*;

public class Bj_15667 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i*i <= n; i++) {
            if (i * (i + 1) == n - 1) {
                System.out.print(i);
                return;
            }
        }
    }
}
