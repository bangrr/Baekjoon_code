import java.io.*;
import java.util.*;

public class Bj_14582 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int[] teamA = new int[10];
        int[] teamB = new int[10];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < 10; i++) {
            int scoreA = Integer.parseInt(st.nextToken());
            teamA[i] = teamA[i-1] + scoreA;
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < 10; i++) {
            int scoreB = Integer.parseInt(st.nextToken());
            teamB[i] = teamB[i-1] + scoreB;
        }
        boolean upper = false;
        for (int i = 1; i < 10; i++) {
            if (teamA[i] > teamB[i - 1]) {
                upper = true;
                break;
            }
        }
        System.out.print(upper ? "Yes" : "No");
    }
}