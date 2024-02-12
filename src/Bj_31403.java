import java.io.*;
import java.util.*;

public class Bj_31403 {
    // 입출력 메소드
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    // main 메소드
    public static void main(String[] args) throws IOException {
        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();
        System.out.println(Integer.parseInt(a)+Integer.parseInt(b)-Integer.parseInt(c));
        System.out.println(Integer.parseInt(a+b)-Integer.parseInt(c));
    }
}