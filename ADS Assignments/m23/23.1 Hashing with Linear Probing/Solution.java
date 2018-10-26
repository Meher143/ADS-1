import java.util.Scanner;
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
     * Main function.
     * Time complexity for this method is O(NlogN).
     * For some cases the time complexity may be O(M*N) where
     * M is for hash method and N is for while loop.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        LinearProbingHashST<String, Integer> lpst =
        new LinearProbingHashST<String, Integer>();
        for (int i = 0; i < n; i++) {
            String[] str = sc.nextLine().split(" ");
            switch (str[0]) {
                case "put":
                lpst.put(str[1], Integer.parseInt(str[2]));
                break;
                case "get":
                System.out.println(lpst.get(str[1]));
                break;
                case "delete":
                lpst.delete(str[1]);
                break;
                case "display":
                String temp = "{";
                for (String s : lpst.keys()) {
                    temp += (s + ":" + lpst.get(s) + ", ");
                }
                temp = temp.replaceAll(", $", "");
                System.out.println(temp + "}");
                //break;
                default:
                break;
            }
        }
    }
}
