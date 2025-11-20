import java.util.*;
import java.io.*;

public class Q2504 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = bf.readLine();
        Deque<Integer> stack = new ArrayDeque<>();

        int answer = 0;

        //0 = '(', 1 = '['
        for(char x: str.toCharArray()) {
            //System.out.printf("%c %d\n", x, answer);
            if(x == '(') {
                stack.add(0);
            } else if(x == '[') {
              stack.add(1);
            } else if(x == ')') {
                int temp = 0;
                boolean check = false;
                while(!stack.isEmpty()) {
                    int num = stack.pollLast();
                    if(num == 0) {
                        check = true;
                        break;
                    } else if(num == 1){
                        System.out.println(0);
                        return;
                    } else {
                        temp += num;
                    }
                }
                if(!check) {
                    System.out.println(0);
                    return;
                } else if(temp == 0) stack.add(2);
                else stack.add(temp * 2);
            } else if(x == ']') {
                int temp = 0;
                boolean check = false;
                while(!stack.isEmpty()) {
                    int num = stack.pollLast();
                    if(num == 1) {
                        check = true;
                        break;
                    } else if(num == 0){
                        System.out.println(0);
                        return;
                    } else {
                        temp += num;
                    }
                }
                if(!check) {
                    System.out.println(0);
                    return;
                } else if(temp == 0) stack.add(3);
                else stack.add(temp * 3);
            }
        }

        while(!stack.isEmpty()) {
            int num = stack.pollLast();
            if(num == 0 || num == 1) {
                System.out.println(0);
                return;
            }
            answer +=num;
        }
        System.out.println(answer);
    }
}
