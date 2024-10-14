package com.mycompany.schoolclassroommanagment;

public abstract class Class {
    private char name;
    private int grade;
    private java.util.ArrayList<Pupil> classList = new java.util.ArrayList<>();

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    public java.util.ArrayList<Pupil> getClassList() {
        return this.classList;
    }
    
    public void addAStudent(Pupil student) {
        this.classList.add(student);
    }
    
    public void setClassList(java.util.ArrayList<Pupil> classList) {
        this.classList = classList;
    }
}
