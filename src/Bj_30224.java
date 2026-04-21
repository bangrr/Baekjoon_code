import java.io.*;
import java.util.*;

public class Bj_30224 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = String.valueOf(n);
        if (s.contains("7")) {
            if (n % 7 == 0) {
                System.out.print(3);
            } else {
                System.out.print(2);
            }
        } else {
            if (n % 7 == 0) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
        }
    }
}