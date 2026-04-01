import java.io.*;
import java.util.*;

public class Bj_21197 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        if (n % 2 == 1) {
            System.out.print("still running");
        } else {
            int sum = 0;
            for (int i = 0; i < n; i += 2) {
                int a = Integer.parseInt(br.readLine());
                int b = Integer.parseInt(br.readLine());
                sum += (b - a);
            }
            System.out.print(sum);
        }
    }
}