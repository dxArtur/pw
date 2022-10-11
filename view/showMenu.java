package view;
import java.util.Scanner;

public class showMenu{

    static void Menu(){
    
        System.out.println("============================"); 
        System.out.println("Please type your choose:");
        System.out.println("1- Add student");
        System.out.println("2- Add Teacher");
        System.out.println("3- Show peaple");
        System.out.println("0- quit");
        System.out.println("============================"); 
        Scanner read = new Scanner(System.in);
        int choose = read.nextInt();
        
        System.out.println("your choose is: " + choose);
        System.out.println("============================");
        View.clearBuffer(read);
        read.close();
        
        if(choose >= 4){
            showMenu.Menu();
        }else{
            switch(choose){
                case 1:
                System.out.println("ainda nao ta 1");
                viewAddStudent.addStudent();
                break;
    
                case 2:
                System.out.println("ainda nao ta 2");
                //viewAddTeacher.addTeacher();
    
                case 3:
                System.out.println("ainda nao ta pronto");
    
                case 0:
                System.out.println("thanks");
            }
    
        }
        
    }
    


}
