import java.io.*;
import java.util.*;

public class Bj_2045 {
    static int[][] arr;
    static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        arr = new int[3][3];
        int cnt = 0;
        int sum = 0;
        for (int i=0; i<3; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<3; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                sum += arr[i][j];
                if (arr[i][j] == 0) {
                    cnt++;
                }
            }
        }

        max = checkSum();

        if (arr[0][0] == 0 && arr[1][1] == 0 && arr[2][2] == 0) {
            arr[0][0] = sum/2 - arr[0][1] - arr[0][2];
            arr[1][1] = sum/2 - arr[1][0] - arr[1][2];
            arr[2][2] = sum/2 - arr[2][0] - arr[2][1];
        } else if (arr[2][0] == 0 && arr[1][1] == 0 && arr[0][2] == 0) {
            arr[0][2] = sum/2 - arr[0][1] - arr[0][0];
            arr[1][1] = sum/2 - arr[1][0] - arr[1][2];
            arr[2][0] = sum/2 - arr[2][2] - arr[2][1];
        } else {
            while (cnt-- > 0) {
                calcNum();
            }
        }

        printArr();
    }

    private static int checkSum() {
        int max = 0;
        max = Math.max(max, (arr[0][0] + arr[0][1] + arr[0][2]));
        max = Math.max(max, (arr[1][0] + arr[1][1] + arr[1][2]));
        max = Math.max(max, (arr[2][0] + arr[2][1] + arr[2][2]));
        max = Math.max(max, (arr[0][0] + arr[1][0] + arr[2][0]));
        max = Math.max(max, (arr[0][1] + arr[1][1] + arr[2][1]));
        max = Math.max(max, (arr[0][2] + arr[1][2] + arr[2][2]));
        max = Math.max(max, (arr[0][0] + arr[1][1] + arr[2][2]));
        max = Math.max(max, (arr[2][0] + arr[1][1] + arr[0][2]));
        return max;
    }

    private static void calcNum() {
        if (arr[0][0] == 0 && arr[0][1] != 0 && arr[0][2] != 0) {
            arr[0][0] = max -arr[0][1]-arr[0][2];
        } else if (arr[0][0] == 0 && arr[1][0] != 0 && arr[2][0] != 0) {
            arr[0][0] = max -arr[1][0]-arr[2][0];
        } else if (arr[0][0] == 0 && arr[1][1] != 0 && arr[2][2] != 0) {
            arr[0][0] = max -arr[1][1]-arr[2][2];
        } else if (arr[0][2] == 0 && arr[0][1] != 0 && arr[0][0] != 0) {
            arr[0][2] = max -arr[0][1]-arr[0][0];
        } else if (arr[0][2] == 0 && arr[1][1] != 0 && arr[2][0] != 0) {
            arr[0][2] = max -arr[1][1]-arr[2][0];
        } else if (arr[0][2] == 0 && arr[1][2] != 0 && arr[2][2] != 0) {
            arr[0][2] = max -arr[1][2]-arr[2][2];
        } else if (arr[2][0] == 0 && arr[1][0] != 0 && arr[0][0] != 0) {
            arr[2][0] = max -arr[1][0]-arr[0][0];
        } else if (arr[2][0] == 0 && arr[1][1] != 0 && arr[0][2] != 0) {
            arr[2][0] = max -arr[1][1]-arr[0][2];
        } else if (arr[2][0] == 0 && arr[2][1] != 0 && arr[2][2] != 0) {
            arr[2][0] = max -arr[2][1]-arr[2][2];
        } else if (arr[2][2] == 0 && arr[1][2] != 0 && arr[0][2] != 0) {
            arr[2][2] = max -arr[1][2]-arr[0][2];
        } else if (arr[2][2] == 0 && arr[1][1] != 0 && arr[0][0] != 0) {
            arr[2][2] = max -arr[1][1]-arr[0][0];
        } else if (arr[2][2] == 0 && arr[2][1] != 0 && arr[2][0] != 0) {
            arr[2][2] = max -arr[2][1]-arr[2][0];
        } else if (arr[0][1] == 0 && arr[0][0] != 0 && arr[0][2] != 0) {
            arr[0][1] = max -arr[0][0]-arr[0][2];
        } else if (arr[0][1] == 0 && arr[1][1] != 0 && arr[2][1] != 0) {
            arr[0][1] = max -arr[1][1]-arr[2][1];
        } else if (arr[1][0] == 0 && arr[0][0] != 0 && arr[2][0] != 0) {
            arr[1][0] = max -arr[0][0]-arr[2][0];
        } else if (arr[1][0] == 0 && arr[1][1] != 0 && arr[1][2] != 0) {
            arr[1][0] = max -arr[1][1]-arr[1][2];
        } else if (arr[2][1] == 0 && arr[1][1] != 0 && arr[0][1] != 0) {
            arr[2][1] = max -arr[1][1]-arr[0][1];
        } else if (arr[2][1] == 0 && arr[2][0] != 0 && arr[2][2] != 0) {
            arr[2][1] = max -arr[2][0]-arr[2][2];
        } else if (arr[1][2] == 0 && arr[1][0] != 0 && arr[1][1] != 0) {
            arr[1][2] = max -arr[1][0]-arr[1][1];
        } else if (arr[1][2] == 0 && arr[0][2] != 0 && arr[2][2] != 0) {
            arr[1][2] = max -arr[0][2]-arr[2][2];
        } else if (arr[1][1] == 0 && arr[0][0] != 0 && arr[2][2] != 0) {
            arr[1][1] = max -arr[0][0]-arr[2][2];
        } else if (arr[1][1] == 0 && arr[0][1] != 0 && arr[2][1] != 0) {
            arr[1][1] = max -arr[0][1]-arr[2][1];
        } else if (arr[1][1] == 0 && arr[0][2] != 0 && arr[2][0] != 0) {
            arr[1][1] = max -arr[0][2]-arr[2][0];
        } else if (arr[1][1] == 0 && arr[1][0] != 0 && arr[1][2] != 0) {
            arr[1][1] = max -arr[1][0]-arr[1][2];
        }
    }

    private static void printArr() {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}