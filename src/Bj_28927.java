import java.io.*;
import java.util.*;

public class Bj_28927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int abc = a*3+b*20+c*120;
        st = new StringTokenizer(br.readLine());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
        int def = d*3+e*20+f*120;
        System.out.print(abc > def ? "Max" : abc < def ? "Mel" : "Draw");
    }
}