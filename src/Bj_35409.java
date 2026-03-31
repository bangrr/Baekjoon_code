import java.io.*;
import java.util.*;

public class Bj_35409 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int time = h * 60 + m;
        boolean valid = (time >= 6 * 60 + 30 && time <= 9 * 60) ||
                (time >= 9 * 60 + 50 && time <= 10 * 60) ||
                (time >= 10 * 60 + 50 && time <= 11 * 60) ||
                (time >= 11 * 60 + 50 && time <= 12 * 60) ||
                (time >= 12 * 60 + 50 && time <= 13 * 60 + 50) ||
                (time >= 14 * 60 + 40 && time <= 14 * 60 + 50) ||
                (time >= 15 * 60 + 40 && time <= 15 * 60 + 50) ||
                (time >= 16 * 60 + 40 && time <= 22 * 60 + 50);

        System.out.print(valid ? "Yes" : "No");
    }
}