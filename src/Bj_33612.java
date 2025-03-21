import java.io.*;
import java.util.*;

public class Bj_33612 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        if (n == 1) {
            System.out.print("2024 8");
        } else if (n == 2) {
            System.out.print("2025 3");
        } else if (n == 3) {
            System.out.print("2025 10");
        } else if (n == 4) {
            System.out.print("2026 5");
        } else {
            System.out.print("2026 12");
        }
    }
}