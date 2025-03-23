import java.io.*;
import java.util.*;

public class Bj_33631 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int fs = Integer.parseInt(st.nextToken());
        int cs = Integer.parseInt(st.nextToken());
        int es = Integer.parseInt(st.nextToken());
        int bs = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int fn = Integer.parseInt(st.nextToken());
        int cn = Integer.parseInt(st.nextToken());
        int en = Integer.parseInt(st.nextToken());
        int bn = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int q = Integer.parseInt(br.readLine());
        while (q-- > 0) {
            st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken());
            int i = Integer.parseInt(st.nextToken());
            if (c == 1) {
                if (fn * i <= fs && cn * i <= cs && en * i <= es && bn * i <= bs) {
                    fs -= fn * i;
                    cs -= cn * i;
                    es -= en * i;
                    bs -= bn * i;
                    cnt += i;
                    sb.append(cnt).append("\n");
                } else {
                    sb.append("Hello, siumii\n");
                }
            } else if (c == 2) {
                fs += i;
                sb.append(fs).append("\n");
            } else if (c == 3) {
                cs += i;
                sb.append(cs).append("\n");
            } else if (c == 4) {
                es += i;
                sb.append(es).append("\n");
            } else {
                bs += i;
                sb.append(bs).append("\n");
            }
        }
        System.out.print(sb);
    }
}