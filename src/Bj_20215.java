import java.io.*;
import java.util.*;

public class Bj_20215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        System.out.print(w+h-Math.sqrt(w*w+h*h));
    }
}