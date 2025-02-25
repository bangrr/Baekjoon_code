import java.io.*;
import java.util.*;

public class Bj_33534 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        long f = Long.parseLong(br.readLine());
        double r = Math.sqrt(f / Math.PI);
        System.out.printf("%.1f", Math.ceil(r * 2 * Math.PI * 10) / 10);
    }
}