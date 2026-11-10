package linklist;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node head;
    Node tail;
   // int size ;

    public void insertNodeInFront(int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }

    public void insertNodeInMiddle(int data, int index) {
        Node newNode = new Node(data);
        Node temp = head;
        if (index == listSize()) {
            insertNodeInEnd(data);
            return;
        } else if (index == 0) {
            insertNodeInFront(data);
            return;
        } else if (index < 0 && index > listSize()) {
            System.out.println("provided index is not correct");
            return;
        }
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void insertNodeInEnd(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }

    public int searchData(int data) {
        Node temp = head;
        int index = 0;
        boolean flag = false;
        while (temp != null) {
            if (temp.data == data) {
                flag = true;
                break;
            }
            temp = temp.next;
            index++;
        }
        if (flag == true)
            return index + 1;
        else {
            return -1;
        }
    }

    public void traverselist() {
        Node temp;
        temp = head;
        while (temp != null) {
            System.out.println("Link list data is ::=> " + temp.data);
            temp = temp.next;
        }
    }

    public int listSize() {
        Node temp=head;
        int size=0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        return size;
    }
    public void deleteNodeAt(int index) {
        Node temp=head;
        for(int i=0;i<index-1;i++)
        {
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
}

public class CreateSinglyLinkList {
    public static void main(String[] args) {
        LinkedList obj1 = new LinkedList();
        obj1.insertNodeInEnd(10);
        obj1.insertNodeInEnd(20);
        obj1.insertNodeInEnd(30);
        obj1.insertNodeInEnd(40);
        obj1.insertNodeInEnd(50);
        obj1.insertNodeInEnd(60);
        obj1.insertNodeInEnd(80);
        obj1.insertNodeInEnd(90);
        obj1.insertNodeInFront(-10);
        obj1.insertNodeInFront(-20);
        obj1.insertNodeInFront(-30);
        obj1.insertNodeInMiddle(25, 5);
        obj1.traverselist();
        System.out.println("Size of List is ::=>" + obj1.listSize());
        System.out.println("Provided Element results ::=>" + obj1.searchData(80));
        System.out.println("Provided Element results ::=>" + obj1.searchData(-20));
        obj1.deleteNodeAt(4);
        obj1.traverselist();
        System.out.println("Size of List after deletion is ::=>" + obj1.listSize());
    }
}
