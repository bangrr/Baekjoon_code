import java.io.*;
import java.util.*;

public class Bj_14623 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        long i1 = Long.parseLong(br.readLine(), 2);
        long i2 = Long.parseLong(br.readLine(), 2);
        System.out.print(Long.toBinaryString(i1*i2));
    }
}