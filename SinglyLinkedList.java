public class SinglyLinkedList {
    public static void main(String[] args) {
        // int count = 6;
        LinkedList linkedList = new LinkedList();
        // for (int i = 1; i <= count; i++) {
        // linkedList.addNode(new Node(i * 10));
        // }

        // linkedList.printList();

        // for (int i = count; i >= 1; i--) {
        // Node newNode = new Node((10 * i) + 5);
        // linkedList.addNode(i, newNode);
        // }
        // linkedList.printList();

        linkedList.addNode(new Node(2));
        linkedList.printList();
    }
}

interface INode {
    // Returns value of the node
    int val();

    // Returns reference of the next node
    Node next();

}

class Node implements INode {
    private int value;
    private Node nextNode;

    public Node(int value, Node nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }

    public Node(int value) {
        // To Use Multiple Constructors, Use this()
        this(value, null);
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public int val() {
        return this.value;
    }

    @Override
    public Node next() {
        return this.nextNode;
    }
}

class LinkedList {
    private Node headPointer;

    public LinkedList() {
        this.headPointer = new Node(0, null);
    }

    public void addNode(Node newNode) {
        // in case of adding node, we will check if the headnode point to any node
        // if not add newNode to headnode otherwise add newnode to last node
        Node currNode = headPointer;
        while (currNode.next() != null) {
            currNode = currNode.next();
        }
        currNode.setNextNode(newNode);
    }

    public void addNodeStart(Node newNode) {
        // in case of adding node, we will check if the headnode point to any node
        // if not add newNode to headnode
        this.addNode(0, newNode);
    }

    /**
     * @param n
     *                is the number of nodes after which the nodes should be added
     * @param newNode
     *                <p>
     *                Joins node after n nodes from the beginning.
     *                If n is larger that the lenght of list, attaches node at the
     *                end of list
     *                </p>
     */
    public void addNode(int n, Node newNode) {
        // in case of adding node, we will check if the headnode point to any node
        // if not add newNode to headnode
        Node currNode = this.headPointer;
        boolean nIsShorter = true;
        for (int i = 0; i < n; i++) {
            if (currNode.next() != null) {
                currNode = currNode.next();
            } else {
                nIsShorter = false;
                break;
            }
        }
        if (nIsShorter) {
            Node temp = currNode.next();
            currNode.setNextNode(newNode);
            newNode.setNextNode(temp);
        } else {
            currNode.setNextNode(newNode);
        }

    }

    public void printList() {
        // Printing will start from the first node, if the linkedlist has any
        Node currNode = this.headPointer.next();
        while (currNode != null) {
            System.out.print(currNode.val() + " -> ");
            currNode = currNode.next();
        }
        System.out.print("null\n");
    }
}
