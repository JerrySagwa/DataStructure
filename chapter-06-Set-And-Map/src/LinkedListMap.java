public class LinkedListMap<K, V> implements Map<K, V> {

    private class Node {
        public K k;
        public V v;
        public Node next;

        public Node(K k, V v, Node next) {
            this.k = k;
            this.v = v;
            this.next = next;
        }

        public Node(K k, V v) {
            this(k, v, null);
        }

        public Node(K k) {
            this(k, null, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return k.toString();
        }
    }

    private Node dummyHead;
    private int size;

    public LinkedListMap() {
        this.size = 0;
        this.dummyHead = null;
    }

    private Node getNode(K k) {
        Node cur = dummyHead.next;
        while (cur != null) {
            if (cur.k.equals(k))
                break;
            cur = cur.next;
        }

        return cur;
    }

    @Override
    public void add(K k, V v) {
        Node node = getNode(k);
        if (node == null) { // add to the head
            dummyHead.next = new Node(k, v, dummyHead.next);
            size ++;
        } else {
            node.v = v;
        }
    }

    @Override
    public V remove(K k) {
        Node prev = dummyHead;
        while (prev.next != null) {
            if (prev.next.k.equals(k))
                break;
            prev = prev.next;
        }
        if (prev.next == null) {
            return null;
        }

        Node delNode = prev.next;
        prev.next = delNode.next;
        delNode.next = null;
        size --;
        return delNode.v;
    }

    @Override
    public boolean contains(K k) {
        return getNode(k) != null;
    }

    @Override
    public V get(K k) {
        Node node = getNode(k);
        return node == null ? null : node.v;
    }

    @Override
    public void set(K k, V v) {
        Node node = getNode(k);
        if (node != null)
            node.v = v;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}


















































