import java.io.*;
import java.util.*;

public class Bj_24296 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        while (true) {
            if (n % 2 == 0) {
                break;
            } else {
                n = n / 2 + 1;
            }
        }
        System.out.print(n);
    }
}