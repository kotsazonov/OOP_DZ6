class MyArrayList<T> {
    private T[] array;
    private int lastIndex = -1;

    public MyArrayList(T[] array) { this.array = array; }

    public void add(T item) { array[++lastIndex] = item; }

    public int size() { return lastIndex + 1; }

    public int capacity() { return array.length; }
}