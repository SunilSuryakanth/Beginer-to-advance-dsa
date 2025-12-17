package ArrayLists;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLIst {
    public static void main(String[] args) {
        //Integer | Bolean | String | Floate
        ArrayList<Integer> list = new ArrayList<Integer>();
//        ArrayList<String> list1 = new ArrayList<String>();
//        ArrayList<Boolean> list2 = new ArrayList<>();

        //add elements
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(2);
        System.out.println(list);

        //get elements
       // System.out.println(list.get(3));
       int element = list.get(1);
        // System.out.println(element);

        //add elements in between
        list.add(3, 3);
        System.out.println(list);

        //set element
        list.set(4, 4);
        System.out.println(list);

        //delet element
        list.remove(4);
        System.out.println(list);

        //size
        System.out.println(list.size());

        //loops
        for (int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        //sorting
        Collections.sort(list);
    }
}
