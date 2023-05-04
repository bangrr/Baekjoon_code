import java.io.*;
import java.util.*;

public class Bj_1996 {
	static StringBuilder sb;
	static int N;
	static char[][] map;
	static int R, C;
	static int[] dy = {-1, -1, -1, 0, 1, 1, 1, 0};
	static int[] dx = {-1, 0, 1, 1, 1, 0, -1, -1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// N*N 크기 map 입력받기
		N = Integer.parseInt(br.readLine());
		map = new char[N][N];
		
		Queue<Integer> q = new LinkedList<>();
		for (R=0; R<N; R++) {
			String tmp = br.readLine();
			for (C=0; C<N; C++) {
				if (tmp.charAt(C) == '.') {
					map[R][C] = '0';
				} else {
					map[R][C] = '*';
					q.add(tmp.charAt(C)-48);
				}
			}
		}
		
//		mapChk();
		
		// map 다시 돌면서 확인하기
		for (R=0; R<N; R++) {
			for (C=0; C<N; C++) {
				if(map[R][C] == '*') {
					int mine = q.poll();
					for (int i=0; i<8; i++) {
						int nextR = R + dy[i];
						int nextC = C + dx[i];
						if (nextR < 0 || nextR >= N || nextC < 0 || nextC >= N || map[nextR][nextC] == '*' || map[nextR][nextC] == 'M') {
							continue;
						}
//						System.out.print("[" + nextR + "," + nextC + "] " + mine + " ");
//						System.out.println((int)map[nextR][nextC]-48 + mine);
						if ((int)((map[nextR][nextC]-48) + mine) > 9) {
							map[nextR][nextC] = 'M';
						} else {
							map[nextR][nextC] = (char)((int)map[nextR][nextC] + mine);
						}
					}
//					System.out.println();
				}
//				System.out.println("q size " + q.size());
			}
		}
		mapChk();
		System.out.print(sb.toString());
	}
	
	static void mapChk() {
		sb = new StringBuilder();
		// map 출력
		for (R=0; R<N; R++) {
			for (C=0; C<N; C++) {
				sb.append(map[R][C]);
			}
			sb.append("\n");
		}
	}
}