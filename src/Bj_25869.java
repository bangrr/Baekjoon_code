import java.io.*;
import java.util.*;

public class Bj_25869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken()) * 2;
        if (w > d && h > d) {
            System.out.print((w-d)*(h-d));
        } else {
            System.out.print(0);
        }
    }
}