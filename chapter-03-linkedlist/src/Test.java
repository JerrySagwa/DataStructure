public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> linkedlist = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            linkedlist.addFirst(i);
            System.out.println(linkedlist);
        }
        linkedlist.add(3, 666);
        System.out.println(linkedlist);
        linkedlist.remove(2);
        System.out.println(linkedlist);
    }
}