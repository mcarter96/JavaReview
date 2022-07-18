# Linked Lists

## Definiton

Like arrays, Linked List is a linear data structure. Unlike arrays, linked list elements are not stored at a contiguous location; the elements are linked using pointers.

## Advantages of Linked Lists

Arrays can be used to store linear data of similar types, but arrays have the following limitations.

- The size of the arrays is fixed: So we must know the upper limit on the number of elements in advance. Also, generally, the allocated memory is equal to the upper limit irrespective of the usage
- Inserting a new element in an array of elements is expensive because the room has to be created for the new elements and to create room existing elements have to be shifted but in Linked List if we have the head node then we can traverse to any node through it and insert new node at the required position
  
- Dynamic size
- Ease of insertion/deletion

## Disadvantages of Linked Lists

- Random access is not allowed. We have to access elements sequentially starting from the first node (head node). So we cannot do binary search with linked lists efficiently with its default implementation.
- Extra memory space for a pointer is required with each element of the list.
- Not cache friendly. Since array elements are contiguous locations, there is locality of reference which is no there in case of linked lists

## Representation of Linked Lists

A linked list is represented by a pointer to the first node of the linked list. The first node is called the head. If the linked list is empty, then the value of the head points to NULL. 

Each node in a list consists of at least two parts:

- A data item (we can store integer, strings, or any type of data)
- Pointer (or Reference) to the next node (connects one node to another) or an address of another node

In Java, LinkedList can be represented as a class and a Node as a separate class. The LinkedList class contains a reference of Node class type

```Java
class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
}
```

## Linked List Traversal

Below is an implementation of a simple traversal for a linked list

```Java
Node head; 

public void printList() {
    Node n = head;
    while (n != null) {
        System.out.print(n.data + " ");
        n = n.next;
    }
}
```

## Linked List Complexity

| Time Complexity | Worst Case  | Average Case  |
| --------------  | ----------- | -----------   |
| Search          | O(n)        | O(n)          |
| Insert          | O(1)        | O(1)          |
| Deletion        | O(1)        | O(1)          |

Space Complexity: O(n)

## Inserting a Node

There are three different ways to insert a node into a linked list. Each will be shown below

- At the front 
- After a given node
- At the end

### Insert at the Beginning of a Linked List

1. Allocate the Node & give Node data
2. Make next pointer of the new Node point to the head
3. Move the head pointer to point at new Node

![Insert Node at Beginning of LinkedList](Linkedlist_insert_at_start.jpeg)

Here is an example of some code to insert the node at the beginning

```Java
public void insertAtBeginning(int newData) {
    Node newNode = new Node(newData);
    newNode.next = head;
    head = newNode;
}
```

### Insert After a Given Node

1. Check if the given Node is null
2. Allocate the Node & give Node data
3. Make next pointer of new Node as the next pointer of the given Node
4. Make next pointer of the given Node point to the new Node

![Insert Node After Given Node](Linkedlist_insert_middle.jpeg)

```Java
public void insertAfterNode(Node prevNode, int newData) {
    if (prevNode == null) {
        System.out.println("The given previous node cannot be null");
        return;
    }

    Node newNode = new Node(newData);

    newNode.next = prevNode.next;

    prevNode.next = newNode;
}
```

### Insert Node at the End

![Insert Node at the End](Linkedlist_insert_last.jpeg)

1. Allocate the Node & give Node data
2. Set the next pointer for the new Node as null
3. Check to see if the linked list is empty. If it is, make the new node the head
4. If the list is not empty, traverse the list to the last node
5. Change the next pointer of the last node to point to the new Node

```Java
public void insertAtEnd(int newData) {
    Node newNode = new Node(newData);
    newNode.next = null;

    if (head == null) {
        head = newNode;
        return;
    }

    Node last = head;
    while (last.next != null) {
        last = last.next;
    }

    last.next = newNode;
    return;
}
```

## Deleting Nodes

Similar to inserting a node, you can delete a node in three different ways

- At the beginning
- After a given ndoe
- At the end

### Sources

[Linked List Notes](https://www.geeksforgeeks.org/linked-list-set-1-introduction/)
