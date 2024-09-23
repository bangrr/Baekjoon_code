import java.io.*;
import java.util.*;

public class Bj_32357 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int c = 0;
        for (int i=0; i<n; i++) {
            String s = br.readLine();
            c += isPalin(s);
        }
        System.out.print(c*(c-1));
    }

    private static int isPalin(String s) {
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i)) {
                return 0;
            }
        }
        return 1;
    }
}