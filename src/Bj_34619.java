import java.io.*;
import java.util.*;

public class Bj_34619 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        for (int i=1; i<=a; i++) {
            for (int j=1; j<=b; j++) {
                for (int k=1; k<=c; k++) {
                    d--;
                    if (d == 0) {
                        System.out.print(i + " " + j);
                        return;
                    }
                }
            }
        }
    }
}