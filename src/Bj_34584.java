import java.io.*;
import java.util.*;

public class Bj_34584 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        if (x * 2 <= d) {
            System.out.print("double it");
        } else {
            System.out.print("take it");
        }
    }
}