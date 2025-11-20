import java.util.*;
import java.io.*;

public class Q10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(bf.readLine());
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < k; ++i) {
            int n = Integer.parseInt(bf.readLine());
            if(n == 0) stack.pop();
            else stack.push(n);
        }

        while(!stack.isEmpty()) {
            answer += stack.pop();
        }

        System.out.println(answer);
    }
}
