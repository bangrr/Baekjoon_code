/**********************************
 * 아직 문제를 해결하지 못한 코드입니다 *
 **********************************/

import java.io.*;
import java.util.*;

public class Bj_1647 {
    static class Node implements Comparable<Node> {
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

        int cnt = 1;
        int ans = 0;
        while(!pq.isEmpty()) {
            Node n = pq.poll();
            int to = n.to;
            int weight = n.weight;

            if (visited[to]) continue;
            visited[to] = true;
            if (cnt == v) break;
            cnt++;
            ans += weight;

            for (Node next : adjList[to]) {
                if (!visited[next.to]) pq.add(next);
            }
        }
        System.out.print(ans);
    }
}