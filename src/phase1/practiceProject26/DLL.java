package phase1.practiceProject26;

class Node 
{
    int data;
    Node prev, next;

    Node(int data) 
    {
        this.data = data;
        prev = next = null;
    }
}

public class DLL 
{
	Node head;

    void insertEnd(int data) 
    {
        Node newNode = new Node(data);
        if (head == null) 
        {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) 
        {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }

    void traverseForward() 
    {
        Node current = head;
        System.out.println("Forward Traversal:");
        while (current != null) 
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    void traverseBackward() 
    {
        Node current = head;
        if (current == null)
            return;

        while (current.next != null)
            current = current.next;

        System.out.println("Backward Traversal:");
        while (current != null) 
        {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

	public static void main(String[] args) 
	{
		DLL dll = new DLL();
        
        dll.insertEnd(1);
        dll.insertEnd(2);
        dll.insertEnd(3);
        dll.insertEnd(4);

        dll.traverseForward();
        dll.traverseBackward();
	}

}
