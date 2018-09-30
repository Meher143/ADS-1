import java.util.Scanner;
import java.util.Arrays;
class Node {
	String data;
	Node next;
	Node() {

	}
	Node(String data){
		this.data = data;
	}
}
class LinkedList {
	Node start;
	int size;
	LinkedList() {
     start = new Node();
     size = 0;
	}
	void insert(String item) {
		Node obj = new Node();
		obj.data = item;
		if (size == 0) {
			start = obj;
			size++;
			return;
		}
		obj.next = start;
		start = obj;
	}
	String delete() {
		String data = start.data;
		start = start.next;
		size--;
		return data;
	}
	boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}
	int size() {
		return size;
	}
}
class Stack {
	LinkedList l1;
	Stack () {
		l1 = new LinkedList();
	}
	void push(String item) {
		l1.insert(item);
	}
	String pop() {
		return l1.delete();
	}
	boolean isEmpty() {
		return l1.isEmpty();
	}
	int size() {
		return l1.size();
	}
}

class AddLargeNumbers {
      private static LinkedList lobj = new LinkedList();
    
    public static LinkedList numberToDigits(String number) {
        LinkedList object = new LinkedList();
        for (int i = 0; i < number.length(); i++) {
        }
        System.out.println(object);
        return object;

}

public static String digitsToNumber(LinkedList list) {
return null;
    }

public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
return null;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch(input){
            case "numberToDigits":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            case "addLargeNumbers":
                 pDigits = AddLargeNumbers.numberToDigits(p);
                 qDigits = AddLargeNumbers.numberToDigits(q);
                LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
}
}
