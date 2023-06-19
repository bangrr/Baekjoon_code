import java.io.*;
import java.util.*;

public class Bj_21316 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static ArrayList<Integer>[] edge, list;
	static ArrayList<Integer> start = new ArrayList<>();
	static ArrayList<Integer> end = new ArrayList<>();
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		bfs();
		System.out.print(sb.toString());
	}
	
	// 입력부
	static void input() throws IOException {
		edge = new ArrayList[13];
		list = new ArrayList[13];
		for (int i=1; i<=12; i++) {
			edge[i] = new ArrayList<>();
			list[i] = new ArrayList<>();
		}
		
		for (int i=1; i<=12; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			edge[a].add(b);
			edge[b].add(a);
		}
		
//		for (int i=1; i<=12; i++) {
//			for (int j=0; j<edge[i].size(); j++) {
//				System.out.print(edge[i].get(j) + " " );				
//			}
//			System.out.println();
//		}
		
		for (int i=1; i<=12; i++) {
			if (edge[i].size() == 3) {
				start.add(i);
			} else if (edge[i].size() == 1) {
				end.add(i);
			}
		}
	}
	
	// 문제해결
	static void bfs() {
		for (int candS : start) { // 출발지 후보들
//			System.out.print(candS + " -> ");
			
			for (int candE : end) {
				Queue<Integer> q = new LinkedList<>(); // bfs를 위한 큐
				boolean[] visited = new boolean[13]; // 방문체크
				int[] dist = new int[13]; // 거리정보
				Arrays.fill(dist, -1);
				
				q.add(candS);
				visited[candS] = true;
				dist[candS] = 0;
//				System.out.print(candE + " ");
				while (!q.isEmpty()) {
					int cur = q.poll();
					for (int next : edge[cur]) {
						if (visited[next]) {
							continue; // 이미 방문했다면 무시
						}
						
						q.add(next); // 다음 간선 번호를 큐에 넣음
						visited[next] = true; // 방문체크
						dist[next] = dist[cur] + 1; // 거리 정보
						
						if (next == candE) {
							list[candS].add(dist[next]); // candS to candE 거리 정보를 저장
							break; // 목적지에 도달했다면 빠져나감
						}
					}
				}
			}
//			System.out.println();
			Collections.sort(list[candS]);
			for (int i=0; i<list[candS].size(); i++) {
//				System.out.print(list[candS].get(i));
			}
//			System.out.println();
			if (list[candS].get(0) == 1 && list[candS].get(3) == 5) {
//				System.out.print(candS);
				sb.append(candS);
				return;
			}
		}
	}
}