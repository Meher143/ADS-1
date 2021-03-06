import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for solution.
 */
public final class Solution {
/**
 * Constructs the object.
 */
    private Solution() {

    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());
        int b = Integer.parseInt(input.nextLine());
        String[] t = input.nextLine().split(",");
        String[] s = input.nextLine().split(",");
        int[] array1;
        /**
         * { var_description }.
         */

        int[] array2;
        /**
         * { item_description }.
         */
        array2 = new int[s.length];

        if (t[0].equals("")) {
            array1 = new int[0];
        } else {
            array1 = new int[t.length];
            for (int i = 0; i < t.length; i++) {
            array1[i] = Integer.parseInt(t[i]);
        }

        }
        for (int i = 0; i < s.length; i++) {
            array2[i] = Integer.parseInt(s[i]);
        }


        // System.out.println(Arrays.toString(array1));
        // System.out.println(Arrays.toString(array2));
        sort(array1, array2);

    }
/**
 * { function_description }.
 *
 * @param      array1  The array 1
 * @param      array2  The array 2
 */

    public static void sort(final int[] array1, final int[] array2) {
        /**
         * { var_description }.
         */
        int i = 0;
        int j = 0;
        int[] result;
        result = new int[array1.length + array2.length];
        for (int k = 0; k < result.length; k++) {
            if (i < array1.length && j < array2.length) {
                if (array1[i] < array2[j]) {
                    result[k] = array1[i++];
                } else {
                    result[k] = array2[j++];
                }
            } else if (i >= array1.length) {
                result[k] = array2[j++];
            } else if (j >= array2.length) {
                result[k] = array1[i++];
            }
        }
        System.out.println(Arrays.toString(result).
            replace("[", "").replace("]", "").replace(" ", ""));
    }

}
