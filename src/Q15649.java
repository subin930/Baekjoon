import java.util.*;
import java.io.*;

public class Q15649 {
    public static int[] arr;    // 정답을 적을 배열
    public static boolean[] visit;  // 방문 여부를 작성
    public static StringBuilder sb = new StringBuilder();

    public void dfs(int N, int M, int depth) {
        //만약 M개를 모두 기록했다면
        if(depth == M) {
            for(int i = 0; i < M; ++i) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        //그렇지 않다면 다음 레벨 탐색
        for(int i = 0; i < N; ++i) {
            if(!visit[i]) {
                visit[i] = true;
                arr[depth] = i + 1;
                dfs(N, M, depth + 1);

                //방문이 모두 끝난 뒤 다시 방문 여부를 바꾸어줌
                visit[i] = false;
            }
        }

        return;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer str = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(str.nextToken()); // 자연수 범위: 1~N
        int M = Integer.parseInt(str.nextToken()); // M개를 선택한 수열

        arr = new int[M];
        visit = new boolean[N];

        Q15649 T = new Q15649();
        T.dfs(N, M, 0);
        System.out.println(sb);
    }
}
