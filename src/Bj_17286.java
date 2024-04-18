import java.io.*;
import java.util.*;

public class Bj_17286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int[] xx = new int[3];
        int[] yy = new int[3];
        double sum = 1024;
        for (int i=0; i<3; i++) {
            st = new StringTokenizer(br.readLine());
            xx[i] = Integer.parseInt(st.nextToken());
            yy[i] = Integer.parseInt(st.nextToken());
        }
        double d = 0;
        double[] arr = new double[6];
        for (int i=0; i<3; i++) {
            boolean[] chk = new boolean[3];
            d = Math.sqrt(((x-xx[i])*(x-xx[i])) + ((y-yy[i])*(y-yy[i])));
            arr[i*2] += d;
            arr[i*2+1] += d;
            chk[i] = true;
            int tmp = 0;
            for (int j=0; j<3; j++) {
                if (chk[j]) continue;
                d = Math.sqrt(((xx[i]-xx[j])*(xx[i]-xx[j])) + ((yy[i]-yy[j])*(yy[i]-yy[j])));
                arr[i*2+tmp] += d;
                chk[j] = true;
                for (int k=0; k<3; k++) {
                    if (chk[k]) continue;
                    d = Math.sqrt(((xx[j]-xx[k])*(xx[j]-xx[k])) + ((yy[j]-yy[k])*(yy[j]-yy[k])));
                    arr[i*2+tmp] += d;
                }
                tmp++;
                chk[j] = false;
            }
            chk[i] = false;
        }
        for (double a : arr) {
            sum = Math.min(sum, a);
        }
        System.out.print((int)sum);
    }
}