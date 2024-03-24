/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author valentinwendling
 */
import java.util.LinkedList;
import java.util.List;

class TreeNode<T> {
    T data;
    List<TreeNode<T>> children;

    public TreeNode(T data) {
        this.data = data;
        this.children = new LinkedList<>();
    }

    public void addChild(TreeNode<T> child) {
        this.children.add(child);
    }
}

public class GeneralTree<T> {
    private TreeNode<T> root;

    public GeneralTree(T data) {
        this.root = new TreeNode<>(data);
    }

    public TreeNode<T> getRoot() {
        return root;
    }

    // Ajouter un enfant à un nœud donné
    public void addChild(TreeNode<T> parent, T data) {
        TreeNode<T> child = new TreeNode<>(data);
        parent.addChild(child);
    }

    // Affichage préfixe (Pre-order traversal)
    public void preOrderTraversal() {
        preOrderTraversalRec(root);
        System.out.println();
    }

    private void preOrderTraversalRec(TreeNode<T> node) {
        if (node != null) {
            System.out.print(node.data + " ");
            for (TreeNode<T> child : node.children) {
                preOrderTraversalRec(child);
            }
        }
    }

    // Affichage postfixe (Post-order traversal)
    public void postOrderTraversal() {
        postOrderTraversalRec(root);
        System.out.println();
    }

    private void postOrderTraversalRec(TreeNode<T> node) {
        if (node != null) {
            for (TreeNode<T> child : node.children) {
                postOrderTraversalRec(child);
            }
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) {
        GeneralTree<String> generalTree = new GeneralTree<>("A");

        TreeNode<String> nodeB = new TreeNode<>("B");
        TreeNode<String> nodeC = new TreeNode<>("C");
        TreeNode<String> nodeD = new TreeNode<>("D");
        TreeNode<String> nodeE = new TreeNode<>("E");

        generalTree.getRoot().addChild(nodeB);
        generalTree.getRoot().addChild(nodeC);
        nodeB.addChild(nodeD);
        nodeB.addChild(nodeE);

        System.out.println("Affichage préfixe:");
        generalTree.preOrderTraversal();

        System.out.println("Affichage postfixe:");
        generalTree.postOrderTraversal();
    }
}

