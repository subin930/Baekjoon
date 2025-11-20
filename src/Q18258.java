import java.io.*;
import java.util.*;

class queue {
    public Deque<Integer> queue;

    public queue() {
        this.queue = new LinkedList<Integer>();
    }
    public void push(int data) {
        queue.push(data);
    }
    public int pop() {
        if(queue.isEmpty()) return -1;
        return queue.removeLast();
    }
    public int size() {
        return queue.size();
    }
    public int empty() {
        return queue.isEmpty() ? 1 : 0;
    }
    public int front() {
        if(queue.isEmpty()) return -1;
        return queue.getLast();
    }
    public int back() {
        if(queue.isEmpty()) return -1;
        return queue.getFirst();
    }
}

public class Q18258 {
    public static void main(String[] args) throws IOException {
        queue queue1 = new queue();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(bf.readLine());

        for(int i = 0; i < n; ++i) {
            StringTokenizer str = new StringTokenizer(bf.readLine());
            String func = str.nextToken();
            if(func.equals("push")) {
                int num = Integer.parseInt(str.nextToken());
                queue1.push(num);
            } else if(func.equals("pop")) {
                sb.append(queue1.pop()).append("\n");
            } else if(func.equals("size")) {
                sb.append(queue1.size()).append("\n");
            } else if(func.equals("empty")) {
                sb.append(queue1.empty()).append("\n");
            } else if(func.equals("front")) {
                sb.append(queue1.front()).append("\n");
            } else if(func.equals("back")) {
                sb.append(queue1.back()).append("\n");
            }
        }
        System.out.println(sb);
    }
}
