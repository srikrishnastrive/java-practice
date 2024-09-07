
//length of a linked list

class Node{
    int data;
    Node next;
    Node(int data1,Node next1){
        this.data = data1;
        this.next = next1;
    }

    Node (int data1){
        this.data = data1;
    }
}

public class problem_2 {

    public static Node convertArr2LL(int[] arr){
      Node head = new Node(arr[0]);
      Node mover = head;
      for (int i = 1; i < arr.length; i++){
        Node temp = new Node(arr[i]);
        mover.next = temp;
        mover = temp;
      }
      return head;
    }

    public static int lengthOfLL(Node head){
        int count = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,6};
        //traversing in Linkedlist
        Node head = convertArr2LL(arr);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println("\n"+lengthOfLL(head));

    }
}
