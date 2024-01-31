import java.io.*;
import java.util.*;
 
public class Bj_18222 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
		long k = Long.parseLong(br.readLine());
        long d=1;
//(i % 2 == 0) d=1 4 16 64 ... 일때 k = (d-k+1) 의 반대
//(i % 2 == 1) d=2 8 32 ... 일때 k = (d-k+1)
        int m = 0;
        while (d <= k) {
            d<<=1;
            m++;
        }
        d>>=1;
        m--;
 
//System.out.println("m : "+ m);
//System.out.println("d : "+ d);
        boolean flag = true;
        for (int i=m; i >= 0; i--) {
			if (k > d) {
 
				if (i%2==0) { flag = flag ? false : true; }
                k = Math.min(k, d - (k-d) +1);
			}
			d /= 2;
//System.out.println(k +" "+ d);
		}
        //0110 1001 1001 0110 1001 0110 0110 1001
        //System.out.println(k +" "+ flag);
        System.out.print(flag ? 0 : 1);
	}
}