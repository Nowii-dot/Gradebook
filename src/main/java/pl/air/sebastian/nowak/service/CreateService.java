package pl.air.sebastian.nowak.service;

import pl.air.sebastian.nowak.model.Student;

import java.util.Scanner;

public class CreateService {

    private static Scanner console = new Scanner(System.in);

    public void CreateStudent(EduService edu){
        System.out.println("Wprowadź imię i nazwisko: ");
        String line = console.nextLine();
        System.out.println("Wprowadz ocene: ");
        double grade = console.nextDouble();

        edu.insertStudent(new Student(line,grade));

    }
    public static void insertData(EduService edu){


        Student student1 = new Student("Adam",3);
        edu.insertStudent(student1);

        Student student2 = new Student("Ewa",4.5);
        edu.insertStudent(student2);

        edu.insertStudent(new Student("Jan Kowalski", 3.0));
        edu.insertStudent(new Student("Antoni Zbożny", 4.5));
        edu.insertStudent(new Student("Marek Janusz", 3.5));
        edu.insertStudent(new Student("Adam Kowala", 5.0));
        edu.insertStudent(new Student("Ewa Demarczyk", 2.0));
        edu.insertStudent(new Student("Aleksandra Nowak", 4.0));
        edu.insertStudent(new Student("adam", 4.5));
    }

}
