import java.io.*;
import java.util.*;

public class Bj_23794 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int m = n+2;
        for (int i=0; i<m; i++) {
            for (int j=0; j<m; j++) {
                if (i == 0 || i == m-1 || j == 0 || j == m-1) {
                    sb.append("@");
                } else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}