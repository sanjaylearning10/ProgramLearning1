package linklist;

public class CreateLinkList {
    Node head;
   static class Node {
       int data;
       Node next;
       Node(int data)
       {
           this.data=data;
           this.next=null;
       }
   }

    public static void main(String[] args) {
        CreateLinkList obj=new CreateLinkList();
        insert(obj,1);
        insert(obj,2);
        insert(obj,3);
        insert(obj,4);
        insert(obj,5);
        insert(obj,6);
        insert(obj,7);
        print(obj);
    }
    public static void insert(CreateLinkList list,int data)
    {
      Node new_node=new Node(data);

      if(list.head==null)
      {
          list.head=new_node;
      }
      else {
          Node curr_node=list.head;
          while (curr_node.next!=null) {
              curr_node=curr_node.next;
          }
          curr_node.next=new_node;

      }


    }
    public static void print(CreateLinkList list)
    {
        Node curr_node=list.head;
      while (curr_node.next!=null)
      {
          System.out.println(curr_node.data+" ");
          curr_node=curr_node.next;
      }



    }
}
