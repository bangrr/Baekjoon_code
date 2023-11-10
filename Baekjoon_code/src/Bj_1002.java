import java.io.*;
import java.util.*;
 
public class Bj_1002 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
 
            int dx = x2-x1;
            int dy = y2-y1;
            double d = Math.sqrt(dx*dx + dy*dy);
 
            if (x1==x2 && y1==y2 && r1==r2) {
                System.out.println(-1);
            } else if (r1+r2<d) {
                System.out.println(0);
            } else if (r1+r2==d) {
                System.out.println(1);
            } else if (r1+r2>d) {
                if (Math.abs(r1-r2)==d) {
                    System.out.println(1);
                } else if (Math.abs(r1-r2) > d) {
                    System.out.println(0);
                } else {
                    System.out.println(2);
                }
            }
        }
	}
}