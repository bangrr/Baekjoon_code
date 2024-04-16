import java.io.*;
import java.util.*;

public class Bj_20363 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int max = Math.max(x, y);
        int min = Math.min(x, y);
        System.out.print(max + min/10 + min);
    }
}