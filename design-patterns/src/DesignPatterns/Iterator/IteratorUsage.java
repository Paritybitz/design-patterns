// The iterator “walks” the nodes one by one
class ListIterator<T> implements Iterator<T> {
    private Node<T> current;

    ListIterator(Node<T> start) {
        current = start;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        if (!hasNext()) throw new NoSuchElementException();
        T data = current.data;
        current = current.next;
        return data;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}

// Usage demo
public class IteratorUsage {
    public static void main(String[] args) {
        LList<String> myList = new LList<>();
        myList.add("abc");
        myList.add("mno");
        myList.add("pqr");
        myList.add("xyz");

        // for‑each loop uses our iterator under the hood:
        for (String s : myList) {
            System.out.println(s);
        }
    }
}
