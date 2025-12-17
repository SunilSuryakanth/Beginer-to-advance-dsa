//package LInkedLIstLL;
//import org.w3c.dom.Node;
//
//import java.util.*;
//public class ReverseLL {
//    public void reverseIterate() {
//
//        Node preNode = head;
//        Node currNode = head.next;
//        while (currNode != null) {
//            Node nextNode = currNode.next;
//            currNode.next = preNode;
//
//            //Update
//            preNode = currNode;
//            currNode = nextNode;
//        }
//        head.next = null;
//        head = preNode;
//    }
//
//    public static void main(String[] args) {
//        LinkedList<Integer> list5 = new LinkedList<>();
//        list5.add(1);
//        list5.add(2);
//        list5.add(3);
//        list5.
//    }
//}