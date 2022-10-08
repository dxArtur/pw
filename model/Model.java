package model;

import java.nio.file.*;


public class Model {
    public static void main(String[] args) {

        
        Path dir = Paths.get("/home/artur/dev/pw1/pw1-2022-2-ac-02-arturleo/model");

        if(Files.isDirectory(dir)){
            System.out.println("Directory exist");
        } else{
            System.out.println("Directory is not be created");
        }

    }
}
