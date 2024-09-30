import java.io.*;
import java.util.*;

public class Bj_32370 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        st = new StringTokenizer(br.readLine());
        long x = Long.parseLong(st.nextToken());
        long y = Long.parseLong(st.nextToken());

        if (a == 0 && x == 0) {
            if (b < y) {
                System.out.print(1);
            } else {
                System.out.print(3);
            }
        } else if (b == 0 && y == 0) {
            if (a < x) {
                System.out.print(1);
            } else {
                System.out.print(3);
            }
        } else if (a == 0 || b == 0) {
            System.out.print(1);
        } else {
            System.out.print(2);
        }
    }
}