import java.io.*;
import java.util.*;

public class Bj_2909 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int k = (int) Math.pow(10, Integer.parseInt(st.nextToken()));
        System.out.println(Math.round((double)c / k) * k);
    }
}