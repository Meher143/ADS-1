import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution {
    /**
     * Constructs the object.
     */
    protected Solution() {

    }
    /**
     * main method.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] minHeap = new int[n];
        int[] maxHeap = new int[n];
        int minHeapSize = 0;
        int maxHeapSize = 0;
        float median = 0;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            if (a[i] < median) {
                maxHeap[maxHeapSize++] = a[i];
                if (maxHeap[maxHeapSize - 1] > maxHeap[0]) {
                    swap(maxHeap, maxHeapSize - 1, 0);
                }
            } else {
                minHeap[minHeapSize++] = a[i];
                if (minHeap[minHeapSize - 1] < minHeap[0]) {
                    swap(minHeap, minHeapSize - 1, 0);
                }
            }
            if (Math.abs(maxHeapSize - minHeapSize) > 1) {
                if (maxHeapSize > minHeapSize) {
                    swap(maxHeap, maxHeapSize - 1, 0);
                    minHeap[minHeapSize++] = maxHeap[--maxHeapSize];
                    swap(minHeap, 0, minHeapSize - 1);
                    buildMaxHeap(maxHeap, maxHeapSize);
                } else {
                    swap(minHeap, minHeapSize - 1, 0);
                    maxHeap[maxHeapSize++] = minHeap[--minHeapSize];
                    swap(maxHeap, 0, maxHeapSize - 1);
                    buildMinHeap(minHeap, minHeapSize);
                }
            }
            if (maxHeapSize == minHeapSize) {
                median = (minHeap[0] + maxHeap[0]);
                median = median / 2;
            } else if (maxHeapSize > minHeapSize) {
                median = maxHeap[0];
            } else {
                median = minHeap[0];
            }

            System.out.println(median);

        }

    }
    /**
     * Builds a maximum heap.
     *
     * @param      inputArray     The inputArray
     * @param      heapSize  The heap size
     */
    static void buildMaxHeap(final int[] inputArray, final int heapSize) {
        int depth = (heapSize - 1) / 2;
        for (int i = depth; i >= 0; i--) {
            maxHeapify(inputArray, i, heapSize);
        }
    }
    /**
     * max heap method.
     *
     * @param      inputArray     The inputArray
     * @param      i         { integer variable }
     * @param      heapSize  The heap size
     */
    static void maxHeapify(
        final int[] inputArray, final int i, final int heapSize) {
        int leftNode = 2 * i + 1;
        int rightNode = 2 * i + 2;
        int largestNumber = i;
        if 
            (leftNode < heapSize && inputArray[leftNode] > inputArray[largestNumber]) {
            largestNumber = leftNode;
        }
        if 
            (rightNode < heapSize && inputArray[rightNode] > inputArray[largestNumber]) {
            largestNumber = rightNode;
        }
        if (largestNumber != i) {
            swap(inputArray, i, largestNumber);
            maxHeapify(inputArray, largestNumber, heapSize);
        }
    }
    /**
     * Builds a minimum heap.
     *
     * @param      inputArray     The inputArray
     * @param      heapSize  The heap size
     */
    static void buildMinHeap(final int[] inputArray, final int heapSize) {
        int depth = (heapSize - 1) / 2;
        for (int i = depth; i >= 0; i--) {
            minHeapify(inputArray, i, heapSize);
        }
    }
    /**
     * min heap method.
     *
     * @param      inputArray     The inputArray
     * @param      i         { integer variable }
     * @param      heapSize  The heap size
     */
    static void minHeapify(
        final int[] inputArray, final int i, final int heapSize) {
        int leftNode = 2 * i + 1;
        int rightNode = 2 * i + 2;
        int smallest = i;
        if (leftNode < heapSize && inputArray[leftNode] < inputArray[smallest]) {
            smallest = leftNode;
        }
        if (rightNode < heapSize && inputArray[rightNode] < inputArray[smallest]) {
            smallest = rightNode;
        }
        if (smallest != i) {
            swap(inputArray, i, smallest);
            minHeapify(inputArray, smallest, heapSize);
        }
    }
    /**
     * swap method.
     *
     * @param      inputArray  The inputArray
     * @param      i      { integer variable }
     * @param      j      { integer variable }
     */
    static void swap(final int[] inputArray, final int i, final int j) {
        if (i == j) {
            return;
        }
        int temp = inputArray[i];
        inputArray[i] = inputArray[j];
        inputArray[j] = temp;
    }
}
