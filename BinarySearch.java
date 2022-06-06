public class BinarySearch {

    int binarySearch(int[] arr, int low, int high, int key) {
        if (high >= low) {
            int mid = low + (high - 1) / 2;

            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                binarySearch(arr, low, mid - 1, key);
            }
            return binarySearch(arr, mid + 1, high, key);
        }
        return -1;
    }

    int binarySearchIter(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] arr1 = {2, 3, 4, 10, 40};
        int arrLen = arr1.length;
        int keyToFind = 10;

        System.out.println("Recursive Binary Search result:");
        int result = bs.binarySearch(arr1, 0, arrLen - 1, keyToFind);
        if (result == -1) {
            System.out.println("Element was not found");
        } else {
            System.out.println("Element was found at index: " + result);
        }

        System.out.println("Recursive Binary Search result:");
        int IterResult = bs.binarySearchIter(arr1, keyToFind);
        if (IterResult == -1) {
            System.out.println("Element was not found");
        } else {
            System.out.println("Element was found at index: " + IterResult);
        }
    }
}
