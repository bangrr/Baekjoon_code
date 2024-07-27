import java.io.*;
import java.util.*;

public class Bj_28732 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long d = Long.parseLong(st.nextToken());

//        for (int i=1; i<=n; i++) {
//            for (int j=1; j<=n; j++) {
//                if (Math.abs(a-i) + Math.abs(b-j) == d) {
//                    cnt++;
//                }
//            }
//        }
        //max = d * 4
//        543211234567899876
//        679013703432097408

        System.out.println((a+d)-n);
        long aa = (a+d)-n > 0 ? ((a+d)-n)*2-1 : 0;
        System.out.println(1-(a-d));
        long bb = 1-(a-d) > 0 ? (1-(a-d))*2-1 : 0;
        System.out.println((b+d)-n);
        long cc = (b+d)-n > 0 ? ((b+d)-n)*2-1 : 0;
        System.out.println(1-(b-d));
        long dd = 1-(b-d) > 0 ? (1-(b-d))*2-1 : 0;
        System.out.println(d*4);
        System.out.println(aa);
        System.out.println(bb);
        System.out.println(cc);
        System.out.println(dd);
        System.out.print(d*4 - aa - bb - cc - dd);
    }
}