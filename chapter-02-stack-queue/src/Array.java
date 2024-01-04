import java.util.StringJoiner;

public class Array<E> {
    private E[] data;
    private int size;

    /**
     * @param capacity 数组初始容量
     */
    public Array(int capacity) {
        data = (E[]) new Object[capacity];
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

    public void addLast(E e) {
//        if(size == data.length)
//            throw new IllegalArgumentException("Array is already full!");
//        data[size++] = e;
        add(size, e);
    }

    public void addFirst(E e) {
        add(0, e);
    }

    public E get(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Invalid index!");
        return data[index];
    }

    public void set(int index, E e) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Invalid index!");
        data[index] = e;
    }

    public void add(int index, E e) {
        if (index < 0 || index > size)
            throw new IllegalArgumentException("Invalid index!");

        if (size == data.length)
            resize(2 * data.length);

        for (int i = size - 1; i >= index; --i) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    // resize the data array to accommodate more elements / save space
    private void resize(int newSize) {
        E[] newData = (E[]) new Object[newSize];
        for (int i = 0; i < size; ++i)
            newData[i] = data[i];
        data = newData;
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e))
                return true;
        }
        return false;
    }

    // return -1  if cannot find e
    public int find(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e))
                return i;
        }
        return -1;
    }

    public E remove(int index) {
        if (index >= size || index < 0)
            throw new IllegalArgumentException("Invalid index!");
        E ret = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        data[size] = null;
        if (data.length == size * 4 && data.length / 2 != 0) // lazy resize 防止复杂度震荡
            resize(data.length / 2); // 无法 new 一个大小为 0 的数组
        return ret;
    }

    public E removeFirst() {
        return remove(0);
    }

    public E removeLast() {
        return remove(size - 1);
    }

    public void removeElement(E e) {
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








































