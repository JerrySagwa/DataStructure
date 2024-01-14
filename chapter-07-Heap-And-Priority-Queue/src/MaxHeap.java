import java.util.ArrayList;

public class MaxHeap<E extends Comparable<E>> {

    private ArrayList<E> data;

    public MaxHeap() {
        data = new ArrayList<>();
    }

    public int size() {
        return data.size();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    // 以 0 为起点
    private int parent(int index) {
        if (index == 0) {
            return -1;
        }
        return (index - 1) / 2;
    }

    private int leftChild(int index) {
        return index * 2 + 1;
    }

    private int rightChild(int index) {
        return index * 2 + 2;
    }
}








































