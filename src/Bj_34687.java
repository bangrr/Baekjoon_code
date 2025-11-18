import java.io.*;
import java.util.*;

public class Bj_34687 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        if (n * 81 <= m * 100) {
            System.out.print("yaho");
        } else {
            System.out.print("no");
        }
    }
}