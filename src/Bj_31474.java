import java.io.*;
import java.util.*;

public class Bj_31474 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        long a = 1;
        for (int i=1; i<n; i+=2) {
            a *= i;
        }
        System.out.print(a);
    }
}