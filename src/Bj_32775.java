import java.io.*;
import java.util.*;

public class Bj_32775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int s = Integer.parseInt(br.readLine());
        int f = Integer.parseInt(br.readLine());
        System.out.print(s <= f ? "high speed rail" : "flight");
    }
}