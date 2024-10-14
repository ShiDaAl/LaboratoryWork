package com.mycompany.schoolclassroommanagment;

public class Pupil {
    private String firstName;
    private String surname;
    private String patronymic;
    private int performance;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    
    public void setPerformance(int performance) {
        this.performance = performance;
    }
        
    public int getPerformance() {
        return performance;
    }
    
    public void study () {
        return;
    }
}
