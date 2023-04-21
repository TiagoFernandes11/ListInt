public class ListInt {
    private Node node;

    public ListInt() {
    }

    public void add(int n) {
        if (node.getValor() == null) {
            node = new Node(n);
            return;
        } else {
            Node aux = this.node;
            while (node.getNext() != null) {
                aux = aux.getNext();
            }
            aux.setNext(new Node(n));
        }
    }

    public int size(){
        if(node.getValor() == null){
            return 0;
        }
    }

}
