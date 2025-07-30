import java.io.*;
import java.util.*;

public class Bj_34073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            String s = st.nextToken();
            sb.append(s).append("DORO").append(" ");
        }
        System.out.print(sb);
    }
}