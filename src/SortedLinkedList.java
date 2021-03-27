public class SortedLinkedList<T extends Comparable<T>> implements SortedList<T> {

    Node head;

    private class Node<T> {
        Node<T> next;
        T data;

        public Node(T value) {
            this.data = value;
            next = null;
        }
    }

    private T[] arr;
    private int size = 0;

    public SortedLinkedList() {
        arr = (T[]) new Comparable[10];
        size = 0;
    }

    @Override
    public boolean add(Comparable x) {
        Node prev = head;
        for (int i = 0; i < size; i++) {
            prev = prev.next;
            Node
        }
    }

    @Override
    public Comparable remove(int pos) {
        return null;
    }

    @Override
    public Comparable get(int pos) {
        Node curr = head;
        for (int i = 0; i < pos; i++) {
            curr = curr.next;
        }
        return (Comparable) curr.data;
    }

    @Override
    public int size() {
        return size;
    }
}
