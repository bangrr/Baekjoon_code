import java.io.*;

public class Bj_16955 {
    static char[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        board = new char[10][10];
        for (int i=0; i<10; i++) {
            String row = br.readLine();
            for (int j=0; j<10; j++) {
                board[i][j] = row.charAt(j);
            }
        }

        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                if (board[i][j] != '.') continue;

                board[i][j] = 'X';
                if (checkOmok(i, j)) {
                    System.out.print(1);
                    return;
                }
                board[i][j] = '.';
            }
        }
        System.out.print(0);
    }

    private static boolean checkOmok(int r, int c) {
        //세로
        int cnt = 0;
        for (int i=r-4; i<=r+4; i++) {
            if (i < 0 || i >= 10) continue;
            if (board[i][c] == 'X') {
                cnt++;
                if (cnt >= 5) return true;
            }
            else cnt = 0;
        }

        //가로
        cnt = 0;
        for (int j=c-4; j<=c+4; j++) {
            if (j < 0 || j >= 10) continue;
            if (board[r][j] == 'X') {
                cnt++;
                if (cnt >= 5) return true;
            }
            else cnt = 0;
        }


        //좌상
        cnt = 0;
        for (int i=r-4, j=c-4; i<=r+4 && j<=c+4; i++, j++) {
            if (i < 0 || i >= 10 || j < 0 || j >= 10) continue;
            if (board[i][j] == 'X') {
                cnt++;
                if (cnt >= 5) return true;
            }
            else cnt = 0;
        }

        //좌하
        cnt = 0;
        for (int i=r+4, j=c-4; i>=r-4 && j<=c+4; i--, j++) {
            if (i < 0 || i >= 10 || j < 0 || j >= 10) continue;
            if (board[i][j] == 'X') {
                cnt++;
                if (cnt >= 5) return true;
            }
            else cnt = 0;
        }

        return false;
    }
}