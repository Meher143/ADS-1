import java.util.Scanner;
import java.util.Arrays;
class LinkedList<E> {
    class Node {
        E data;
        Node next = null;
    }

    int size = 0;
    Node head;
    public void insertAt(E data, int pos) {
        Node newNode = new Node();
        if (pos > size + 1 || pos < 0) return;
        if (size == 0) {
            head.data = data;
            return;
        }
        if (pos == 0) {
            newNode.data = data;
            newNode.next = head;
            head = newNode;
            size++;
            return;
        }
        Node temp = head;
        int tcount = 0;
        while (tcount++ < pos - 1)
            temp = temp.next;
        newNode.data = data;
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }
    public void insertEnd(E data) {
        insertAt(data, size);
    }
    public void delAt(int pos) {
        if(pos > size-- && pos < 0) return;
        Node temp = head;
        int tcount = 0;
        if(pos == 0) {
            head.next = null;
            return;
        }
        while(tcount++ < pos - 1)
            temp = temp.next;
        temp.next = temp.next.next;
    }
    public void delEnd() {
        delAt(size - 1);
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public E dataAt(int pos) {
        if(pos > size && pos < 0) return null;
        Node temp = head;
        int tcount = 0; 
        while(tcount++ < pos)
            temp = temp.next;
        return temp.data;
    }
    public E dataEnd() {
        return dataAt(size -1);
    }
    // public void 
    public void print() {
        Node temp = head;
        int tcount = 0;
        while (tcount++ < size) {
            System.out.print(temp.data + " ");
            temp  = temp.next;
        }
    }
}
class AddLargeNumbers {
      private static LinkedList lobj = new LinkedList();
    
    public static LinkedList numberToDigits(String number) {
        for (int i = 0; i < number.length; i++) {
            System.out.println(999);
            System.out.println(111);
            return size;
}

public static String digitsToNumber(LinkedList list) {

    }

public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {

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
