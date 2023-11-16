import java.io.*;
import java.util.*;

public class Bj_2669 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		boolean[][] arr = new boolean[100][100];
		for (int i=0; i<4; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			for (int x=x1; x<x2; x++) {
				for (int y=y1; y<y2; y++) {
					arr[y][x] = true;
				}
			}
		}
		int cnt = 0;
		for (int x=0; x<100; x++) {
			for (int y=0; y<100; y++) {
				if (arr[y][x]) cnt++;
			}
		}
		System.out.print(cnt);
	}
}