import java.io.*;
import java.util.*;

public class Bj_11104 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            sb.append(Integer.parseInt(br.readLine(), 2)).append("\n");
        }
        System.out.print(sb);
    }
}