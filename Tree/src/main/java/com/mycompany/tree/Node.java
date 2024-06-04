package com.mycompany.tree;


public class Node {
    private int content;//содержимое
    private Node left;//указатель на предыдущий узел
    private Node right;//указатель на последующий узел
    
    //конструктор
    Node(int content) {
        this.content = content;
        left = null;
        right = null;
    }
    
    //присвоение узлу содержимого
    public void setContent(int content) {
        this.content = content;
    }
    
    //получение содержимого узла
    public int getContent() {
        return content;
    }
    
    //установление указателя на левого сына
    public void setLeft(Node left) {
        this.left = left;
    }
    
    //установление указателя на правого сына
    public void setRight(Node right) {
        this.right = right;
    }
    
    //получение указателя на левого сына
    public Node getLeft() {
        return left;
    }
    
    //получение указателя на правого сына
    public Node getRight() {
        return right;
    }
}
