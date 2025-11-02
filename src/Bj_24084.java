import java.io.*;
import java.util.*;

public class Bj_24084 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        for (int i=0; i<n-1; i++) {
            char cn = s.charAt(i);
            char cc = s.charAt(i+1);
            if (cc == 'J') {
                sb.append(cn).append("\n");
            }
        }
        System.out.print(sb);
    }
}