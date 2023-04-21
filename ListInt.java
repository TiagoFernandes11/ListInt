public class ListInt {
    private Node node;

    public ListInt() {
    }

    public void add(int number) {
        if (node == null) {
            node = new Node(number);
            return;
        } else {
            Node aux = this.node;
            while (node.getNext() != null) {
                aux = aux.getNext();
            }
            aux.setNext(new Node(number));
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

    public void remove(int number) {
        Node previousNode = null;
        Node currentNode = this.node;

        while (currentNode.getValor() != number) {
            previousNode = currentNode;
            currentNode = currentNode.getNext();
            if (currentNode == null) {
                return;
            }
        }
        previousNode.setNext(currentNode.getNext());
    }

}
