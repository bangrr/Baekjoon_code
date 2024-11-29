import java.io.*;
import java.util.*;

public class Bj_16972 {
    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        List<Point> points = new ArrayList<>();

        int ans = 626;
        int dis = (int) (ans * Math.sqrt(3));

        int cx, cy;

        for (cy = -8140; cy <= 8140; cy += ans) {
            for (cx = -8140; cx <= 8140; cx += dis) {
                points.add(new Point(cx, cy));
            }
        }

        int ny = -8140 + ans/2;
        int nx = -8140 + dis/2;

        for (cy = ny; cy <= 8140; cy += ans) {
            for (cx = nx; cx <= 8140; cx += dis) {
                points.add(new Point(cx, cy));
            }
        }

        for (int i=0; i<813; i++) { // 814개만 출력
            sb.append(points.get(i).x).append(" ").append(points.get(i).y).append("\n");
        }
        sb.append(7579).append(" ").append(7824);
        System.out.print(sb);
//        System.out.println("생성된 좌표의 수: " + points.size());
    }
}