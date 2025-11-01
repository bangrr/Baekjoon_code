import java.io.*;
import java.util.*;

public class Bj_21354 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()) * 7;
        int p = Integer.parseInt(st.nextToken()) * 13;
        System.out.print(a > p ? "Axel" : a < p ? "Petra" : "lika");
    }
}