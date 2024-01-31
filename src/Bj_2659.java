import java.io.*;
import java.util.*;
 
public class Bj_2659 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
		int[] arr = new int[10000];
		int su = 1;
		for (int i=1111; i<10000; i++) {
			if (i/1000 == 0 || i/100%10 == 0 || i/10%10 == 0 || i%10== 0 || arr[i] > 0) {
				continue;
			}
			int a = i;
			int b = i%1000*10+i/1000;
			int c = i%100*100+i/100;
			int d = i%10*1000+i/10;
			
			arr[a] = arr[b] = arr[c] = arr[d] = su++;
		}
		
		int n = Integer.parseInt(br.readLine().replaceAll(" ", ""));
		System.out.println(arr[n]);
	}
}