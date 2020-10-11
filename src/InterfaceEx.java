import java.util.Collection;

interface test<E> {
    void putString(E s);
    void getString(E s);
    void addAll(Collection<E> all);
    void copyAll(Collection< ? extends E> to , Collection<E> from);
}
