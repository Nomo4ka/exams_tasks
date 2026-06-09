import java.util.Iterator;

public class Vector implements Iterable<Double> , java.io.Serializable {
    private Double[] vector;

    public final int length;

    Vector(int length) {
        vector = new Double[length];
        this.length = length;
    }

    public double at(int index) {
        return vector[index];
    }

    public void setAt(int index, double val) {
        vector[index] = val;
    }

    //Вообще, я не думаю, что целесообразно прописывать этот метод, если поле length является публичным, но final
    public int getLentgth() {
        return length;
    }

    @Override
    public Iterator<Double> iterator(){
        return new Iterator<Double>() {
            private int currIndex = 0;
            @Override
            public boolean hasNext() {
                return currIndex < vector.length;
            }

            @Override
            public Double next() {
                return vector[++currIndex];
            }
        };
    }
}