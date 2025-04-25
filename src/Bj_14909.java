import java.io.*;
import java.util.*;

public class Bj_14909 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int cnt = 0;
        while (st.hasMoreTokens()) {
            if (Integer.parseInt(st.nextToken()) > 0) cnt++;
        }
        System.out.print(cnt);
    }
}