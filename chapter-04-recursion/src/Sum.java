public class Sum {
    public static int sum(int[] arr) {
        return sum(arr, 0);
    }

    // sum(arr[l...n-1])
    public static int sum(int[] arr, int l) {
        if (l >= arr.length)
            return 0;
        return arr[l] + sum(arr, l + 1);
    }
}
