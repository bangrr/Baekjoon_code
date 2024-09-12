import java.io.*;
import java.util.*;

public class Bj_32217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = (Integer.parseInt(br.readLine()) - 1) * 180;
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            n -= (Integer.parseInt(st.nextToken()) * 2);
        }
        System.out.print(n);
    }
}