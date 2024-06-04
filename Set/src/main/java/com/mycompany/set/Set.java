package com.mycompany.set;

public class Set<Type> {
    private Node<Type> head;
    
    //проверка на пустое множество
    public boolean isEmpty() {
        return head == null;
    }
    
    //проверка на наличие заданного элемента
    public boolean contains(Type element) {
        Node<Type> current = head;
        while(current != null) {
            if (current.getContent() == element) {
                return true;
            }
            
            current = current.getNext();
        }
        return false;
    }
    
    //добавление элемента во множество
    public void add(Type content) {
        if (!contains(content)) {
            Node<Type> node = new Node<>(content);
            if (isEmpty()) {
                head = node;//если множество пустое, то добавляемый элемент - голова
            } else {
                Node<Type> current = head;
                while (current.getNext() != null) {
                    current = current.getNext();//если множество не пусто, то идем по нему
                }
                current.setNext(node);
            }
        }
    }
    
    //удаление элемента из множества
    public void remove(Type content) { 
        if (isEmpty()) {
            return; //если множество пустое, то удаление не происходит
        }
        
        if (head.getContent() == content) {
            head = head.getNext();
            return; // если множество не пусто, а удаляемый элемент - голова, удаляем голову
        }
        
        Node<Type> prev = head;
        Node<Type> current = head.getNext();
        while (current != null) {
            if (current.getContent() == content) {
                prev.setNext(current.getNext());
                return;
            }
            prev = current;
            current = current.getNext();
        }
    }
    
    //вывод содержимого множества
    public void getSet() {
        Node<Type> current = head;
        while (current != null) {
            System.out.println(current.getContent());
            current = current.getNext();
        }
    }
    
    
    public static void main(String[] args) {
        Set<String> set = new Set<>();
        
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");
        
        set.getSet();
        
        set.remove("three");
        
        set.getSet();
    }
}
