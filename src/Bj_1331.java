import java.io.*;
import java.util.*;

public class Bj_1331 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<String> set = new LinkedHashSet<>();
        boolean valid = true;

        String firstMove = null;
        String lastMove = null;

        for (int i = 0; i < 36; i++) {
            String next = br.readLine();
            if (i == 0) firstMove = next;

            if (set.contains(next)) {
                valid = false;
                break;
            }

            if (!set.isEmpty()) {
//                String last = set.toArray(new String[0])[set.size() - 1];
                valid = isValid(lastMove, next);
                if (!valid) {
                    break;
                }
            }
            set.add(next);
            lastMove = next;
        }

        if (valid) {
            valid = isValid(lastMove, firstMove);
        }

        System.out.print(valid ? "Valid" : "Invalid");
    }

    private static boolean isValid(String last, String next) {
        int lastCol = last.charAt(0) - 'A';
        int lastRow = last.charAt(1) - '1';
        int nextCol = next.charAt(0) - 'A';
        int nextRow = next.charAt(1) - '1';

        int colDiff = Math.abs(lastCol - nextCol);
        int rowDiff = Math.abs(lastRow - nextRow);

        return (colDiff == 1 && rowDiff == 2) || (colDiff == 2 && rowDiff == 1);
    }
}