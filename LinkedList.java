/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;
/**
 *
 * @author valentinwendling
 */


class Node<T extends Comparable<T>> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList<T extends Comparable<T>> {
    private Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Getter for size
    public int getSize() {
        int size = 0;
        Node<T> current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    // Getter for element at index
    public T getElementAtIndex(int index) {
        if (index < 0 || index >= getSize()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }

    // Setter for element at index
    public void setElementAtIndex(int index, T data) {
        if (index < 0 || index >= getSize()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.data = data;
    }

    public void bubbleSort() {
        if (head == null || head.next == null) {
            return;
        }

        boolean swapped;
        do {
            swapped = false;
            Node<T> current = head;
            Node<T> previous = null;

            while (current.next != null) {
                if (current.data.compareTo(current.next.data) > 0) {
                    // Swap nodes
                    Node<T> temp = current.next;
                    current.next = temp.next;
                    temp.next = current;

                    if (previous == null) {
                        head = temp;
                    } else {
                        previous.next = temp;
                    }

                    swapped = true;
                }

                previous = current;
                current = current.next;
            }
        } while (swapped);
    }

    public void insertionSort() {
        if (head == null || head.next == null) {
            return;
        }

        Node<T> sorted = null;
        Node<T> current = head;

        while (current != null) {
            Node<T> next = current.next;

            if (sorted == null || sorted.data.compareTo(current.data) > 0) {
                // Insert at the beginning of the sorted list
                current.next = sorted;
                sorted = current;
            } else {
                // Find the correct position to insert
                Node<T> temp = sorted;
                while (temp.next != null && temp.next.data.compareTo(current.data) < 0) {
                    temp = temp.next;
                }
                current.next = temp.next;
                temp.next = current;
            }

            current = next;
        }

        head = sorted;
    }

    public void mergeSort() {
        head = mergeSort(head);
    }

    private Node<T> mergeSort(Node<T> start) {
        if (start == null || start.next == null) {
            return start;
        }

        // Find the middle of the list
        Node<T> middle = getMiddle(start);
        Node<T> nextOfMiddle = middle.next;

        // Break the list into two halves
        middle.next = null;

        // Apply mergeSort on the left and right halves
        Node<T> left = mergeSort(start);
        Node<T> right = mergeSort(nextOfMiddle);

        // Merge the sorted halves
        return merge(left, right);
    }

    private Node<T> merge(Node<T> left, Node<T> right) {
        Node<T> result = null;

        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }

        if (left.data.compareTo(right.data) <= 0) {
            result = left;
            result.next = merge(left.next, right);
        } else {
            result = right;
            result.next = merge(left, right.next);
        }

        return result;
    }

    private Node<T> getMiddle(Node<T> start) {
        if (start == null) {
            return start;
        }

        Node<T> slow = start, fast = start;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.add(2);
        linkedList.add(8);
        linkedList.add(1);

        System.out.println("Original List:");
        linkedList.display();

        // Bubble Sort
        linkedList.bubbleSort();
        System.out.println("Sorted List (Bubble Sort):");
        linkedList.display();

        // Insertion Sort
        linkedList.insertionSort();
        System.out.println("Sorted List (Insertion Sort):");
        linkedList.display();

        // Merge Sort
        linkedList.mergeSort();
        System.out.println("Sorted List (Merge Sort):");
        linkedList.display();
    }
}
