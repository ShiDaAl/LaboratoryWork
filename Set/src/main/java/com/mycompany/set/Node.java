package com.mycompany.set;

public class Node<Type> {
    private Type content;//содержимое
    private Node <Type> prev;//указатель на предыдущий узел
    private Node <Type> next;//указатель на последующий узел
    
    //конструктор
    Node(Type content) {
        this.content = content;
    }
    
    //присвоение узлу содержимого
    public void setContent(Type content) {
        this.content = content;
    }
    
    //получение содержимого узла
    public Type getContent() {
        return content;
    }
    
    //установление указателя на предыдущий узел
    public void setPrev(Node prev) {
        this.prev = prev;
        prev.next = this;
    }
    
    //установление указателя на следующий узел
    public void setNext(Node next) {
        this.next = next;
        next.prev = this;
    }
    
    //получение указателя на предыдущий узел
    public Node getPrev() {
        return prev;
    }
    
    //получение указателя на следующий узел
    public Node getNext() {
        return next;
    }
}
