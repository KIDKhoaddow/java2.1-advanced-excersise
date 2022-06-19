package Exercise;

import java.util.LinkedList;

public class MyLinkedList {
    private  Node head;

    private  int numNodes=0;

    public  MyLinkedList(Object data){
        head= new Node(data);
    }

    public void add(int index , Object data){
        Node temp= head;
        Node holder;
        for (int i = 0; i < index-1&& temp.next !=null; i++) {
            temp=temp.next;
        }
        holder=temp.next;
        temp.next= new Node(data);
        temp.next.next=holder;
        numNodes++;
    }
    public  void  addLast(Object data){
        Node temp=head;
        numNodes++;
        Node holder;
        for (int i = 0; i <numNodes-1&&temp.next!=null ; i++) {
            temp=temp.next;
        }
        holder=temp.next;
        temp.next=new Node(data);
        temp.next.next=holder;

    }
    public void addFirst(Object data){
        Node temp=head;
        head= new Node(data);
        head.next=temp;
        numNodes++;
    }

    public  int size(){
        return numNodes;
    }
    public boolean contains(Object o) {

        return indexOf(o) != -1;
    }
    public int indexOf(Object o) {
        int index = 0;
        if (o == null) {
            for (Node x = head; x != null; x = x.next) {
                if (x.data == null)
                    return index;
                index++;
            }
        } else {
            for (Node x = head; x != null; x = x.next) {
                if (o.equals(x.data))
                    return index;
                index++;
            }
        }
        return -1;
    }
    public  Node get(int index){
        Node temp=head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        return  temp;
    }
    public Object getFirst(){
        Node temp=head;
        return temp.data;
    }
    public  Object getLast(){
        Node temp=head;
        for (int i = 0; i>numNodes ; i++) {
            temp=temp.next;
        }
        return  temp.data;
    }
    public  void  clear(){
        Node temp=head;
        for (int i = 0; i <=numNodes ; i++) {
            temp.data=null;
            temp= temp.next;
        }
        numNodes=0;
    }

    public  void printList(){
        Node temp =head;
        while (temp !=null){
            System.out.println("temp = " + temp.data);
            temp=temp.next;
        }

    }
    public static class Node {
        private  Node next;
        private  Object data;


        public Node(Object data){
            this.data =data;
        }

        public Object getData() {
            return this.data;
        }

    }
}
