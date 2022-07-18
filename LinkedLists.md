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


### Sources

[Linked List Notes](https://www.geeksforgeeks.org/linked-list-set-1-introduction/)
