import java.io.*;
import java.util.*;

public class Bj_24468 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int L = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        int[] S = new int[N+1];
        char[] C = new char[N+1];
        for (int i=1; i<=N; i++) {
            st = new StringTokenizer(br.readLine());
            S[i] = Integer.parseInt(st.nextToken());
            C[i] = st.nextToken().charAt(0);

        }
        int cnt = 0;
        while (T-- > 0) {
            int[] box = new int[L+1];
            int[][] ball = new int[L+1][2];
            for (int i=1; i<=N; i++) {
                move(S, i, C);

                int cur = S[i];
                if (box[cur] == 0) {
                    ball[cur][0] = i;
                    box[cur] = 1;
                } else if (box[cur] == 1) {
                    ball[cur][1] = i;
                    box[cur] = 2;
                }

                if (cur == 0 || cur == L) {
                    turn(C, i);
                }

                if (box[cur] == 2) {
                    cnt++;
                    turn(C, ball[cur][0]);
                    turn(C, ball[cur][1]);
                }
            }
        }
        System.out.print(cnt);
    }

    private static void move(int[] S, int i, char[] C) {
        S[i] = S[i] + (C[i] == 'L' ? -1 : 1);
    }

    private static void turn(char[] C, int i) {
        C[i] = (C[i] == 'L' ? 'R' : 'L');
    }
}