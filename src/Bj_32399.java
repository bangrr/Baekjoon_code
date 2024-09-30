import java.io.*;
import java.util.*;

public class Bj_32399 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String s = br.readLine();
        if (s.equals("(1)")) {
            System.out.print(0);
        } else if (s.equals(")1(")) {
            System.out.print(2);
        } else {
            System.out.print(1);
        }
    }
}