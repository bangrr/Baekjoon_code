import java.io.*;
import java.util.*;

public class Bj_33868 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int max = 0;
        int min = 2147483647;
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            max = Math.max(max, Integer.parseInt(st.nextToken()));
            min = Math.min(min, Integer.parseInt(st.nextToken()));
        }
        System.out.print(max*min%7+1);
    }
}