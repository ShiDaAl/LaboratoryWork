package com.mycompany.tree;


public class Tree {
    private Node root;
    
    //конструктор
    public Tree() {
        root = null;
    }
    
    public void insert(int content) {
        root = insertRecursive(root,content);
    }
    
    public Node insertRecursive(Node current, int content) {
        if (current == null) {
            return new Node(content);
        }
        
        if (content < current.getContent()) {
            current.setLeft(insertRecursive(current.getLeft(),content));
        } else if (content > current.getContent()) {
            current.setRight(insertRecursive(current.getRight(),content));
        }
        
        return current;
    }
    
    public boolean search(int content) {
        return searchRecursive(root,content);
    }
    
    public boolean searchRecursive(Node current,int content) {
        if (current == null) {
            return false;
        }
        
        if (content == current.getContent()) {
            return true;
        }
        
        if (content < current.getContent()) {
            return searchRecursive(current.getLeft(),content);
        } else {
            return searchRecursive(current.getRight(),content);
        }
    }
    
    public void delete(int content) {
        root = deleteRecursive(root, content);
    }

    // Рекурсивный метод для удаления значения из бинарного дерева
    private Node deleteRecursive(Node current, int content) {
        if (current == null) {
            return null;
        }

        if (content == current.getContent()) {
            // Узел не имеет потомков
            if (current.getLeft() == null && current.getRight() == null) {
                return null;
            }

            // Узел имеет только одного потомка
            if (current.getRight() == null) {
                return current.getLeft();
            }

            if (current.getLeft() == null) {
                return current.getRight();
            }

            // Узел имеет двух потомков
            int smallestValue = findSmallestValue(current.getRight());
            current.setContent(smallestValue);
            current.setRight(deleteRecursive(current.getRight(), smallestValue));
            return current;
        }

        if (content < current.getContent()) {
            current.setLeft(deleteRecursive(current.getLeft(), content));
            return current;
        }

        current.setRight(deleteRecursive(current.getRight(), content));
        return current;
    }

    // Метод для поиска наименьшего значения в поддереве
    private int findSmallestValue(Node root) {
        return root.getLeft() == null ? root.getContent() : findSmallestValue(root.getLeft());
    }
    
    public static void main(String[] args) {
        Tree tree = new Tree();
        
        tree.insert(8);
        tree.insert(11);
        tree.insert(14);
        tree.insert(55);
        tree.insert(9);
        tree.insert(6);
        tree.insert(3);
        tree.insert(83);
        
        System.out.println(tree.search(55));
        System.out.println(tree.search(23));
        
        tree.delete(14);
        tree.delete(9);
        tree.delete(11);
        tree.delete(83);
        
        System.out.println(tree.search(11));
    }
}
