import java.io.*;
import java.util.*;

public class Bj_32278 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        long n = Long.parseLong(br.readLine());
        if (-32768 <= n && n <= 32767) System.out.print("short");
        else if (-2147483648 <= n && n <= 2147483647) System.out.print("int");
        else System.out.print("long long");
    }
}