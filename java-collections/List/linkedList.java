import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(12);
        ll.add(13);
        ll.addFirst(10);
        ll.addLast(15);
        ll.add(1, 11);
        System.out.println(ll);
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.contains(11));
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
