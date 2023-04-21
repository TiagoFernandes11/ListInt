public class test {
    public static void main(String[] args) {
        ListInt list = new ListInt();

        System.out.println(list.size());
        list.add(1);
        System.out.println(list.size());
        list.add(2);
        System.out.println(list.size());
        list.remove(2);
        System.out.println(list.size());

    }
}
