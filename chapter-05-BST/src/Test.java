import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();

        int[] nums = {5, 2, 6, 4, 3};
        for (int i = 0; i < nums.length; i++) {
            bst.add(nums[i]);
        }

        bst.preOrder();

        System.out.println("===========");

        testRemoveMin();
    }

    public static void testRemoveMin() {
        BST<Integer> bst = new BST<>();
        Random random = new Random();
        for (int i = 0; i < 1000; ++i) {
            bst.add(random.nextInt(10000));
        }

        ArrayList<Integer> arr = new ArrayList<>();
        while (!bst.isEmpty()) {
            arr.add(bst.removeMin());
        }

        for (int i = 0; i < bst.size() - 1; i++) {
            if (arr.get(i) > arr.get(i + 1))
                throw new IllegalArgumentException("Error!");
        }

        System.out.println("RemoveMin Test Completed!");
    }
}
