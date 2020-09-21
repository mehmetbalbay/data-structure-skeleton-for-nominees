import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Example
        LinkedList<Integer> linkedList = new LinkedList<>();

        Node node = new Node(7);
        node.appendToEnd(10);
        node.appendToEnd(4);
        node.appendToEnd(5);
        node.appendToEnd(2);
        node.appendToEnd(1);
        node.appendToEnd(9);
        node.appendToEnd(4);
        node.appendToEnd(2);

        int sum = node.sumOfNodes(node);
        System.out.println(sum);
        System.out.println(node.length(node));
        node.printNodes(node);
        node.deleteNode(node, 10);

        // End of Example
    }
}
