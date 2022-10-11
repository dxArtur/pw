package view;
import java.util.Scanner;

import model.Teacher;

public class viewAddTeacher{

    static Teacher addTeacher(){
        Scanner read = new Scanner(System.in);
        System.out.println("============================"); 
        System.out.println("Please type your name:");
        String name = read.nextLine();
        System.out.println("Please type your phone");
        String Phone = read.nextLine();
        System.out.println("Please type your oldAge:");
        int oldAge = read.nextInt();
        System.out.println("Please type your classroom");
        String classroom = read.nextLine();
        read.close();

        Teacher teacher = new Teacher();
        teacher.setName(name);
        teacher.setPhone(Phone);
        teacher.setOldAge(oldAge);
        teacher.setClassroom(classroom);

        return teacher;
    }
}


