import java.io.*;
import java.util.*;

public class Bj_2495 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for (int i=0; i<3; i++) {
            String x = br.readLine();
            int max = 0;
            int count = 1;
            for (int j=1; j<x.length(); j++) {
                if (x.charAt(j) == x.charAt(j-1)) {
                    count++;
                } else {
                    max = Math.max(max, count);
                    count = 1;
                }
            }
            max = Math.max(max, count);
            sb.append(max).append("\n");
        }
        System.out.print(sb);
    }
}