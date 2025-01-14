import java.io.*;
import java.util.*;

public class Bj_33179 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            sum += (Integer.parseInt(st.nextToken())+1)/2;
        }
        System.out.print(sum);
    }
}
