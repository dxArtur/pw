import java.util.jar.Attributes.Name;

import model.Student;
import model.Teacher;

public abstract class controller{
    Model[] model;
    View view;
    // isso de cima tá errado

    static void addTeacher(String name, String phone, int oldAge, String classroom){
        Teacher tchr = new Teacher(name, phone, oldAge, classroom);
        
    }

    public static void addStudent(String name, String phone, int oldAge, String registration){
        Student stdnt = new Student(name, phone, oldAge, registration);
        
    }

    static void run(){

    }



}
