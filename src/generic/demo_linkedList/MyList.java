package generic.demo_linkedList;

import java.util.LinkedList;

public class MyList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("So 1");
        linkedList.add("So 2");
        linkedList.add("So 3");
        linkedList.add("So 4");
        linkedList.add("So 5");
        System.out.println("linkedList khởi tạo : " +linkedList + " và có độ dài là : " + linkedList.size());

        // ADD element
        linkedList.add(3,"so 6");
        linkedList.addLast("end");
        linkedList.addFirst("first");
        System.out.println("linkedList sau khi ADD : " +linkedList + " và có độ dài là : " + linkedList.size());

        //REMOVE
        linkedList.remove(3);
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("linkedList sau khi REMOVE : " +linkedList + " và có độ dài là : " + linkedList.size());

        //ADD ALL
        LinkedList<String> linkedList1 = new LinkedList<>();
        linkedList1.add("thu 2");
        linkedList1.add("thu 3");
        linkedList1.add("thu 4");
        linkedList1.add("thu 5");
        linkedList1.add("thu 6");
        linkedList.addAll(linkedList1);
        System.out.println("linkedList sau khi ADD-ALL : " +linkedList + " và có độ dài là : " + linkedList.size());

    }
}
