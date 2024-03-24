/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author valentinwendling
 */
import java.util.LinkedList;

public class Queue<T> {
    private LinkedList<T> elements = new LinkedList<>();

    // Ajouter un élément à la file
    public void enqueue(T item) {
        elements.addLast(item);
    }

    // Retirer un élément de la file
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("La file est vide");
        }
        return elements.removeFirst();
    }

    // Vérifier si la file est vide
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    // Obtenir la taille de la file
    public int size() {
        return elements.size();
    }

    // Obtenir l'élément en tête de la file sans le retirer
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La file est vide");
        }
        return elements.getFirst();
    }

    // Afficher les éléments de la file
    public void display() {
        for (T item : elements) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(3);

        System.out.println("File:");
        queue.display();

        System.out.println("Taille de la file: " + queue.size());
        System.out.println("Élément en tête: " + queue.peek());

        System.out.println("Retrait de l'élément en tête: " + queue.dequeue());
        System.out.println("File après retrait:");
        queue.display();
    }
}
