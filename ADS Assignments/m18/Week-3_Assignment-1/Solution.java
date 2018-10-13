import java .util.Scanner;
class Stock implements Comparable<Stock> {
    private long sum;
    private int i;
    private int j;
    Long getSum() {
        return this.sum;
    }
    int geti() {
        return this.i;
    }
    int getj() {
        return this.j;
    }
    Stock(final int fi, final int fj) {
        this.sum = fi + fj;
        this.i = fi;
        this.j = fj;
    }
     public int compareTo(final Stock obj) {
        if (this.sum < obj.getSum()) {
            return -1;
        }
        if (this.sum > obj.getSum()) {
            return +1;
        }
        return 0;
    }
    public String toString() {
        return sum + "";
    }

}

final class Solution {
    private Solution() {

    }
    public static void main(String[] args) {
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
                pq.insert(new Stock(current.geti(), current.getj() + 1));
            }
        }
    }
}

        


