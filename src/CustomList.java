public class CustomList<T> implements Iterable<Node> {
    private Node<T> head;
    private Node<T> tail;

    public CustomList() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }
    public void push(T data) {
        Node tempo = new Node();
        tempo.setData(data);
        tempo.setNext(null);

        if (head == null) {
            tempo.setPrev(null);
            head = tail = tempo;
        } else {
            tempo.setPrev(tail);
            tail.setNext(tempo);
            tail =  tempo;
        }
    }
    @Override
    public Iterable<Node> iterator() {
        return new ListIterator(head);
    }
}
