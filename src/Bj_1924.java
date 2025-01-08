import java.io.*;
import java.time.LocalDateTime;
import java.util.*;

public class Bj_1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        LocalDateTime dt = LocalDateTime.of(2007, x, y, 0, 0);
        System.out.print(dt.getDayOfWeek().toString().substring(0, 3));
    }
}
