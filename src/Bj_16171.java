import java.io.*;
import java.util.*;

public class Bj_16171 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String s = br.readLine().replaceAll("[0-9]", "");
        System.out.print(s.contains(br.readLine()) ? 1 : 0);
    }
}