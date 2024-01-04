public class LinkedListQueue<E> implements Queue<E> {
    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node head, tail;
    private int size;

    public LinkedListQueue() {
        head = null;
        tail = null;
        size = 0;
    }
    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E getFront() {
        if (isEmpty())
            throw new IllegalArgumentException("Queue is empty!");
        return tail.e;
    }

    @Override
    public void enqueue(E e) {
        if (tail == null) {
            tail = new Node(e);
            head = tail;
        } else {
            tail.next = new Node(e);
            tail = tail.next;
        }
        size++;
    }

    @Override
    public E dequeue() {
        if (head == null)
            throw new IllegalArgumentException("Queue is empty!");
        Node ret = head;
        head = head.next;
        if (head == null)
            tail = null; // otherwise tail would point to Node ret
        ret.next = null;
        size--;
        return ret.e;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Queue: front ");
        Node cur = head;
        while (cur != null) {
            sb.append(cur.e + " -> ");
            cur = cur.next;
        }
        sb.append(" end");
        return sb.toString();
    }

    public static void main(String[] args) {
        LinkedListQueue<Integer> llq = new LinkedListQueue<>();
        for (int i = 0; i < 10; i++) {
            llq.enqueue(i);
            System.out.println(llq);
            if (i % 3 == 2) {
                llq.dequeue();
                System.out.println(llq);
            }
        }
    }
}
