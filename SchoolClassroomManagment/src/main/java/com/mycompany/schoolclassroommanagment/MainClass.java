package com.mycompany.schoolclassroommanagment;

public class MainClass {
    public static void main(String[] args) {
        Class newClass = new Class();
        Pupil Daniil = new Pupil();
        Pupil Anton = new Pupil();
        Pupil Egor = new Pupil();
        
        Anton.setFirstName("Антон");
        Anton.setSurname("Исаев");
        Anton.setPatronymic("Александрович");
        
        Daniil.setFirstName("Михаил");
        Daniil.setSurname("Шилов");
        Daniil.setPatronymic("Дмитриевич");
        
        Egor.setFirstName("Егор");
        Egor.setSurname("Ерохин");
        Egor.setPatronymic("Витальевич");
        
        newClass.setName('А');
        newClass.setGrade(1);
        newClass.addAStudent(Anton);
        newClass.addAStudent(Daniil);
        newClass.addAStudent(Egor);
        // System.out.println(newClass.getClassList().forEach(() => {}));
        for (var pupil : newClass.getClassList()) {
            System.out.println (pupil.getSurname() + " " + pupil.getFirstName() 
                    + " " + pupil.getPatronymic());
        }
    }
}
