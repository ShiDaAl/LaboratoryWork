package com.mycompany.stack;

public class Stack<Type> {
    private Node<Type> top;//указатель на вершину стека

    //конструктор
    public Stack() {
        top = null;
    }
    
    //проверка на пустой стек
    public boolean isEmpty() {
        return top == null;
    }
    
    //добавление элемента в стек
    public void push(Type content) {
        Node<Type> node = new Node<>(content);
        if (!isEmpty()) {
            node.setNext(top);
        }
        top = node;
    }
    
    //удаление элемента из стека
    public Type pop() {
        if(isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        Type content = top.getContent();
        
        top = top.getNext();
        return content;
    }
    
    //получение содержимого вершины без её удаления
    public Type peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        } 
        return top.getContent();
    }
    
    //вывод стека
    public void getStack() {
        Node<Type> current;
        current = top;
        
        while(current != null) {
            System.out.println(current.getContent());
            current = current.getNext();
        }
    }
    
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        
        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("five");
        stack.push("six");
        
        stack.getStack();
        
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        
        stack.getStack();
        
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        
//stack.getStack();
        
        //System.out.println(stack.peek());
    }
}
