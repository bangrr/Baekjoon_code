import java.io.*;
import java.util.*;

public class Bj_16282 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        long n = Long.parseLong(br.readLine());
        int c = 1;
        while (true) {
            long last = (c+1) * (long)Math.pow(2, c+1) - 1;
            if (n <= last) break;
            c++;
        }
        System.out.print(c);
    }
}