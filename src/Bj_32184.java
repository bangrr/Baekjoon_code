import java.io.*;
import java.util.*;

public class Bj_32184 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int a = 0;
        if (s%2==0) {
            a++; s++;
        }
        if (e%2==1) {
            a++;
        }
        System.out.print(a+(e-s+1)/2);
    }
}