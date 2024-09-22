import java.io.*;
import java.util.*;

public class Bj_32343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        String s = "";
        if (n >= a + b) {
            s = "1".repeat(a + b) + "0".repeat(n - a - b);
        } else {
            s = "1".repeat(a + b - (a + b - n) * 2) + "0".repeat(a + b - n);
        }
        System.out.print(Integer.parseInt(s, 2));
    }
}