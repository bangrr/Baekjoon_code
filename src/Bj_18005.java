import java.io.*;
import java.util.*;

public class Bj_18005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        if (n % 2 == 1) {
            System.out.print(0);
        } else if (n % 4 == 0) {
            System.out.print(2);
        } else {
            System.out.print(1);
        }
    }
}