/**
 * Class for node.
 */
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}
/**
 * List of linkeds.
 */
class LinkedList {
    Node head;
    int size;
    /**
     * Constructs the object.
     */
    LinkedList() {
        head = null;
        size = 0;
    }
    /**
     * insertAt method.
     * The time complexcity is O(1).
     *
     * @param      pos        The position
     * @param      ele        The ele
     *
     * @throws     Exception  e
     */
    public void insertAt(int pos, int ele) throws Exception{
        Node newNode = new Node(ele);
        if (pos < 0 || pos > size) {
            throw new Exception();
        }
        head = insertAt(pos, head, newNode, 0);
    }
    /**
     * Oveloading insertAt method.
     * The time complexcity is O(1).
     *
     * @param      pos    The position
     * @param      first  The first
     * @param      obj    The object
     * @param      count  The count
     *
     * @return     Node
     */
    public Node insertAt(int pos, Node first, Node obj, int count) {
        if (pos == count) {
            obj.next = first;
            size++;
            return obj;
        }
        first.next = insertAt(pos, first.next, obj, count + 1);
        return first;
    }
    /**
     * reverse method.
     * The time complexcity is O(1).
     */
    public void reverse() {
        reverse(null, head);
    }
    /**
     * Overloading reverse method.
     *
     * @param      previous  The previous
     * @param      current   The current
     */
    void reverse(Node previous, Node current) {
        if (current != null) {
            reverse(current, current.next);
            current.next = previous;
        } else {
            head = previous;
        }
    }
    /**
     * display method.
     * The time complexcity is O(N).
     */
    void display() {
        Node temp = head;
        String str = "";
        while (temp != null) {
            str += temp.data+", ";
            temp = temp.next;
        }
        System.out.println(str.substring(0,str.length()-2));
    }
}
