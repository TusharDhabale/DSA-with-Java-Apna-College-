public class LoopCycleInLL {

    Node head;

    public boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while(fast !=  null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2

            if(slow == fast) {
                return true; //cycle present
            }
        }

        return false; //cycle not present
    }

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String args[]) {
        LoopCycleInLL list = new LoopCycleInLL();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        //1->2->3
        System.out.println(list.isCycle()); //false
    }
}
