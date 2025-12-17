package LInkedLIstLL;

import java.util.LinkedList;

public class MiddelInsert {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("this");
        list.addLast("List");
        list.add(1, "is");
        list.add(2, "a");
        System.out.println(list);
    }
}
