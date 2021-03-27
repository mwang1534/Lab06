public class SortedArrayList<T extends Comparable<T>> implements SortedList<T> {

    private T[] arr;
    private int size = 0;

    public SortedArrayList() {
        arr = (T[]) new Comparable[10];
        size = 0;
    }

    public boolean sort() {
        T store;

        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j < size-i-1; j++) {
                if (arr[j].compareTo(arr[j+1]) > 0) {
                    store = arr[j+1]; //variable for swapping
                    arr[j+1] = arr[j];
                    arr[j] = store;
                }
            }
        }
        return true;
    }

    @Override
    public boolean add(Comparable x) {
        if (size < arr.length) {
            this.arr[size++] = (T) x;
            sort();
        }
        else {
            System.out.println("ArrayList is full. Increasing capacity.");
            expandCapacity();
        }
        return true;
    }

    private void expandCapacity() {
        //created a helper method
        if (this.size < arr.length) {
            return;
        }
        int length = arr.length;
        T[] newArray = (T[]) new Object[length*2];

        for (int i = 0; i < size; i++) {
            newArray[i] = this.arr[i];
        }
        this.arr =  newArray;
    }


    @Override
    public Comparable remove(int pos) {
        if (pos <= size) {
            Comparable o = arr[pos];
            arr[pos] = null;
            while (pos < size) {
                arr[pos] = arr[pos+1];
                arr[pos+1] = null;
                pos++;
            }
            size--;
        }
        if (pos < 0 || pos > size) {
            System.out.println("Index out of bounds");
            throw new ArrayIndexOutOfBoundsException();
        }
        return null;
    }

    @Override
    public Comparable get(int pos) {
        if (pos >= 0 && pos <= size) {
            return arr[pos];
        }
        else {
            System.out.println("Index out of bounds");
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        String printArray = "";
        for (int temp = 0; temp < size; temp++) {
            if (printArray != "") {
                printArray += ", ";
            }
            printArray += this.arr[temp];
        }
        return "[" + printArray +"]";
    }

    public static void main(String[] args) {
        SortedArrayList<Integer> intArray = new SortedArrayList<>();
        System.out.println("Size is: " + intArray.size());

        intArray.add(1);
        intArray.add(4);
        intArray.add(3);
        intArray.add(6);
        System.out.println(intArray.toString());

        intArray.remove(1);
        System.out.println(intArray.toString());

        System.out.println(intArray.get(1));

        System.out.println("Size is: " + intArray.size());
    }
}
