package view;

import java.util.Scanner;

import model.Student;

public class viewAddStudent{

    static Student addStudent(){


        Scanner read = new Scanner(System.in);
        View.clearBuffer(read);
        System.out.println("============================"); 
        System.out.println("Please type your name:");
        String name = read.nextLine();
        System.out.println("Please type your phone");
        String Phone = read.nextLine();
        System.out.println("Please type your oldAge:");
        int oldAge = read.nextInt();
        System.out.println("Please type your registration");
        String registration = read.nextLine();
        read.close();

        Student student = new Student();
        student.setName(name);
        student.setPhone(Phone);
        student.setOldAge(oldAge);
        student.setRegistration(registration);

    return student;
    }
}
