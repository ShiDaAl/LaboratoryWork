package com.mycompany.queue;

public class Queue<Type> {
    private Node<Type> front;//указатель на передний элемент очереди
    private Node<Type> rear;//указатель на последний элемент очереди
    
    //конструктор
    public Queue() {
        front = null;
        rear = null;
    }
    
    //проверка на пустую очередь
    public boolean isEmpty() {
        return front == null;
    }
    
    //добавление элемента в начало
    public void enQueue(Type content) {
        Node<Type> node = new Node<>(content);
        
        if (isEmpty()) {
            front = node;
            rear = node;
        } else {
            node.setNext(rear);
            rear = node;
        }
    }
    
    //удаление элемента из начала
    public Type deQueue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        
        Node<Type> current;
        Type content = front.getContent();//получаем содержимое переднего элемента 
        
        front = null;//удаляем передний элемент
        current = rear;
        
        //поиск поиск нового начала очереди
        while (current.getNext() != null) {
            current = current.getNext();
        }
        front = current;
        
        return content;
    }
    
    //получение содержимого переднего элемента очереди без его удаления
    public Type Peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        
        return front.getContent();
    }
    
    public void getQueue() {
        Node<Type> current = front;
        while (current.getNext() != null) {
            System.out.println(current.getContent());
        }
    }
    
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();
        
        queue.enQueue("First");
        queue.enQueue("Second");
        queue.enQueue("Third");
        queue.enQueue("Fourth");
        queue.enQueue("Fith");
        
        queue.getQueue();
    }
}
