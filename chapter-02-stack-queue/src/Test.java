import java.util.Random;

/**
 * 测试 ArrayQueue 和 LoopQueue 效率不同
 */
public class Test {
    private static double testQueue(Queue<Integer> q, int opCnt) {
        long start = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < opCnt; i++) {
            q.enqueue(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < opCnt; i++) {
            q.dequeue();
        }
        long end = System.nanoTime();
        return (end - start) / 1e9;
    }
    public static void main(String[] args) {
        int opCnt = 100000;
        ArrayQueue<Integer> aq = new ArrayQueue<>();
        double aqt = testQueue(aq, opCnt);
        System.out.println("ArrayQueue: " + aqt + "s");
        LoopQueue<Integer> lq = new LoopQueue<>();
        double lqt = testQueue(lq, opCnt);
        System.out.println("LoopQueue: " + lqt + "s");
    }
}
