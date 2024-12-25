import java.io.*;
import java.util.*;

public class Bj_32661 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            min = Math.min(min, a);
            max = Math.max(max, a);
        }
        System.out.print(Math.max(min-(max/2), 0));
    }
}
