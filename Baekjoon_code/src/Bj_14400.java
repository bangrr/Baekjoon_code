import java.io.*;
import java.util.*;
 
public class Bj_14400 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] xlist = new int[n];
        int[] ylist = new int[n];
        long xsum = 0, ysum = 0;
        long xavg = 0, yavg = 0;
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            xsum += (xlist[i] = Integer.parseInt(st.nextToken()));
            ysum += (ylist[i] = Integer.parseInt(st.nextToken()));
        }
        xavg=xsum/n; yavg=ysum/n;
        long xans = Long.MAX_VALUE, yans = Long.MAX_VALUE, tmp;
        for (long i=xavg; i>-1000001; i--) {
            tmp = 0;
            for (int j=0; j<n; j++) {
                tmp += Math.abs(xlist[j]-i);
            }
            if (xans<=tmp) {
                break;
            }
            xans = Math.min(xans, tmp);
        }
        for (long i=yavg; i>-1000001; i--) {
            tmp = 0;
            for (int j=0; j<n; j++) {
                tmp += Math.abs(ylist[j]-i);
            }
            if (yans<=tmp) {
                break;
            }
            yans = Math.min(yans, tmp);
        }
        for (long i=xavg+1; i<1000001; i++) {
            tmp = 0;
            for (int j=0; j<n; j++) {
                tmp += Math.abs(xlist[j]-i);
            }
            if (xans<=tmp) {
                break;
            }
            xans = Math.min(xans, tmp);
        }
        for (long i=yavg+1; i<1000001; i++) {
            tmp = 0;
            for (int j=0; j<n; j++) {
                tmp += Math.abs(ylist[j]-i);
            }
            if (yans<=tmp) {
                break;
            }
            yans = Math.min(yans, tmp);
        }
        System.out.print(xans+yans);
	}
}