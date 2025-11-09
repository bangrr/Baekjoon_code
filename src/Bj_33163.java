import java.io.*;
import java.util.*;

public class Bj_33163 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        for (int i=0; i<n; i++) {
            if (s.charAt(i) == 'J') {
                sb.append("O");
            } else if (s.charAt(i) == 'O') {
                sb.append("I");
            } else {
                sb.append("J");
            }
        }
        System.out.print(sb);
    }
}