import java.io.*;
import java.util.*;

public class Bj_32929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        char[] arr = new char[]{'U','O','S'};
        System.out.print(arr[(n-1)%3]);
    }
}
