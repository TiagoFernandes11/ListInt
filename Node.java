public class Node {
    private Integer valor;
    private Node next;
    
    public Node() {
    }

    public Node(Integer valor) {
        this.valor = valor;
    }

    public Node(Integer valor, Node next) {
        this.valor = valor;
        this.next = next;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    
}
