import java.io.*;
import java.util.*;

public class Bj_2154 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        for (int i=1; i<=n; i++) {
            sb.append(i);
        }
        System.out.print(sb.toString().indexOf(String.valueOf(n))+1);
    }
}