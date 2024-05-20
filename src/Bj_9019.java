import java.io.*;
import java.util.*;

public class Bj_9019 {
    static class Register {
        int num;
        String str;

        public Register(int num, String str) {
            this.num = num;
            this.str = str;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            // a -> b; 최소명령수 (여러답이 있을 수 있다)

            Queue<Register> q = new LinkedList<>();
            boolean[] visited = new boolean[10000];
            q.add(new Register(a, ""));

            while (!q.isEmpty()) {
                Register r = q.poll();
                if (r.num == b) {
                    sb.append(r.str).append("\n");
                    break;
                }

                int next = comD(r.num);
                if (!visited[next]) {
                    q.add(new Register(next, r.str+"D"));
                    visited[next] = true;
                }

                next = comS(r.num);
                if (!visited[next]) {
                    q.add(new Register(next, r.str+"S"));
                    visited[next] = true;
                }

                next = comL(r.num);
                if (!visited[next]) {
                    q.add(new Register(next, r.str+"L"));
                    visited[next] = true;
                }

                next = comR(r.num);
                if (!visited[next]) {
                    q.add(new Register(next, r.str+"R"));
                    visited[next] = true;
                }
            }
        }
        System.out.print(sb);
    }

    private static int comD(int rNum) {
//        D : D는 n을 두배로 바꾼다. n = n * 2;
//        결과가 9999보다 큰 경우 n = n % 10000;
//        n * 2 % 10000 그 결과값을 레지스터에 저장한다.

        return rNum * 2 % 10000;
    }

    private static int comS(int rNum) {
//        S : S는 n에서 1을 뺀 결과 n-1을 레지스터에 저장한다.
//        n이 0이라면 9999가 저장된다

        return rNum == 0 ? 9999 : rNum - 1;
    }

    private static int comL(int rNum) {
//        L : L은 n의 각 자릿수를 <<왼쪽으로 회전시켜 레지스터에 저장한다
//        ex) d1 d2 d3 d4 -> d2 d3 d4 d1

        String rNumStr = String.valueOf(rNum);

        String nNumStr = "0".repeat(4-rNumStr.length()) + rNumStr;
        nNumStr = nNumStr.substring(1) + nNumStr.charAt(0);

        return Integer.parseInt(nNumStr);
    }

    private static int comR(int rNum) {
//        R : R은 n의 각 자릿수를 >>오른쪽으로 회전시켜 레지스터에 저장한다
//        ex) d1 d2 d3 d4 -> d4 d1 d2 d3

        String rNumStr = String.valueOf(rNum);

        String nNumStr = "0".repeat(4-rNumStr.length()) + rNumStr;
        nNumStr = nNumStr.charAt(nNumStr.length()-1) + nNumStr.substring(0, nNumStr.length()-1);

        return Integer.parseInt(nNumStr);
    }
}