import java.io.*;
import java.util.*;

public class Bj_27240 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        if (a < s && s < b && a < t && t < b) {
            System.out.print("City");
        } else if (s <= a && t <= a || s >= b && t >= b) {
            System.out.print("Outside");
        } else {
            System.out.print("Full");
        }
    }
}
