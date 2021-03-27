public interface SortedList<T extends Comparable<T>> {

    public boolean add(Comparable x);
    public Comparable remove(int pos);
    public Comparable get(int pos);
    public int size();
}
