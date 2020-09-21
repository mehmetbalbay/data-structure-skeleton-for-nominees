public class Node {

    Node following = null;

    int data;

    public Node(int data) {
        this.data = data;
    }

    public void appendToEnd(int data) {
        Node end = new Node(data);
        Node n = this;

        while (n.following != null) {
            n = n.following;
        }
        n.following = end;
    }

    // TODO:: Implement to return the length of the SinglyLinkedList
    // For example:: --> 5 --> 6 --> 7 --> 3 --> .
    public void printNodes(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " --> ");
    }

    // TODO:: Implement to return the length of the SinglyLinkedList
    int length(Node h) {
        if (h == null) {
            return 0;
        }
        int count = 0;
        Node current = h;
        while (current != null) {
            count++;
            // move to next node
            current = current.following;
        }
        return count;
    }

    // TODO:: Implement to return the sum of the Nodes
    int sumOfNodes(Node node) {
        if (node == null) {
            return 0;
        }

        int sum = 0;
        while (node != null) {
            sum = sum + node.data;
            node = node.following;
        }

        return sum;
    }

    Node deleteNode(Node head, int data) {
        Node n = head;
        if (n.data == data) {
            return head.following;
        }
        // TODO:: Implement the proper loop in order to remove given data

        //
        return head;
    }
}