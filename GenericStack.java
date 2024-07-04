import java.util.ArrayList;

// E wil be replaced by concrete data type - Generic Class
public class GenericStack<E> {

    private ArrayList<E> list = new ArrayList<>();

    public int getSize() {
        return list.size();
    }

    public void push(E object) {
        list.add(object);
    }

    public E pop() {
        E object = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return object;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }

}