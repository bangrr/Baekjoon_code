import java.io.*;
import java.util.*;

public class Bj_22966 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[5];
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int a = Integer.parseInt(st.nextToken());
            arr[a] = s;
        }
        for (int i = 0; i < 5; i++) {
            if (arr[i] != null) {
                System.out.print(arr[i]);
                return;
            }
        }
    }
}