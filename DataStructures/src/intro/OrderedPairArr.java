package intro;

public class OrderedPairArr <T> implements OrderedPairInterface <T> {
    private T [ ] items;

    public OrderedPairArr (T first, T second) {
        Object [] temp = {first, second};
        items = (T[]) temp;
    }

    @Override
    public T getFirst( ) {
        return items[0];
    }

    @Override
    public T getSecond() {
        return items [1];
    }

    @Override
    public void setFirst(T first) {
        items[0] = first;
    }

    @Override
    public void setSecond(T second) {
        items[1] = second;
    }

    @Override
    public void swap() {
        T temp = items[0]; items[0] = items [1]; items[1] = temp;
    }

    public String toString () {
        return "(" + items[0] + ", " + items[1] + ")";
    }

    public OrderedPairInterface <T> copy () {
        return new OrderedPairArr <> (getFirst(), getSecond());
    }
    
    @Override
    public boolean equals(Object o) {
    	if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        OrderedPairArr <T> other = (OrderedPairArr <T>) o;
        return (items[0].equals (other.getFirst()) && items[1].equals (other.getSecond()));
    }
}