import java.io.*;
import java.util.*;

public class Bj_32685 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String a = Integer.toBinaryString(Integer.parseInt(br.readLine()));
        String b = Integer.toBinaryString(Integer.parseInt(br.readLine()));
        String c = Integer.toBinaryString(Integer.parseInt(br.readLine()));

        sb.append("0".repeat(Math.max(0, 4-a.length()))).append(a.substring(Math.max(0, a.length()-4)));
        sb.append("0".repeat(Math.max(0, 4-b.length()))).append(b.substring(Math.max(0, b.length()-4)));
        sb.append("0".repeat(Math.max(0, 4-c.length()))).append(c.substring(Math.max(0, c.length()-4)));

        String n = String.valueOf(Integer.parseInt(sb.toString(), 2));
        System.out.print("0".repeat(Math.max(0, 4-n.length())) + n);
    }
}