package view;


import java.util.Scanner;
import model.Student;
import model.Teacher;

public class View {

    public static void clean(){

    }

    public static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

    

    public static void showMenu(){
        showMenu.Menu();
    }

    public static Student viewAddStudent(Student student){
        return student;
    }

    public static Teacher viewAddTeacher(Teacher teacher){
        return teacher;
    }

    static void listPeaple(){

    }

    public static void main(String[] args) {
        
        viewAddStudent.addStudent();
    }

}
