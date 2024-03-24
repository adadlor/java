/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author valentinwendling
 */
import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> elements = new LinkedList<>();

    // Ajouter un élément à la pile
    public void push(T item) {
        elements.addFirst(item);
    }

    // Retirer un élément de la pile
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pile est vide");
        }
        return elements.removeFirst();
    }

    // Vérifier si la pile est vide
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    // Obtenir la taille de la pile
    public int size() {
        return elements.size();
    }

    // Obtenir l'élément au sommet de la pile sans le retirer
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La pile est vide");
        }
        return elements.getFirst();
    }

    // Afficher les éléments de la pile
    public void display() {
        for (T item : elements) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        System.out.println("Pile:");
        stack.display();

        System.out.println("Taille de la pile: " + stack.size());
        System.out.println("Élément au sommet: " + stack.peek());

        System.out.println("Retrait de l'élément au sommet: " + stack.pop());
        System.out.println("Pile après retrait:");
        stack.display();
    }
}

