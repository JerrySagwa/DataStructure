import java.util.StringJoiner;

public class Array {
    private int[] data;
    private int size;

    /**
     * @param capacity 数组初始容量
     */
    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    /**
     * default capacity: 10
     */
    public Array() {
        this(10);
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addLast(int e) {
//        if(size == data.length)
//            throw new IllegalArgumentException("Array is already full!");
//        data[size++] = e;
        add(size, e);
    }

    public void addFirst(int e) {
        add(0, e);
    }

    public int get(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Invalid index!");
        return data[index];
    }

    public void set(int index, int e) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Invalid index!");
        data[index] = e;
    }

    public void add(int index, int e) {
        if (size == data.length)
            throw new IllegalArgumentException("Array is already full!");

        if (index < 0 || index > size)
            throw new IllegalArgumentException("Invalid index!");

        for (int i = size - 1; i >= index; --i) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    public boolean contains(int e) {
        for (int i = 0; i < size; i++) {
            if (data[i] == e)
                return true;
        }
        return false;
    }

    // return -1  if cannot find e
    public int find(int e) {
        for (int i = 0; i < size; i++) {
            if (data[i] == e)
                return i;
        }
        return -1;
    }

    public int remove(int index) {
        if (index >= size || index < 0)
            throw new IllegalArgumentException("Invalid index!");
        int ret = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        return ret;
    }

    public int removeFirst() {
        return remove(0);
    }

    public int removeLast() {
        return remove(data[size - 1]);
    }

    public void removeElement(int e) {
        int i = find(e);
        if (i != -1)
            remove(i);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Array: size = %d, capacity = %d\n", size, data.length));
        sb.append("(");
        for (int i = 0; i < size; ++i) {
            sb.append(data[i]);
            if (i != size - 1)
                sb.append(", ");
        }
        sb.append(")");
        return sb.toString();
    }
}








































