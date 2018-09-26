import java.util.Arrays;
import java.util.Scanner;
/**
 * { item_description }.
 */
final class Solution {
	/**
	 * Constructs the object.
	 */
	private Solution() {
		/**
		 * { item_description }.
		 */

	}
	public static void main(final String[] args) {
		/**
		 * { var_description }.
		 */
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int count = 0;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				int k = Arrays.binarySearch(arr,
					-(arr[i] + arr[j]));
				if (k > j) {
					count++;
				}
			}
		}
			System.out.println(count);
		}
	}
