import java.io.*;
import java.util.*;

public class Bj_2606 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int v = Integer.parseInt(br.readLine()); // 정점갯수 (컴퓨터 수)
		int e = Integer.parseInt(br.readLine()); // 간선갯수 (연결선 수)
		// 시작 정점은 1로 고정이다.
		
		// 간선정보 입력받기
		ArrayList<Integer>[] edge = new ArrayList[v+1];
		for (int i=1; i<=v; i++) {
			edge[i] = new ArrayList<>();
		}
		while (e-- > 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			edge[a].add(b);
			edge[b].add(a);
		}
		// 오르락내리락 정렬은 필요 없음
		
		// BFS 돌리기
		Queue<Integer> q = new LinkedList<>(); // BFS를 위한 큐
		boolean[] visited = new boolean[v+1]; // 방문체크를 위한 boolean 배열
		
		q.add(1); // 시작 정점을 큐에 넣는다
		visited[1] = true; // 시작 정점을 방문체크한다
		int virus = 0; // 시작 정점인 1을 제외한 감염체들을 카운트한다.
		
		while (!q.isEmpty()) { // 큐가 비어있지 않는 동안
			int cur = q.poll(); // 큐의 맨 앞에 있는 숫자를 꺼내고
			for (int next : edge[cur]) { // 정점 cur에 연결된 간선 수 만큼 돌면서
				if (!visited[next]) { // 방문을 하지 않았으면
					q.add(next); // 정점 next를 큐의 맨 뒤에 추가하고
					visited[next] = true; // 정점 next를 방문처리하고
					virus++; // 감염체 숫자를 하나 늘린다.
				}
			}
		}
		System.out.print(virus);
	}
}