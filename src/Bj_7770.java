import java.io.*;

public class Bj_7770 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int a = 1;
        int b = 1;
        int w = 1;
        while (true) {
            b += w * 4; // w층에 맨 아래층 최대 갯수 1=5, 2=13, 3=25, ...
            a += b; // w층일 때 전체 최대 갯수
            if (a > n) break;
            w++;
        }
        System.out.print(w);
    }
}