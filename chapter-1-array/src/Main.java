public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; ++i) {
            arr[i] = i;
        }
        // 数组优点 -- 快速查询
        System.out.println(arr[2]);
        // 并非所有的有语义的索引都适合用数组 -- 身份证号
        Array array = new Array(20);
        for (int i = 0; i < 10; i++) {
            array.addLast(i);
        }
        System.out.println(array);
        array.add(1, 100);
        System.out.println(array);
        array.removeFirst();
        System.out.println(array);
        array.removeElement(4);
        System.out.println(array);
    }

}