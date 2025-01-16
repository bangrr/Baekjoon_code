import java.io.*;
import java.util.*;

public class Bj_14470 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());
        boolean freeze = a < 0;

        int s = 0;
        while (a < b) {
            if (freeze) {
                if (a < 0) {
                    s += c;
                } else {
                    s += d;
                    s += e;
                    freeze = false;
                }
            } else {
                s += e;
            }
            a++;
        }
        System.out.print(s);
    }
}
