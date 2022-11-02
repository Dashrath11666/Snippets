/**
class MinStack {
    
    Node head;
    
    public MinStack() {
    }
    
    public void push(int val) {
        if (head == null){
            head = new Node(val, val, null);
        } else {
            Node n = new Node(val, Math.min(val, head.min), head);
            head = n;
        }
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
    }
    
    private class Node {
        int val;
        int min;
        Node next;
        private Node(int v, int min, Node next) {
            this.val = v; this.next = next; this.min = min;
        }
    }
}

**/
