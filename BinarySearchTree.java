/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author valentinwendling
 */
class BinarySearchTreeNode<T extends Comparable<T>> {
    T data;
    BinarySearchTreeNode<T> left;
    BinarySearchTreeNode<T> right;

    public BinarySearchTreeNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinarySearchTree<T extends Comparable<T>> {
    private BinarySearchTreeNode<T> root;

    public BinarySearchTree() {
        this.root = null;
    }

    public BinarySearchTreeNode<T> getRoot() {
        return root;
    }

    // Insérer un élément dans l'arbre
    public void insert(T data) {
        root = insertRec(root, data);
    }

    private BinarySearchTreeNode<T> insertRec(BinarySearchTreeNode<T> root, T data) {
        if (root == null) {
            root = new BinarySearchTreeNode<>(data);
            return root;
        }

        if (data.compareTo(root.data) < 0) {
            root.left = insertRec(root.left, data);
        } else if (data.compareTo(root.data) > 0) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    // Rechercher un élément dans l'arbre
    public boolean search(T data) {
        return searchRec(root, data);
    }

    private boolean searchRec(BinarySearchTreeNode<T> root, T data) {
        if (root == null) {
            return false;
        }

        if (data.compareTo(root.data) == 0) {
            return true;
        } else if (data.compareTo(root.data) < 0) {
            return searchRec(root.left, data);
        } else {
            return searchRec(root.right, data);
        }
    }

    // Affichage préfixe (Pre-order traversal)
    public void preOrderTraversal() {
        preOrderTraversalRec(root);
        System.out.println();
    }

    private void preOrderTraversalRec(BinarySearchTreeNode<T> node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderTraversalRec(node.left);
            preOrderTraversalRec(node.right);
        }
    }

    // Affichage infixé (In-order traversal)
    public void inOrderTraversal() {
        inOrderTraversalRec(root);
        System.out.println();
    }

    private void inOrderTraversalRec(BinarySearchTreeNode<T> node) {
        if (node != null) {
            inOrderTraversalRec(node.left);
            System.out.print(node.data + " ");
            inOrderTraversalRec(node.right);
        }
    }

    // Affichage postfixe (Post-order traversal)
    public void postOrderTraversal() {
        postOrderTraversalRec(root);
        System.out.println();
    }

    private void postOrderTraversalRec(BinarySearchTreeNode<T> node) {
        if (node != null) {
            postOrderTraversalRec(node.left);
            postOrderTraversalRec(node.right);
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        bst.insert(8);
        bst.insert(3);
        bst.insert(10);
        bst.insert(1);
        bst.insert(6);
        bst.insert(14);

        System.out.println("Affichage préfixe:");
        bst.preOrderTraversal();

        System.out.println("Affichage infixé:");
        bst.inOrderTraversal();

        System.out.println("Affichage postfixe:");
        bst.postOrderTraversal();

        System.out.println("Recherche de l'élément 6: " + bst.search(6));
    }
}

