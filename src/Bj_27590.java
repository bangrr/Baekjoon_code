import java.io.*;
import java.util.*;

public class Bj_27590 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int ds = -Integer.parseInt(st.nextToken());
		int ys = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int dm = -Integer.parseInt(st.nextToken());
		int ym = Integer.parseInt(st.nextToken());
		
		while (ds != dm) {
			if (ds < dm) {
				ds += ys;
			} else if (ds > dm) {
				dm += ym;
			}
		}
		System.out.print(ds);
	}
}