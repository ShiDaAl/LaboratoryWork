package com.mycompany.customlist;

public class MainClass {
    public static void main(String[] args) {
        List<String> list = new List<>();
        list.insertAtEnd("one");
        list.insertAtEnd("two");
        list.insertAtEnd("three");
        list.insertAtStart("zero");
        list.insertAtStart("five");
        
    }
}
