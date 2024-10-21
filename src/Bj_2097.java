import java.io.*;
import java.util.*;

public class Bj_2097 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int w = (int)Math.sqrt(n);
        int h;
        if (n % w == 0) {
            h = n / w;
        } else {
            h = n / w + 1;
        }

        if (n > 2) {
            System.out.print(((w-1)+(h-1))*2);
        } else {
            System.out.print(4);
        }
    }
}