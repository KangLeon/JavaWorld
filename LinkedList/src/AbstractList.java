public abstract class AbstractList<E> implements List<E> {

    private int size;

    protected void outOfBounds(int index){
        throw new IndexOutOfBoundsException("index:"+index+"size:"+size);
    }

    protected void rangeCheck(int index){
        if(index < 0 || index >= size){
            outOfBounds(index);
        }
    }

    protected void rangeCheckForAdd(int index){
        if(index < 0 || index > size){
            outOfBounds(index);
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(E element) {
        return indexOf(element) != ELEMENT_NOT_FOUND;
    }

    public void add(E element) {
        add(size,element);
    }
}
