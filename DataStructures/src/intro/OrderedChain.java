package intro;

public class OrderedChain <T> implements OrderedPairInterface <T> {

    Node head;

    public OrderedChain (T first, T second) {
        head = new Node (first);
        Node tail = new Node (second);
        head.setNext(tail);
        tail.setNext(head);
    }

    @Override
    public T getFirst() {
        return head.getData();
    }

    @Override
    public T getSecond() {
        return head.getNext().getData();
    }

    @Override
    public void setFirst(T first) {
        head.setData(first);
    }

    @Override
    public void setSecond(T second) {
        head.getNext().setData(second);
    }

    @Override
    public void swap() {
        head = head.getNext();
    }

    @Override
    public String toString () {
        return "(" + head.getData() + ", " + head.getNext().getData() + ")";
    }

    public OrderedPairInterface <T> copy () {
        return new OrderedChain <> (getFirst(), getSecond());
    }
    
    @Override
    public boolean equals(Object o) {
    	if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        OrderedChain <T> other = (OrderedChain <T>) o;
        return (getFirst().equals (other.getFirst()) && getSecond().equals (other.getSecond()));
    }
    
    private class Node {
        T data;
        Node next;

        public Node (T item) {
            data = item; next = null;
        }

        public T getData () {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public void setData(T data) {
            this.data = data;
        }

        public void setNext(Node next) {
            this.next = next;
        }


    }
}