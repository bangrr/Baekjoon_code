import java.io.*;
import java.util.*;

public class Bj_32209 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int q = Integer.parseInt(br.readLine());
        int c = 0;
        while (q-- > 0) {
            st = new StringTokenizer(br.readLine());
            int e = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            if (e == 1) {
                c += v;
            } else {
                if (c < v) {
                    System.out.print("Adios");
                    return;
                } else {
                    c -= v;
                }
            }
        }
        System.out.print("See you next month");
    }
}