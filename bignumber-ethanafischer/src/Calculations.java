public class Calculations {
    public static LinkedList addition(LinkedList num1, LinkedList num2, boolean m) {
        Node head1 = num1.getHead();
        Node head2 = num2.getHead();
        LinkedList sum = new LinkedList();

        int bounds = num2.size();
        if (num1.size() > num2.size()) {
            while (num2.size() < num1.size()){
                num2.insert(0);
            }
            if (m) sum = addHelperM(head1, head2);
            else sum = addHelper(head1, head2);
        } else {
            while (num1.size() < num2.size()){
                num1.insert(0);
            }
            if (m) sum = addHelperM(head2, head1);
            else sum = addHelper(head2, head1);
        }
        return sum;
    }
    private static LinkedList addHelper(Node h1, Node h2){
        LinkedList res = new LinkedList();
        LinkedList c1 = new LinkedList(h2);
        LinkedList c2 = new LinkedList(h1);
        Node cur1 = c1.getHead();
        Node cur2 = c2.getHead();
        boolean carry = false;
        int sum = 0;

        while (cur1 != null) {
            sum = cur1.getData() + cur2.getData();
            if (carry){
                sum += 1;
                carry = false;
            }
            if (sum > 9) {
                carry = true;
                if(cur1.getNext()==null){
                    cur1.setNext(new Node(0));
                    cur2.setNext(new Node(0));
                }
            }
            res.insert(sum % 10);
            cur1 = cur1.getNext();
            cur2 = cur2.getNext();
        }
        return res;
    }

    private static LinkedList addHelperM(Node h1, Node h2){
        LinkedList res = new LinkedList();
        int sum;
        while (h1 != null) {
            sum = h1.getData() + h2.getData();
            if (sum > 9) {
                h1.getNext().setData(h1.getNext().getData() + 1);
            }
            res.insert(sum % 10);
            h1 = h1.getNext();
            h2 = h2.getNext();
        }
        return res;
    }

    public static LinkedList multiply(LinkedList num1, LinkedList num2) {
        LinkedList total = new LinkedList(new Node(0));
        Node cur = num2.getHead();

        for(int i = 0; i < num2.size(); i++){
            total = addition(total, multiplyHelper(num1, cur.getData(), i), true);
            cur = cur.getNext();
        }
        return total;
    }

    private static LinkedList multiplyHelper(LinkedList ll, int num, int i){
        LinkedList res = new LinkedList();
        Node cur = ll.getHead();
        int carry = 0;
        int product;

        for(int j = 0; j < i; j++){
            res.insert(0);
        }

        while (cur != null){
            product = cur.getData() * num;
            if (carry != 0) {
                product = product + carry;
                carry = 0;
            }
            if (product > 9) {
                carry = product/10;
            }
            res.insert(product % 10);
            cur = cur.getNext();
        }
        res.insert(carry);
        return res;
    }

    public static LinkedList exponentiate (LinkedList num1, LinkedList num2) {
        int n = Integer.parseInt(num2.toString());
        num2.setHead(num2.reverseList(num2.getHead()));
        LinkedList s = new LinkedList();

        if (n % 2 == 1) {
            s = expOddHelper(num1, n);

        } else {
            s = expEvenHelper(num1, n);
        }
        return s;
    }

    private static LinkedList expOddHelper(LinkedList n1, int n) {
        int e = (n - 1) / 2;
        LinkedList x = multiply(n1, n1);
        LinkedList ans = new LinkedList(new Node(1));

        for (int i = 0; i < e; i++) {
            ans = multiply(ans, x);
        }
        return multiply(ans, n1);
    }

    private static LinkedList expEvenHelper(LinkedList n1, int n) {
        int e = n / 2;
        LinkedList x = multiply(n1, n1);
        LinkedList ans = new LinkedList(new Node(1));

        for (int i = 0; i < e; i++) {
            ans = multiply(ans, x);
        }
        return ans;
    }
}
