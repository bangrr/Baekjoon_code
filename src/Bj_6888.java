import java.io.*;
import java.util.*;

public class Bj_6888 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        for (int i = x; i <= y; i+=60) {
            System.out.println("All positions change in year " + i);
        }
    }
}