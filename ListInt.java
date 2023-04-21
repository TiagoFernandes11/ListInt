public class ListInt {
    private Node node;

    public ListInt() {
    }

    public void add(int numero) {
        if (node == null) {
            node = new Node(numero);
            return;
        } else {
            Node aux = this.node;
            while (node.getNext() != null) {
                aux = aux.getNext();
            }
            aux.setNext(new Node(numero));
        }
    }

    public int size() {
        if (node == null) {
            return 0;
        }

        int count = 1;
        Node aux = this.node;
        while (aux.getNext() != null) {
            aux = aux.getNext();
            count++;
        }
        return count;
    }

}
