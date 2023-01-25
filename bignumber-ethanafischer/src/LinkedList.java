public class LinkedList {

    private Node head;
    private int size;

    public LinkedList(){
        head = null;
        size = 0;
    }

    public LinkedList(Node n){
        head = n;
    }

    private String removeLeadingZeroes(String s) {
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (c != '0') {
                return s.substring(i);
            }
        }
        return "0";
    }

    public String toString() {
        head = reverseList(head);
        return removeLeadingZeroes(merge());
    }

    public Node getHead() { return head; }

    public void setHead(Node head) { this.head = head; }

    public void insert(int c) {
        this.size++;
        Node newNode = new Node(c);

        if (head == null) {
            this.head = newNode;
        } else {
            Node cur = head;
            while(cur.getNext() != null){
                cur = cur.getNext();
            }
            cur.setNext(newNode);
        }
    }
    public int size() { return size; }

    public Node reverseList(Node head) {
        if (head == null || head.getNext() == null) { return head; }

        Node newHead = reverseList(head.getNext());

        head.getNext().setNext(head);
        head.setNext(null);

        return newHead;
    }

    private String merge() {
        String num = "";
        Node cur = head;
        while (cur != null){
            num = num + cur.getData();
            cur = cur.getNext();
        }
        return num;
    }
}
