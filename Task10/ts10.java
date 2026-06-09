public class ts10<T extends Comparable<T>>{
    private T[] array;

    public ts10(T[] array) {
        this.array = array.clone();
    }

    public T Min() {
        T min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }
        return min;
    }

    public T Max() {
        T max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }
}