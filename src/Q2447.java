import java.util.*;
import java.io.*;

public class Q2447 {
    public void solution(char[][] answer, int check, int i, int j, boolean blank) {
        if(blank) {
            for(int k = i; k < i + check; ++k) {
                for(int l = j; l < j + check; ++l) {
                    answer[k][l] = ' ';
                }
            }
            return;
        }
        if(check == 1) {
            answer[i][j] = '*';
            return;
        }

        int size = check / 3;
        int cnt = 0;
        for(int k = i; k < i + check; k += size) {
            for(int l = j; l < j + check; l += size) {
                ++cnt;
                if(cnt == 5) {
                    solution(answer, size, k , l, true);
                } else {
                    solution(answer, size, k, l, false);
                }
            }
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Q2447 T = new Q2447();

        int n = Integer.parseInt(bf.readLine());

        char[][] answer = new char[n][n];

        T.solution(answer, n, 0, 0, false);

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                sb.append(answer[i][j]);
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
