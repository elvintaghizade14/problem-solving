package az.et.job_interviews.aws;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class FirstTask {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 8, 6, 12);
        System.out.println(mergeFiles(list));
    }

    public static int mergeFiles(List<Integer> fileSizes) {
        // Write your code here
        int s = 0;
        int sum = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(fileSizes);
        while (queue.size() > 1) {
            s += queue.poll();
            s += queue.poll();
            queue.add(s);
            sum += s;
            s = 0;
        }
        return sum;
    }
}
