//search in the Linkedlist


class Node {
    int data;
    Node next;
    
    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}

public class problem_3 {

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

    public static int checkIfpresent(Node head, int val){
        Node temp = head;
        while (temp != null) {
            if(temp.data == val) return 1;
            temp = temp.next;
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,6,7};

        Node head = convertArr2LL(arr);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        int ans = checkIfpresent(head, 6);
        System.out.println("\n"+ans);

    }
}
