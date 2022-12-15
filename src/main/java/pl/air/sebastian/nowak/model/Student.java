package pl.air.sebastian.nowak.model;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class Student {

    private String Name;
    private double grade;

    private static List<Double> validGrades  = List.of(2.0,3.0,3.5,4.0,4.5,5.0);

    // *********************** Constructor ************************
    public Student(String Name, double grade){
        if(! validGrades.contains(grade)){
            try {
                throw new IllegalAccessException("Błąd: " + grade + " nie jest poprawna oceną!");
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        this.Name = Name;
        this.grade = grade;
    }


}
