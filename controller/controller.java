package controller;
import java.util.ArrayList;

import model.Student;
import model.Teacher;
import view.View;

public class controller{
    static ArrayList model = new ArrayList<>();
    static View view = new View();
    

    static void addTeacher(String name, String phone, int oldAge, String classroom){
        Teacher tchr = new Teacher(name, phone, oldAge, classroom);
        
    }

    public static void addStudent(String name, String phone, int oldAge, String registration){
        Student stdnt = new Student(name, phone, oldAge, registration);
        
    }

    //static void run(){

    //}



}
