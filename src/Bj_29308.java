import java.io.*;
import java.util.*;

public class Bj_29308 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int max = 0;
        String ans = "";
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            String citizenship = st.nextToken();
            if (Objects.equals("Russia", citizenship)) {
                if (max < a) {
                    max = a;
                    ans = name;
                }
            }
        }
        System.out.print(ans);
    }
}