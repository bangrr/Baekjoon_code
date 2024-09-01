import java.io.*;
import java.util.*;

public class Bj_5613 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int a = Integer.parseInt(br.readLine());
        while (true) {
            String s = br.readLine();
            if (s.equals("=")) break;

            int n = Integer.parseInt(br.readLine());

            if (s.equals("+")) {
                a += n;
            } else if (s.equals("-")) {
                a -= n;
            } else if (s.equals("/")) {
                a /= n;
            } else if (s.equals("*")) {
                a *= n;
            }
        }
        System.out.print(a);
    }
}