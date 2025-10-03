import java.io.*;
import java.util.*;

public class Bj_34543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int w = Integer.parseInt(br.readLine());
        int sum = n * 10;
        if (n >= 3) {
            sum += 20;
        }
        if (n >= 5) {
            sum += 50;
        }
        if (w > 1000) {
            sum -= 15;
        }
        System.out.print(Math.max(0, sum));
    }
}