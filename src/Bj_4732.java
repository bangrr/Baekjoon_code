import java.io.*;
import java.util.*;

public class Bj_4732 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String[] scale = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};

        while (true) {
            String str = br.readLine();
            if (str.equals("***")) {
                break;
            }

            String[] arr = str.split(" ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i].replaceAll("Bb", "A#").replaceAll("Db", "C#").replaceAll("Eb", "D#")
                        .replaceAll("Gb", "F#").replaceAll("Ab", "G#").replaceAll("B#", "C")
                        .replaceAll("Cb", "B").replaceAll("E#", "F").replaceAll("Fb", "E");
                for (int j = 0; j < scale.length; j++) {
                    if (arr[i].equals(scale[j])) {
                        arr[i] = String.valueOf(j);
                    }
                }
            }
            int n = Integer.parseInt(br.readLine());
            for (String s : arr) {
                int num = Integer.parseInt(s);
                num = (num + n + 12) % 12;
                sb.append(scale[num]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}