import java.io.*;
import java.util.*;

public class Bj_33541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int x = Integer.parseInt(br.readLine());
        for (++x; x <= 9999; x++) {
            int a = x / 100;
            int b = x % 100;
            if (Math.pow((a+b), 2) == x) {
                System.out.print(x);
                return;
            }
        }
        System.out.print(-1);
    }
}