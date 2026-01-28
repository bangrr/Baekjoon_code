import java.io.*;
import java.util.*;

public class Bj_25024 {
    static String YES = "Yes";
    static String NO = "No";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            String timeStr = validateTime(x, y);
            String dateStr = validateDate(x, y);
            sb.append(timeStr).append(" ").append(dateStr).append("\n");
        }
        System.out.print(sb);
    }

    private static String validateTime(int x, int y) {
        if (x >= 0 && x <= 23 && y >= 0 && y <= 59) return YES;
        else return NO;
    }

    private static String validateDate(int x, int y) {
        if (x == 2) {
            if (y >= 1 && y <= 29) return YES;
        } else if (x == 4 || x == 6 || x == 9 || x == 11) {
            if (y >= 1 && y <= 30) return YES;
        } else if (x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12) {
            if (y >= 1 && y <= 31) return YES;
        }
        return NO;
    }
}