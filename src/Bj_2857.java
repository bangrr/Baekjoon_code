import java.io.*;
import java.util.*;

public class Bj_2857 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for (int i = 1; i <= 5; i++) {
            String s = br.readLine();
            if (s.contains("FBI")) {
                sb.append(i).append(" ");
            }
        }
        if (sb.length() == 0) {
            System.out.print("HE GOT AWAY!");
        } else {
            System.out.print(sb.toString().trim());
        }
    }
}