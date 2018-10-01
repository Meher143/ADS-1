import java.util.*;
class Node {
	String data;
	Node next;
	Node(String item) {
		this.data = item;
	}
}
class Steque {
	Node start, end;
	int size;
	Steque() {
		start = null;
		end = null;
		size = 0;
	}
	void push(String item) {
		Node obj = new Node(item);
		if (size == 0) {
			start = obj;
			end = start;
			size++;
			return;
		}
		obj.next = start;
		start = obj;
		size++;

	}
	void enqueue(String item) {
		Node obj = new Node(item);
		if (size == 0) {
			start = obj;
			end = start;
			size++;
			return;
		}
		end.next = obj;
		end = obj;
		size++;

	}
	String pop() {
		// if (isEmpty()) {
		// 	throw new Exception("Steque is Empty");
		// }
       String data = start.data;
       start = start.next;
       size--;
       return data;
	}
	boolean isEmpty() {
		return size == 0;
	}
	public String toString() {
		Node temp = start;
		String res = "";
		while(temp!=null) {
			res += temp.data + ",";
			temp = temp.next;
		}
		return res;
	}
}

class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		Steque st = new Steque();
		while(sc.hasNextLine()) {
			String input[] = sc.nextLine().split(" ");
			switch (input[0]) {
				case "push":
				st.push(input[1]);
				System.out.println(st);
				break;
				case "pop":
				st.pop();
				break;
				case "enqueue":
				st.enqueue(input[1]);
				break;
			}
		}
	}
}
