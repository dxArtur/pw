package model;

public class Student extends Peaple {
    public static Student student;
    protected String registration;
    /**
     * @param name
     * @param phone
     * @param oldAge
     */
    
    public Student() {
        super();
        this.registration = registration;
    }

    public Student(String name, String phone, int oldAge, String registration) {
        super(name, phone, oldAge);
        this.registration= registration;
    
    }

    public String getRegistration(){
        return this.registration;
    }
    public void setRegistration(String registration){
        this.registration = registration;
    }
    public String toString(){
        return super.toString() + ", registration: " + this.registration;
    }
}

