package arrayList_linkedlist.danhSach;

import java.lang.reflect.Array;
import java.util.*;

public class MyList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(4);
        linkedList.add(2);
        linkedList.add(9);

        System.out.println(linkedList);

        linkedList.add(3,100000);

        linkedList.addFirst(11111);
        linkedList.addLast(999999);
        System.out.println("do dai cua LinkedList" + linkedList.size());

        System.out.println("phan tu sau khi them : ");
        System.out.println(linkedList);

    }
}
