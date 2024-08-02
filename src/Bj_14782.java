import java.io.*;
import java.util.*;

public class Bj_14782 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i=1; i<=n; i++) {
            if (n % i == 0) sum += i;
        }
        System.out.print(sum);
    }
}