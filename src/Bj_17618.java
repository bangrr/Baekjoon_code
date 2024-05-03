import java.io.*;
import java.util.*;

public class Bj_17618 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i=1; i<=n; i++) {
            int t = i;
            int m = 0;
            while (t > 0) {
                m += t%10;
                t /= 10;
            }
            if (i%m==0) sum++;
        }
        System.out.print(sum);
    }
}