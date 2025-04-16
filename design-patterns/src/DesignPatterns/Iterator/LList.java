// A simple singly‑linked list that can be iterated with for‑each
class LList<T> implements Iterable<T> {
    // internal node class
    private static class Node<T> {
        T data;
        Node<T> next;
        Node(T d) { data = d; }
    }

    private Node<T> head, tail;

    /** Add to end of list */
    public void add(T data) {
        Node<T> n = new Node<>(data);
        if (head == null) head = tail = n;
        else {
            tail.next = n;
            tail = n;
        }
    }

    /** Return a fresh iterator over this list */
    @Override
    public Iterator<T> iterator() {
        return new ListIterator<>(head);
    }

    /** Expose head to the iterator */
    Node<T> getHead() { return head; }
}
