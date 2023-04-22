public class Node {
    private Integer value;
    private Node next;

    public Node() {
    }

    public Node(Integer valor) {
        this.value = valor;
    }

    public Node(Integer valor, Node next) {
        this.value = valor;
        this.next = next;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer valor) {
        this.value = valor;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
