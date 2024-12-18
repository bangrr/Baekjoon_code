import java.io.*;
import java.util.*;

public class Bj_32969 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String s = br.readLine();
        if (s.contains("bigdata") || s.contains("public") || s.contains("society")) {
            System.out.print("public bigdata");
        } else {
            System.out.print("digital humanities");
        }
    }
}
