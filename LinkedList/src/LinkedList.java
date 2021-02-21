public class LinkedList<E> extends AbstractList<E> {

    private int size;
    private Node<E> first;

    private static class Node<E> {
        E element;
        Node<E> next;
        public Node(E element,Node<E> next){
            this.element = element;
            this.next = next;
        }
    }

    @Override
    public void clear() {
        size = 0;
        first = null;
    }

    @Override
    public E get(int index) {
        return node(index).element;
    }

    @Override
    public E set(int index, E element) {
        Node<E> node = node(index);
        E old = node.element;
        node.element = element;
        return old;
    }

    @Override
    public void add(int index, E element) {
        if(index==0){
            first = new Node<>(element,first);
        }else {
            Node<E> prev = node(index-1);
            prev.next = new Node<>(element,prev.next);
        }
        size++;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(E element) {
        return 0;
    }

    //获取index位置节点的对象
    private Node<E> node(int index){
        rangeCheck(index);

        Node<E> node=first;
        for (int i=0;i<index;i++){
            node = node.next;
        }
        return  node;
    }
}
