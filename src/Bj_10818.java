import java.io.*;
import java.util.*;

public class Bj_10818 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int max = -1000000;
		int min = 1000000;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			if (max < tmp) {
				max = tmp;
			}
			if (min > tmp){
				min = tmp;
			}
		}
		System.out.print(min + " " + max);
	}
}