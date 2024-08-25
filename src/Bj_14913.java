import java.io.*;
import java.util.*;

public class Bj_14913 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a == c) {
            System.out.print(1);
        } else if ((c-a)%b == 0 && (c-a)/b > 0) {
            System.out.print((c-a)/b+1);
        } else {
            System.out.print("X");
        }
    }
}