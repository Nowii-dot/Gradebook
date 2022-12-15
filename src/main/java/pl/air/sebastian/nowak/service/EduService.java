package pl.air.sebastian.nowak.service;

import pl.air.sebastian.nowak.model.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EduService {

    private List<Student> students = new ArrayList<>();

    public void insertStudents() {
        while (true){
            String name = ReadService.ReadString("Imie naziwsko: ");
            if(name.equals("")){
                break;
            }
            double grade = ReadService.ReadGrade("Ocena: ");

            try {
                Student s = new Student(name, grade);
                students.add(s);
            }
            catch (Exception ex){
                String msg = ex.getMessage();
                System.out.println(msg);
            }
        }
    }
    public void insertStudent(Student s) {
        students.add(s);
    }

    public int getCount(){
       return students.size();
    }

    public boolean isEmpty(){
        return students.isEmpty();
    }

    public double getAvg(){
        if (isEmpty()){
            return 0;
        }
        double sum = 0.0;
        for (Student s : students) {
            double grade = s.getGrade();
            sum = sum + grade;
        }
        int count = getCount();
        double avg = sum / count;
        return avg;
    }

    public void rankByGrade() {
        students.sort(Comparator.comparing(Student::getGrade).reversed());
    }

    public void printData() {
        System.out.println("Lista studentów");
        int i = 1;
        for (Student s : students) {
            System.out.println(i + ". " + s.getName() + " - ocena: " + s.getGrade());
            i++;
        }
        System.out.println();
    }

}
