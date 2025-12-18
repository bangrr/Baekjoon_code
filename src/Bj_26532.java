import java.io.*;
import java.util.*;

public class Bj_26532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int width = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());
        int area = width * height;
        int by = 4840 * 5;
        System.out.print(area % by == 0 ? area / by : area / by + 1);
    }
}