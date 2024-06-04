package com.mycompany.queue;

public class Node<Type> {
    private Type content;
    private Node<Type> next;
    
    public Node(Type content) {
        this.content = content;
        next = null;
    }
    
    public Node getNext() {
        return next;
    }
    
    public void setNext(Node node) {
        next = node;
    }
    
    public Type getContent() {
        return content;
    }
}
