import java.util.*;
import java.io.*;

class stack {
    public Stack<Integer> stack;

    public stack() {
        this.stack = new Stack<>();
    }

    public void push(int data) {
        stack.push(data);
    }

    public int pop() {
        if (stack.isEmpty()) return -1;
        return stack.pop();
    }

    public int size() {
        return stack.size();
    }

    public int isEmpty() {
        return (stack.isEmpty()) ? 1 : 0;
    }

    public int peek() {
        if (stack.isEmpty()) return -1;
        return stack.peek();
    }
}

public class Q28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        stack s = new stack();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(bf.readLine());

        for(int i = 0; i < n; ++i) {
            StringTokenizer str = new StringTokenizer(bf.readLine());
            int command = Integer.parseInt(str.nextToken());

            switch(command) {
                case 1:
                    int num = Integer.parseInt(str.nextToken());
                    s.push(num);
                    break;
                case 2:
                    sb.append(s.pop()).append("\n");
                    break;
                case 3:
                    sb.append(s.size()).append("\n");
                    break;
                case 4:
                    sb.append(s.isEmpty()).append("\n");
                    break;
                case 5:
                    sb.append(s.peek()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
