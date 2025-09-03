import java.io.*;
import java.util.*;

public class Bj_34183 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        if (m < n * 3) {
            System.out.print(b+(n*3-m)*a);
        } else {
            System.out.print(0);
        }
    }
}