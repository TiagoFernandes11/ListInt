public class test {
    // ja adicionados e testados: add, size, remove, get;
    public static void main(String[] args) {
        ListInt list = new ListInt();

        list.add(1);
        list.add(1);
        list.add(1);
        list.add(6);
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println(list.size());
        System.out.println(list.get(3));
        list.remove(6);
        System.out.println(list.size());
        System.out.println(list.get(3));

    }
}
