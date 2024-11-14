import java.io.*;
import java.util.*;

public class Bj_32682 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            boolean odd = isOdd(n);
            boolean square = isSquare(n);

            if (!odd && !square) {
                sb.append("EMPTY");
            } else {
                sb.append(odd ? "O" : "");
                sb.append(square ? "S" : "");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

    private static boolean isOdd(int n) {
        return (n % 2 == 1);
    }

    private static boolean isSquare(int n) {
        for (int i = 0; i * i <= n; i++) {
            if (i * i == n) {
                return true;
            }
        }
        return false;
    }
}