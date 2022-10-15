package model;
public class Teacher extends Peaple {
    protected String classroom;
    /**
     * @param name
     * @param phone
     * @param oldAge
     */
    
     public Teacher(String name, String phone, int oldAge, String classroom){
        super(name, phone, oldAge);
        this.classroom = classroom;
    }

    public Teacher() {
    }

    public String getClassroom(){
        return this.classroom;
    }
<<<<<<< HEAD
    public void setClassroom(String classroom){
=======
    public void setclassroom(String classroom){
>>>>>>> ba19b2898614912b1df781bd9abc3f3a37e4c16c
        this.classroom = classroom;
    }
    public String toString(){
        return super.toString() + ", classroom: " + this.classroom;
    }
    
}
