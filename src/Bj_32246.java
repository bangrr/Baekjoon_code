import java.io.*;
import java.util.*;

public class Bj_32246 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        if (n == 2) {
            System.out.print(3);
        } else {
            System.out.print(n);
        }
    }
}