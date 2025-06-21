import java.io.*;
import java.util.*;

public class Bj_2822 {
    static class Participant {
        int no;
        int score;

        Participant(int no, int score) {
            this.no = no;
            this.score = score;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Participant[] arr = new Participant[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = new Participant(i+1, Integer.parseInt(br.readLine()));
        }

        Arrays.sort(arr, (a, b) -> b.score - a.score);

        int[] numbers = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            numbers[i] = arr[i].no;
            sum += arr[i].score;
        }
        Arrays.sort(numbers);
        sb.append(sum).append("\n");
        for (int i = 0; i < 5; i++) {
            sb.append(numbers[i]).append(" ");
        }
        System.out.print(sb);
    }
}