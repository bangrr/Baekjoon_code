import java.io.*;
import java.util.*;

public class Bj_1358 {
    static int w, h, x, y, p;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        w = Integer.parseInt(st.nextToken());//100보다 작거나 같은 자연수
        h = Integer.parseInt(st.nextToken());//100보다 작거나 같은 자연수, 짝수
        x = Integer.parseInt(st.nextToken());//절댓값이 100보다 작거나 같은 정수
        y = Integer.parseInt(st.nextToken());//절댓값이 100보다 작거나 같은 정수
        p = Integer.parseInt(st.nextToken());//최대 50인 선수의 수

        int cnt = 0;
        for (int i=0; i<p; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (cond1(a, b) || cond2(a, b) || cond3(a, b)) cnt++;
        }
        System.out.print(cnt);
    }

    private static boolean cond1(int a, int b) {
        return (x <= a && a <= x + w) && (y <= b && b <= y + h);
    }

    private static boolean cond2(int a, int b) {
        return Math.pow(x-a, 2) + Math.pow((y+h/2)-b, 2) <= Math.pow(h/2, 2);
    }

    private static boolean cond3(int a, int b) {
        return Math.pow((x+w)-a, 2) + Math.pow(y+h/2-b, 2) <= Math.pow(h/2, 2);
    }
}