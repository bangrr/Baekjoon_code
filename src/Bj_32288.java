import java.io.*;
import java.util.*;

public class Bj_32288 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        System.out.print(s.replaceAll("I","i").replaceAll("l","L"));
    }
}