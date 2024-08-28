import java.io.*;
import java.util.*;

public class Bj_5523 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine()); //1~100
        int q=0,w=0;
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a > b) q++;
            else if (a < b) w++;
        }
        System.out.print(q + " " + w);
    }
}