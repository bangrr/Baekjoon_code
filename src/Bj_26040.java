import java.io.*;
import java.util.*;

public class Bj_26040 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String s = br.readLine();
        String[] arr = br.readLine().split(" ");

        for (int i = 0; i < arr.length; i++) {
            s = s.replaceAll(arr[i], arr[i].toLowerCase());
        }
        System.out.print(s);
    }
}