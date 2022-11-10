
import java.util.LinkedList;


public class Shop <T> extends LinkedList<T> {
    private final int capacity;

    public Shop(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean add(T e) {
        if(size() >= capacity)
            removeFirst();
        return super.add(e);
    }
}
