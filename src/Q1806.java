import java.util.*;
import java.io.*;

public class Q1806 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer str1 = new StringTokenizer(bf.readLine());
        StringTokenizer str2 = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(str1.nextToken());
        int s = Integer.parseInt(str1.nextToken());
        int[] arr = new int[n];

        for(int i = 0; i < n; ++i) {
            arr[i] = Integer.parseInt(str2.nextToken());
        }

        int lt = 0;
        int rt = 0;
        int sum = arr[lt];
        int length = Integer.MAX_VALUE;
        boolean check = false;

        while(true) {
            //System.out.printf("%d %d %d\n", sum, lt, rt);
            if(sum >= s && (rt - lt + 1) < length) {
                length = rt - lt + 1;
                check = true;
                //System.out.printf("%d %d %d %d\n", sum, length, rt, lt);
            }
            if(sum >= s) {
                sum -= arr[lt++];
            } else {
                ++rt;
                if(rt >= n) break;
                sum += arr[rt];
            }
        }

        if(check)   System.out.println(length);
        else System.out.println("0");
    }
}
