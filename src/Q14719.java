import java.util.*;
import java.io.*;

public class Q14719 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer str = new StringTokenizer(bf.readLine());
        StringTokenizer str2 = new StringTokenizer(bf.readLine());

        int h = Integer.parseInt(str.nextToken());
        int w = Integer.parseInt(str.nextToken());

        int[] blocks = new int[w];

        for(int i = 0; i < w; ++i) {
            blocks[i] = Integer.parseInt(str2.nextToken());
        }

        int answer = 0;
        for(int i = 1; i < w - 1; ++i) {
            //왼쪽의 최대 높이 구하기
            int leftMax = 0;
            for(int j = i - 1; j >= 0; --j) {
                leftMax = Math.max(leftMax, blocks[j]);
            }

            //오른쪽 최대 높이 구하기
            int rightMax = 0;
            for(int j = i + 1; j < w; ++j) {
                rightMax = Math.max(rightMax, blocks[j]);
            }

            //물의 양 구하기
            int currentHeight = Math.min(leftMax, rightMax);
            if(currentHeight > blocks[i]) {
                answer += (currentHeight - blocks[i]);
            }
        }
        bw.write(answer + "");
        bw.flush();
        bw.close();
        bf.close();
    }
}
