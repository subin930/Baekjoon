import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15652 {
    public static int N;
    public static int M;
    public static int[] arr;
    public static StringBuilder sb = new StringBuilder();

    public void DFS(int currentIdx, int depth) {
        if(depth == M) {
            for(int i = 0; i < M; ++i) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = currentIdx; i < N; ++i) {
            arr[depth] = i + 1;
            DFS(i, depth + 1);
        }
    }
    public static void main(String[] args) throws IOException{
        Q15652 T = new Q15652();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(bf.readLine());
        N = Integer.parseInt(str.nextToken());
        M = Integer.parseInt(str.nextToken());

        arr = new int[M];

        T.DFS(0, 0);

        System.out.println(sb);
    }
}
