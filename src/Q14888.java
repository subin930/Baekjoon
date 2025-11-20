import java.util.*;
import java.io.*;

public class Q14888 {
    public static int n;
    public static int[] nums;
    public static HashMap<Character, Integer> operators = new HashMap<>();    // (연산자, 개수)
    public static HashSet<Integer> results = new HashSet<>();

    //depth 1로 처음에 넘겨야 함
    public static void DFS(int currentNum, int depth) {
        // 종료 조건
        if(depth == n) {
            results.add(currentNum);
            return;
        }

        // 이외의 경우 처리
        for(Character x: operators.keySet()) {
            int numOfOp = operators.get(x);
            if(numOfOp <= 0) {
                continue;
            }
            operators.put(x, numOfOp - 1);
            int nextNum = currentNum;
            switch(x) {
                case '+':
                    nextNum += nums[depth];
                    break;
                case '-':
                    nextNum -= nums[depth];
                    break;
                case '*':
                    nextNum *= nums[depth];
                    break;
                case '/':
                    nextNum = (currentNum < 0) ? -Math.abs(currentNum) / nums[depth] : currentNum / nums[depth];
                    break;
            }
            DFS(nextNum, depth + 1);
            operators.put(x, numOfOp);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(bf.readLine());
        StringTokenizer str = new StringTokenizer(bf.readLine());
        StringTokenizer str2 = new StringTokenizer(bf.readLine());

        // 숫자 배열 만들기
        nums = new int[n];
        for(int i = 0; i < n; ++i) {
            nums[i] = Integer.parseInt(str.nextToken());
        }

        // 연산자 배열 만들기
        operators.put('+', Integer.parseInt(str2.nextToken()));
        operators.put('-', Integer.parseInt(str2.nextToken()));
        operators.put('*', Integer.parseInt(str2.nextToken()));
        operators.put('/', Integer.parseInt(str2.nextToken()));

        DFS(nums[0], 1);

        Iterator<Integer> iter = results.iterator();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while(iter.hasNext()) {
            int num = iter.next();
            if(min > num) min = num;
            if(max < num) max = num;
        }

        sb.append(max).append("\n").append(min);
        System.out.println(sb);
    }
}
