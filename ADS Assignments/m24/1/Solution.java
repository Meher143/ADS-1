import java.util.Scanner;
/**
 * Class for student details.
 */
class StudentDetails {
	/**
	 * { var_description }.
	 */
	private String rollnumber;
	/**
	 * { var_description }.
	 */
	private String name;
	/**
	 * { var_description }.
	 */
	private double totalmarks;
	/**
	 * Constructs the object.
	 */
	StudentDetails() {

	}
	/**
	 * Constructs the object.
	 *
	 * @param      rollno     The rollno
	 * @param      name_1     The name 1
	 * @param      totalmark  The totalmark
	 */
	StudentDetails(final String rollno, final String name_1, final double totalmark) {
		this.rollnumber = rollno;
		this.name = name_1;
		this.totalmarks = totalmark;
	}
	/**
	 * Gets the name.
	 *
	 * @return     The name.
	 */
	public String getName() {
		return name;
	}
	/**
	 * { function_description }
	 *
	 * @return     { description_of_the_return_value }.
	 */
	public String rollno() {
		return rollnumber;
	}
	/**
	 * { function_description }.
	 *
	 * @return     { description_of_the_return_value }
	 */
	public double totalmark() {
		return totalmarks;
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
	 * { function_description }
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentDetails s = new StudentDetails();
		LinearProbingHashST<String, String> l1 = new LinearProbingHashST();
		LinearProbingHashST<String, Double> l2 = new LinearProbingHashST();
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			String[] tokens = str.split(",");
			s = new StudentDetails(tokens[0], tokens[1], Double.parseDouble(tokens[2]));
		}
		int m = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < m; i++) {
			String q = sc.nextLine();
			String[] query = q.split(" ");
			if (!l1.contains(query[1])) {
				System.out.println("Student does not exists...");
				continue;
			}
			switch (query[2]) {
				case "1":
				System.out.println(l1.get(query[1]));
				break;
				case "2":
				System.out.println(l2.get(query[2]));
				break;
				default:
				break;
			}
		}
	}
}
