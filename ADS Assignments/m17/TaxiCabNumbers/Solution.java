import java.util.Scanner;
/**
 * Class for cube sum.
 */
class Taxicab implements Comparable<Taxicab> {
    /**
     * sum.
     */
    private long sum;
    /**
     * integer i.
     */
    private int i;
    /**
     * integer j.
     */
    private int j;
    /**
     * Gets the sum.
     *
     * @return     The sum.
     */
    long getSum() {
        return this.sum;
    }
    /**
     * gets i.
     *
     * @return  integer
     */
    int geti() {
        return this.i;
    }
    /**
     * gets j.
     *
     * @return  integer
     */
    int getj() {
        return this.j;
    }
    /**
     * Constructs the object.
     *
     * @param      fi     integer i
     * @param      fj    integer j
     */
    Taxicab(final int fi, final int fj) {
        this.sum = fi * fi * fi + fj * fj * fj;
        this.i = fi;
        this.j = fj;
    }
    /**
     * compares two objects.
     *
     * @param      obj    Taxicab
     *
     * @return     integer -1,0,1
     */
    public int compareTo(final Taxicab obj) {
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
 * Class for solution.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
    }
    /**
     * main function.
     *
     * @param      args  The arguments
     */
     public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        final int thou = 1000;
        // initialize priority queue
        MinPQ<Taxicab> pq = new MinPQ<Taxicab>();
        for (int i = 1; i <= thou; i++) {
            pq.insert(new Taxicab(i, i));
        }
        int pair = 1;
        int count = 0;
        Taxicab previous = new Taxicab(0, 0);
        // find smallest sum, print it out, and update
        while (!pq.isEmpty()) {
            Taxicab current = pq.delMin();
            if (current.getSum() == previous.getSum()) {
                pair++;
                if (pair == m) {
                    count++;
                }
                if (n == count) {
                    System.out.println(current);
                    break;
                }
            } else {
                pair = 1;
            }
            previous = current;
            if (current.getj() < thou) {
                pq.insert(new Taxicab(current.geti(), current.getj() + 1));
            }
        }
    }
}
