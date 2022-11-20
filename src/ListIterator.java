public class ListIterator implements Iterable<Node>{
    private Node current;

    public ListIterator(Node first) {
        current = first;
    }

    public boolean hasNext() {
        return current != null;
    }


    public Node next() {
        Node tempo = current;
        current = current.getNext();
        return tempo;
    }
}
}
