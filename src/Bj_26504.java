import java.io.*;
import java.util.*;

public class Bj_26504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String str = "Episode      Episode Title      Release Date\n" +
                "------- ----------------------- ------------\n" +
                "IV      A New Hope                  1977\n" +
                "V       The Empire Strikes Back     1980\n" +
                "VI      Return of the Jedi          1983\n" +
                "I       The Phantom Menace          1999\n" +
                "II      Attack of the Clones        2002\n" +
                "III     Revenge of the Sith         2005\n" +
                "VII     The Force Awakens           2015";

        // ascii 배열 구하기
        int len = str.length();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = str.charAt(i);
        }

        for (int i = 0; i < len; i++) {
            String s = Integer.toString(arr[i], 2);
            sb.append("   ");
            for (int j = 0; j < s.length(); j++) {
                sb.append(s.charAt(j) == '1' ? "\t" : " ");
            }
            sb.append("\n");
            sb.append("\t\n  ");
        }
        System.out.print(sb);
    }
}