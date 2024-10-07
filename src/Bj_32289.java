import java.io.*;
import java.util.*;

public class Bj_32289 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        System.out.print((n-1)*m + n*(m-1) + (n-1)*(m-1)*2);
    }
}