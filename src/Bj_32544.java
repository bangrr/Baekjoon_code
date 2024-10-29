import java.io.*;
import java.util.*;

public class Bj_32544 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        long n = Long.parseLong(br.readLine());
        long h = 2;
        long sum = 3;
        while (sum <= n) {
            h++;
            sum += h;
        }
        System.out.print(h-1);
    }
}