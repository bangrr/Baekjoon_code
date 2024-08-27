import java.io.*;
import java.util.*;

public class Bj_20232 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String[] arr = new String[]{
                "ITMO", "SPbSU", "SPbSU", "ITMO", "ITMO",
                "SPbSU", "ITMO", "ITMO", "ITMO", "ITMO",
                "ITMO", "PetrSU, ITMO", "SPbSU", "SPbSU", "ITMO",
                "ITMO", "ITMO", "ITMO", "SPbSU", "ITMO",
                "ITMO", "ITMO", "ITMO", "SPbSU", "ITMO"
        };
        System.out.print(arr[Integer.parseInt(br.readLine())-1995]);
    }
}