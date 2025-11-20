import java.io.*;
import java.util.*;

public class Q12789 {
    public static boolean solution(int[] arr) {
        Stack<Integer> space = new Stack<>();
        int currentNum = 1; //currentNum == arr.length + 1이 되면 성공

        for(int x: arr) {
            space.push(x);
            while(!space.isEmpty() && space.peek() == currentNum) {
                ++currentNum;
                space.pop();
            }
        }
        return space.isEmpty();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];

        StringTokenizer str = new StringTokenizer(bf.readLine());
        for(int i = 0; i < n; ++i) {
            arr[i] = Integer.parseInt(str.nextToken());
        }

        if(solution(arr)) System.out.println("Nice");
        else System.out.println("Sad");
    }
}
