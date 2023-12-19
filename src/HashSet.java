import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashSet<T> implements Set<T> {
    private HashMap<T,Boolean> map = new HashMap<>();

    @Override
    public int size(){
        return map.size();
    }
    @Override
    public boolean isEmpty(){
        return map.isEmpty();
    }
    @Override
    public boolean contains(Object o){
        return map.containsKey(o);
    }
    @Override
    public boolean containsAll(Collection<?> c){
        return map.keySet().containsAll(c);
    }
    @Override
    public Iterator<T> iterator(){
        return map.keySet().iterator();
    }
    @Override
    public boolean add(T t){
        map.put(t, true);
        return true;
    }
    @Override
    public boolean addAll(Collection<? extends T> c){
        for(T element : c){
            map.put(element, true);
        }
        return true;
    }
    @Override
    public boolean remove(Object o){
        map.remove(o);
        return true;
    }
    @Override
    public boolean removeAll(Collection<?> c){
        return map.keySet().removeAll(c);
    }
    @Override
    public boolean retainAll(Collection<?> c){
        return map.keySet().retainAll(c);
    }
    @Override
    public void clear(){
        map.clear();
    }
    @Override
    public Object[] toArray(){
        return null;
    }
    @Override
    public <A> A[]toArray(A[] a){
        return null;
    }
}
