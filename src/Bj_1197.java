import java.io.*;
import java.util.*;

public class Bj_1197 {
    private static class Node implements Comparable<Node> {
        int to, weight;

        public Node(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node o) {
            return weight - o.weight;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        boolean[] visited = new boolean[v+1];
        ArrayList<Node>[] adjList = new ArrayList[v+1];
        for (int i=1; i<=v; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            adjList[a].add(new Node(b, c));
            adjList[b].add(new Node(a, c));
        }

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(1,0));

        int ans = 0;
        while(!pq.isEmpty()) {
            Node n = pq.poll();
            int to = n.to;
            int weight = n.weight;

            if (visited[to]) continue;
            visited[to] = true;
            ans += weight;

            for (Node next : adjList[to]) {
                if (!visited[next.to]) pq.add(next);
            }
        }
        System.out.print(ans);
    }
}
/*
n개의 정점을 가지는 그래프는 반드시 n-1 개의 간선만 사용해야 한다
간선의 가중치들의 합이 최소여야 한다
사이클이면 안된다

최소신장트리는 그래프에서 1개가 아니고 여러개일수있다
 */