import java.io.*;
import java.util.*;

public class Bj_33515 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        long k = Long.parseLong(st.nextToken());
        long n = Long.parseLong(st.nextToken());
        System.out.print(Math.min(k,n));
    }
}