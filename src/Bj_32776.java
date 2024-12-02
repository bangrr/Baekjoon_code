import java.io.*;
import java.util.*;

public class Bj_32776 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int s = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        System.out.print(s <= 240 || s <= a+f+b ? "high speed rail" : "flight");
    }
}