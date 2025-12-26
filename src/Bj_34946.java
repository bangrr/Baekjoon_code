import java.io.*;
import java.util.*;

public class Bj_34946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        if (a + b <= d) {
            if (c <= d) {
                System.out.print("~.~");
            } else {
                System.out.print("Shuttle");
            }
        } else {
            if (c <= d) {
                System.out.print("Walk");
            } else {
                System.out.print("T.T");
            }
        }
    }
}