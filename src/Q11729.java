import java.util.*;
import java.io.*;

public class Q11729 {
    public int hanoi(int cnt, int from, int to, int temp, int[][] answer, int index) {
        if (cnt == 0) return index;

        // Step 1: cnt - 1개의 원판을 보조 장대로 이동
        index = hanoi(cnt - 1, from, temp, to, answer, index);

        // Step 2: 가장 큰 원판을 목표 장대로 이동
        answer[index][0] = from;
        answer[index][1] = to;
        index++; // 여기서 명확히 증가

        // Step 3: 보조 장대에 있는 원판을 목표 장대로 이동
        index = hanoi(cnt - 1, temp, to, from, answer, index);

        return index;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(bf.readLine()); // 원판의 개수

        Q11729 T = new Q11729();

        int moveCount = (int) Math.pow(2, n) - 1; // 하노이탑 최소 이동 횟수
        sb.append(moveCount).append("\n");

        int[][] answer = new int[moveCount][2];
        int index = 0;

        index = T.hanoi(n, 1, 3, 2, answer, index);

        for (int i = 0; i < index; ++i) {
            sb.append(answer[i][0]).append(" ").append(answer[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}
