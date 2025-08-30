import java.io.*;
import java.util.*;

public class Bj_4766 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        double diff = 0;
        double a = Double.parseDouble(br.readLine());
        while (true) {
            double x = Double.parseDouble(br.readLine());
            if (x == 999) break;
            diff = x - a;
            sb.append(String.format("%.2f", diff)).append("\n");
            a = x;
        }
        System.out.print(sb);
    }
}