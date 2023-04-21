public class ListInt {
    private Node head;

    public ListInt() {
    }

    public void add(int number) {
        if (head == null) {
            head = new Node(number);
            return;
        } else {
            Node aux = head;
            while (aux.getNext() != null) {
                aux = aux.getNext();
            }
            aux.setNext(new Node(number));
        }
    }

    public int size() {
        if (head == null) {
            return 0;
        }
        int count = 1;
        Node aux = this.head;
        while (aux.getNext() != null) {
            aux = aux.getNext();
            count++;
        }
        return count;
    }

    public void remove(int number) {
        Node previousNode = null;
        Node currentNode = this.head;

        while (currentNode.getValor() != number) {
            previousNode = currentNode;
            currentNode = currentNode.getNext();
            if (currentNode == null) {
                return;
            }
        }
        previousNode.setNext(currentNode.getNext());
    }

    public Integer get(int index) {
        if (index + 1 > size()) {
            System.out.println("Numero invalido");
            return null;
        }

        int count = 0;
        Node aux = this.head;
        while (count != index && count < size()) {
            aux = aux.getNext();
            count++;
        }
        return aux.getValor();
    }

    public void insert(int position, int number) {
        int count = 0;
        Node aux = head;
        while (count < position && count < size()) {
            aux = aux.getNext();
            count++;
        }
        Node temp = new Node(aux.getValor(), aux.getNext()) ;
        aux.setValor(number);
        aux.setNext(temp);
    }

    public boolean contains(int number){
        int count = 0;
        Node aux = head;
        while(count < size()){
            if(aux.getValor() == number){
                return true;
            }
            aux = aux.getNext();
            count++;
        }
        return false;
    }
}
