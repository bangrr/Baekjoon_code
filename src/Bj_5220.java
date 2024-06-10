import java.io.*;
import java.util.*;

public class Bj_5220 {
    private static boolean solveErrorDetection(int value, int checkbit) {
        boolean valid;

        String s = Integer.toString(value, 2);
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') cnt++;
        }

        if (cnt % 2 == 0) {
            valid = 0 == checkbit;
        } else {
            valid = 1 == checkbit;
        }

        return valid;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int numCases = Integer.parseInt(br.readLine());

        for(int i = 0; i < numCases; i++)
        {
            st = new StringTokenizer(br.readLine());

            int value = Integer.parseInt(st.nextToken());
            int checkbit = Integer.parseInt(st.nextToken());

            if (solveErrorDetection(value, checkbit)) {
                sb.append("Valid\n");
            }
            else {
                sb.append("Corrupt\n");
            }
        }
        System.out.print(sb);
    }
}
