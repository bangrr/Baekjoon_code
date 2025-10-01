import java.io.*;
import java.util.*;

public class Bj_27736 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int a = 0, b = 0, c = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());
            if (x == 1) a++;
            else if (x == -1) b++;
            else c++;
        }

        if ((n+1)/2 <= c) {
            System.out.print("INVALID");
        } else if (a > b) {
            System.out.print("APPROVED");
        } else {
            System.out.print("REJECTED");
        }
    }
}