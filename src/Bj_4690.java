import java.io.*;
import java.util.*;

public class Bj_4690 {
    // 입출력 메소드
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    // main 메소드
    public static void main(String[] args) throws IOException {
        for (int a=2; a<=100; a++) {
            for (int b=2; b<=a; b++) {
                for (int c=b; c<=a; c++) {
                    for (int d=c; d<=a; d++) {
                        if (Math.pow(a,3) == Math.pow(b,3)+Math.pow(c,3)+Math.pow(d,3))
                            sb.append(String.format("Cube = %d, Triple = (%d,%d,%d)\n",a,b,c,d));
                    }
                }
            }
        }
        System.out.print(sb);
    }
}