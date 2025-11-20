import java.util.*;
import java.io.*;

public class Q9663 {
    public static int N;
    public static int answer = 0;
    public static int[] arr;
    public static void NQueen(int col) {
        if(col == N) {
            ++answer;
            return;
        }

        for(int i = 0; i < N; ++ i) {
            if(possible(i, col)){
                arr[col] = i;
                NQueen(col + 1);
            }
        }
    }
    public static boolean possible(int row, int depth) {
        for(int i = 0; i < depth; ++i) {
            //이전에 같은 행의 값이 있는지 확인
            if(arr[i] == row) {
                return false;
            }
            //대각선에 존재하는 값이 있는지 확인
            if(Math.abs(depth - i) == Math.abs(row - arr[i])) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(bf.readLine());
        arr = new int[N];

        NQueen(0);
        System.out.println(answer);
    }
}
