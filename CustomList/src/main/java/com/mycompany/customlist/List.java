package com.mycompany.customlist;

public class List <Type> {
    private Node <Type> head; //голова списка
    private int size; //хвост списка
    
    //конструктор
    public List() {
        head = null;
        size = 0;
    }
    
    //получение длины списка
    public int getSize() {
        return size;
    }
    
    //добавление узла в начало списка
    public void insertAtStart(Type content) {
        Node <Type> node = new Node<>(content);
        if (isEmpty()) {
            head = node;
        } else {
            node.setNext(head);
            head = node;
        }
        size++;
    }
    
    //добавление элемента на указанную позицию
    public void insertAtPozition(Type content, int position) {
        if (position < 0 || position > size) {
            throw new IndexOutOfBoundsException("Invalid pozition");
        }
        if (position == 0) {
            insertAtStart(content);
        } else if (position == size) {
            insertAtEnd(content);
        } else {
            Node <Type> node = new Node<>(content);
            Node <Type> current = head;
            int currentPosition = 0;
            while (currentPosition < position) {
                current = current.getNext();
                currentPosition++;
            }
            current.getPrev().setNext(node);
            current.setPrev(node);
            size++;
        }
    }
    
    //удаление элемента с начала 
    public void deleteFromStart() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty");
        }
        head = head.getNext();
        size--;
    }
    
    //удаление элемента с конца
    public void deleteFromEnd() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty");
        }
        if (size == 1) {
            head = null;
        } else {
            Node <Type> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current = null;
        }
        size--;
    }
    
    //удаление элемента с указанной позиции
    public void deleteFromPosition(int position) {
        if (isEmpty() || position < 0 || position >= size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        if (position == 0) {
            deleteFromStart();
        } else if (position == size-1) {
            deleteFromEnd();
        } else {
            Node<Type> current = head;
            int currentPosition = 0;
            while (currentPosition < position) {
                current = current.getNext();
                currentPosition++;
            }
            Node<Type> prev = current.getPrev();
            Node<Type> next = current.getNext();
            
            prev.setNext(next);
            next.setPrev(prev);
            size--;
        }
    }
    
    //получение содержимого указанного по номеру элемента
    public Type get(int position) {
        if (isEmpty() || position < 0 || position >= size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        Node<Type> current = head;
        int currentPosition = 0;
        while (currentPosition < position) {
            current = current.getNext();
            currentPosition++;
        }
        return current.getContent();
    }
    
    //печать всего списка
    public void getOnMyScreen() {
        if (isEmpty()) {
            System.out.println("List is empty");;
        }
        Node<Type> current = head;
        int currentPosition = 0;
        while (currentPosition < size) {
            System.out.println(current.getContent());;
            current = current.getNext();
            currentPosition++;
        }
    }
    
    //добавление элемента в конец списка
    public void insertAtEnd(Type content) {
        Node <Type> node = new Node<>(content);
        if (isEmpty()) {
            head = node;
        } else {
            Node <Type> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(node);
        }
        size++;
    }
     
    //проверка на пустой список
    public boolean isEmpty() {
       return this.head == null;
    }
     
    //преобразование списка в массив
    public Object[] toArray() {
        Object[] array = new Object[size];
        Node<Type> current = head;
        int currentPosition = 0;
        while(current != null) {
            array[currentPosition] = current.getContent();
            current = current.getNext();
            currentPosition++;
        }
        return array;
    }
}
