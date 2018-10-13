import java .util.Scanner;
/**
 * Class for stock.
 */
class Stock implements Comparable<Stock> {
    /**
     * { var_description }.
     */
    private long sum;
    /**
     * { var_description }.
     */
    private int i;
    /**
     * { var_description }.
     */
    private int j;
    /**
     * Gets the sum.
     *
     * @return     The sum.
     */
    Long getSum() {
        return this.sum;
    }
    /**
     * { function_description }.
     *
     * @return     { description_of_the_return_value }
     */
    int geti() {
        return this.i;
    }
    /**
     * { function_description }.
     *
     * @return     { description_of_the_return_value }.
     */
    int getj() {
        return this.j;
    }
    /**
     * Constructs the object.
     *
     * @param      fi    { parameter_description }
     * @param      fj    { parameter_description }
     */
    Stock(final int fi, final int fj) {
        this.sum = fi + fj;
        this.i = fi;
        this.j = fj;
    }
    /**
     * { function_description }.
     *
     * @param      obj   The object
     *
     * @return     { description_of_the_return_value }
     */
     public int compareTo(final Stock obj) {
        if (this.sum < obj.getSum()) {
            return -1;
        }
        if (this.sum > obj.getSum()) {
            return +1;
        }
        return 0;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        return sum + "";
    }
}
/**
 * { item_description }.
 */
final class Solution {
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
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int m = sc.nextInt();
    final int thou = 1000;
     sc.nextLine();
      MinPQ<Stock> pq = new MinPQ<Stock>();
        for (int i = 1; i <= thou; i++) {
            pq.insert(new Stock(i, i));
        }
        int pair = 1;
        int count = 0;
        Stock previous = new Stock(0, 0);
        // find smallest sum, print it out, and update
        while (!pq.isEmpty()) {
            Stock current = pq.delMin();
            if (current.getSum() == previous.getSum()) {
                //The time complexcity is N
                pair++;
                if (pair == m) {
                    count++;
                }
                //The time complexcity is N
                if (n == count) {
                    System.out.println(current);
                    break;
                }
            } else {
                pair = 1;
            }
            previous = current;
            if (current.getj() < thou) {
                pq.insert(new Stock(current.geti(), current.getj() + 1));
            }
        }
    }
}
