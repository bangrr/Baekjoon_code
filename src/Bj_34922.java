import java.io.*;
import java.util.*;

public class Bj_34922 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(br.readLine());
        System.out.print(w * h - Math.PI * r * r / 4);
    }
}