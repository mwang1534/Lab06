public class SortedLinkedList<T extends Comparable<T>> implements SortedList<T> {

    private T[] arr;
    private int size = 0;

    public SortedLinkedList() {
        arr = (T[]) new Comparable[10];
        size = 0;
    }

    @Override
    public boolean add(Comparable x) {
        return false;
    }

    @Override
    public Comparable remove(int pos) {
        return null;
    }

    @Override
    public Comparable get(int pos) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
