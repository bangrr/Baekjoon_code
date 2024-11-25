import java.io.*;
import java.util.*;

public class Bj_32710 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        if (n==1) {
            System.out.print(1);
            return;
        }
        for (int i=2; i<=9; i++) {
            for (int j=1; j<=9; j++) {
                if (i*j==n) {
                    System.out.print(1);
                    return;
                }
            }
        }
        System.out.print(0);
    }
}